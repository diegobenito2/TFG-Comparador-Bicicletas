package com.example.comparador.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BicicletaController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

}
