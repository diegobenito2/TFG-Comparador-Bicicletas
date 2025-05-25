package com.example.comparador.Controller;

import com.example.comparador.Entity.Bicicleta;
import com.example.comparador.Entity.BicicletaComparadorDTO;
import com.example.comparador.Entity.ENUM.TipoComponente;
import com.example.comparador.Service.BicicletaService;
import com.example.comparador.Service.BicicletaServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.*;
import java.util.stream.Collectors;

@Controller
public class BicicletaController {
    private BicicletaService service;

    public BicicletaController(BicicletaServiceImpl serviceImpl) {
        this.service = serviceImpl;
    }

    @GetMapping
    public String findAll(Model model) {
        List<Bicicleta> bicicletas = this.service.findAll();
        bicicletas.sort(Comparator.comparing(Bicicleta::getCalificacion).reversed());
        model.addAttribute("bicicletas", bicicletas);
        return "index";
    }

    @PostMapping
    public String index() {
        return "index";
    }

    // Ver detalles de una bicicleta específica
    // GET http://localhost:8080/bike{id}
    @GetMapping("/bike/{id}")
    public String getBicicleta(@PathVariable Long id, Model model, RedirectAttributes redirectAttributes) {
        Optional<Bicicleta> bicicleta = service.findById(id);
        if (bicicleta.isPresent()) {
            model.addAttribute("bicicleta", bicicleta.get());
            return "view";
        } else {
            redirectAttributes.addFlashAttribute("message", "Bicicleta no encontrada");
            redirectAttributes.addFlashAttribute("alert", "warning");
            return "redirect:/";
        }
    }

    // Buscar bicicletas por categoría
    // GET http://localhost:8080/categoria/{tipo}
    @GetMapping("/categoria/{tipo}")
    public String findByTipo(@PathVariable String tipo, Model model) {
        List<Bicicleta> bicicletas = service.findByTipo(tipo);
        bicicletas.sort(Comparator.comparing(Bicicleta::getCalificacion).reversed());
        model.addAttribute("bicicletas", bicicletas);
        return "index";
    }

    // Buscar bicicletas por marcaymodelo
    // GET http://localhost:8080/search
    @GetMapping("/search")
    public String search(@RequestParam String marcaymodelo, Model model) {


        List<Bicicleta> resultados = List.of();
        resultados = service.findByNombreCompletoContainingIgnoreCase(marcaymodelo);


        if (resultados.isEmpty()) {
            model.addAttribute("mensaje", "No hay bicicletas con la búsqueda: " + marcaymodelo);
        } else {
            resultados.sort(Comparator.comparing(Bicicleta::getCalificacion).reversed());
        }
        model.addAttribute("bicicletas", resultados);

        return "search";
    }

    // Comparador de bicicletas
    // GET http://localhost:8080/comparar/{id}
    @GetMapping("/comparar/{id}")
    public String getBicicletaComparador(@PathVariable Long id, Model model, RedirectAttributes redirectAttributes) throws JsonProcessingException {
        Optional<Bicicleta> bicicleta = service.findById(id);
        if (bicicleta.isPresent() && !bicicleta.get().getComponentes().isEmpty()) { //Comprueba que la bicicleta existe

            List<Bicicleta> listaBicicletas = service.findByTipo(bicicleta.get().getTipo().toString()); // Saca una lista de bicicletas de ese mismo tipo
            model.addAttribute("componentesOrdenados", ordenDeseado(bicicleta.get().getTipo().toString())); // Obtiene el orden de los componentes

            model.addAttribute("componentes", bicicleta.get().getComponentes()); //Obtiene los componentes de la primera bicicleta

            model.addAttribute("bicicleta", bicicleta.get());


            if (!listaBicicletas.isEmpty()) {
                listaBicicletas.remove(bicicleta.get()); // Elimina de la lista la bici con la que has entrado en el comparador.
                model.addAttribute("bicicletas", listaBicicletas);
                //Orden alfabeticamente para los selects
                listaBicicletas.sort(Comparator.comparing(Bicicleta::getNombreCompleto, String.CASE_INSENSITIVE_ORDER));

                // Código para poder tener acceso a las bicicletas desde el JS para los selects.

                List<BicicletaComparadorDTO> bicicletaDTOs = listaBicicletas.stream()
                        .map(BicicletaComparadorDTO::new)
                        .collect(Collectors.toList());
                ObjectMapper mapper = new ObjectMapper();
                String bicicletasJson = mapper.writeValueAsString(bicicletaDTOs);
                model.addAttribute("bicicletasJson", bicicletasJson);  // Se serializa automáticamente con th:inline="javascript"
            }

            return "comparador";
        } else {
            redirectAttributes.addFlashAttribute("message", "Bicicleta no encontrada");
            redirectAttributes.addFlashAttribute("alert", "warning");
            return "redirect:/";
        }
    }

    public static List<String> ordenDeseado(String tipoBicicleta) {
        List<String> ordenDeseado = null;
        switch (tipoBicicleta) {
            case "Carretera":
                ordenDeseado = Arrays.asList(
                        "Cuadro", "Horquilla", "Ruedas", "Cubiertas",
                        "Frenos", "Cambio Trasero", "Desviador", "Cassette",
                        "Cadena", "Bielas", "Manillar",
                        "Manetas Cambio", "Tija Sillin", "Sillin"
                );
                break;
            case "Montaña":
                ordenDeseado = Arrays.asList(
                        "Cuadro", "Horquilla", "Amortiguador", "Ruedas", "Cubiertas",
                        "Frenos", "Cambio Trasero", "Cassette",
                        "Cadena", "Bielas", "Manillar",
                        "Manetas Cambio", "Tija Sillin", "Sillin"
                );
                break;
            case "Gravel":
                ordenDeseado = Arrays.asList(
                        "Cuadro", "Horquilla", "Ruedas", "Cubiertas",
                        "Frenos", "Cambio Trasero", "Cassette",
                        "Cadena", "Bielas", "Manillar",
                        "Manetas Cambio", "Tija Sillin", "Sillin"
                );
                break;
        }
        return ordenDeseado;
    }


}
