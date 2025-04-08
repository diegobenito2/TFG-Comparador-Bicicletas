package com.example.comparador.Service;


import com.example.comparador.Repository.BicicletaComponenteRepository;
import com.example.comparador.Repository.BicicletaRepository;
import com.example.comparador.Repository.ComponenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BicicletaComponenteService {

    @Autowired
    private BicicletaRepository bicicletaRepository;

    @Autowired
    private ComponenteRepository componenteRepository;

    @Autowired
    private BicicletaComponenteRepository bicicletaComponenteRepository;


}

