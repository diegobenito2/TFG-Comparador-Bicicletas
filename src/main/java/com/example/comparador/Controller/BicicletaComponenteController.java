package com.example.comparador.Controller;


import com.example.comparador.Service.BicicletaComponenteService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/bicicleta-componente")
public class BicicletaComponenteController {


    private BicicletaComponenteService service;
    public BicicletaComponenteController(BicicletaComponenteService service) {
        this.service = service;
    }



}

