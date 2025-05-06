package com.example.comparador.Controller;

import com.example.comparador.Entity.Bicicleta;
import com.example.comparador.Service.BicicletaService;
import com.example.comparador.Service.BicicletaServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

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
        }else{
            resultados.sort(Comparator.comparing(Bicicleta::getPrecio).reversed());
        }
        model.addAttribute("bicicletas", resultados);

        return "search";
    }
}
