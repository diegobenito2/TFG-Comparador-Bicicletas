package com.example.comparador.Service;

import com.example.comparador.Entity.Bicicleta;

import java.util.List;
import java.util.Optional;

public interface BicicletaService {
    List<Bicicleta> findAll();

    Optional<Bicicleta> findById(Long id);

    Bicicleta save(Bicicleta bicicleta);

    void deleteById(Long id);

    List<Bicicleta> findByTipo(String tipoBicicleta);

    List<Bicicleta> findByNombreCompletoContainingIgnoreCase(String marcaymodelo);

}
