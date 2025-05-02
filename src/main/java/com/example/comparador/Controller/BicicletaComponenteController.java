package com.example.comparador.Controller;


import com.example.comparador.Service.BicicletaComponenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bicicleta-componente")
public class BicicletaComponenteController {

    @Autowired
    private BicicletaComponenteService service;

}

