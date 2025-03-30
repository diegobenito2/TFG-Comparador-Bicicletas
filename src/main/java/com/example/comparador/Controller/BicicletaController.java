package com.example.comparador.Controller;

import com.example.comparador.Entity.Bicicleta;
import com.example.comparador.Service.BicicletaService;
import com.example.comparador.Service.BicicletaServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

}
