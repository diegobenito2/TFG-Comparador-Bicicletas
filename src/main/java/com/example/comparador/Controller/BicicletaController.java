package com.example.comparador.Controller;

import com.example.comparador.Entity.Bicicleta;
import com.example.comparador.Entity.BicicletaComponente;
import com.example.comparador.Entity.Componente;
import com.example.comparador.Service.BicicletaService;
import com.example.comparador.Service.BicicletaServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
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
        bicicletas.sort(Comparator.comparing(Bicicleta::getPrecio).reversed());
        model.addAttribute("bicicletas", bicicletas);
        return "index";
    }

    @PostMapping
    public String index() {
        return "index";
    }

    // Ver detalles de una bicicleta específica
    // GET http://localhost:8080/{id}
    @GetMapping("/{id}")
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
        bicicletas.sort(Comparator.comparing(Bicicleta::getPrecio).reversed());
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
            resultados.sort(Comparator.comparing(Bicicleta::getPrecio).reversed());
        }
        model.addAttribute("bicicletas", resultados);

        return "search";
    }

    // Comparador de bicicletas
    // GET http://localhost:8080/comparar/{id}
    @GetMapping("/comparar/{id}")
    public String getBicicletaComparador(@PathVariable Long id, Model model, RedirectAttributes redirectAttributes) {
        Optional<Bicicleta> bicicleta = service.findById(id);
        if (bicicleta.isPresent() && !bicicleta.get().getComponentes().isEmpty()) {

            List<Bicicleta> listaBicicletas = service.findByTipo(bicicleta.get().getTipo().toString());
            model.addAttribute("componentesOrdenados", ordenDeseado(bicicleta.get().getTipo().toString()));
            model.addAttribute("componentes", bicicleta.get().getComponentes());
            model.addAttribute("bicicleta", bicicleta.get());
            if (!listaBicicletas.isEmpty()) {
                listaBicicletas.remove(bicicleta.get()); // Elimina de la lista la bici por la que has entrado en el comparador.
                model.addAttribute("bicicletas", listaBicicletas);
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
                        "Frenos", "Disco", "Cambio Trasero", "Desviador", "Cassette",
                        "Cadena", "Bielas", "Plato", "Manillar",
                        "Manetas Cambio", "Tija Sillin", "Sillin", "Bujes", "Pedalier"
                );
                break;
            case "Montaña":
                ordenDeseado = Arrays.asList(
                        "Cuadro", "Horquilla", "Amortiguador", "Ruedas", "Cubiertas",
                        "Frenos", "Disco", "Cambio Trasero", "Cassette",
                        "Cadena", "Bielas", "Plato", "Manillar",
                        "Manetas Cambio", "Tija Sillin", "Sillin", "Bujes", "Pedalier"
                );
                break;
            case "Gravel":
                ordenDeseado = Arrays.asList(
                        "Cuadro", "Horquilla", "Ruedas", "Cubiertas",
                        "Frenos", "Disco", "Cambio Trasero", "Cassette",
                        "Cadena", "Bielas", "Plato", "Manillar",
                        "Manetas Cambio", "Tija Sillin", "Sillin", "Bujes", "Pedalier"
                );
                break;
        }
        return ordenDeseado;
    }


}
