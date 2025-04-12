package com.example.comparador.Controller;

import com.example.comparador.Entity.Bicicleta;
import com.example.comparador.Service.BicicletaService;
import com.example.comparador.Service.BicicletaServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/")
public class BicicletaController {
    private BicicletaService service;

    public BicicletaController(BicicletaServiceImpl serviceImpl) {
        this.service = serviceImpl;
    }

    @GetMapping
    public String findAll(Model model) {
        List<Bicicleta> bicicletas = this.service.findAll();
        model.addAttribute("bicicletas", bicicletas);
        return "index";
    }
    @PostMapping
    public String index() {
        return "index";
    }

    // Ver detalles de una bicicleta específica
    // GET http://localhost:8080/bicicleta/{id}
    @GetMapping("/{id}")
    public String getBicicleta(@PathVariable Long id, Model model, RedirectAttributes redirectAttributes) {
        Optional<Bicicleta> bicicleta = service.findById(id);
        if (bicicleta.isPresent()) {
            model.addAttribute("bicicleta", bicicleta.get());
            return "view";
        } else {
            redirectAttributes.addFlashAttribute("message", "Bicicleta no encontrada");
            redirectAttributes.addFlashAttribute("alert", "warning");
            return "redirect:/bicicleta";
        }
    }

}
