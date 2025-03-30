package com.example.comparador.Service;

import com.example.comparador.Entity.Bicicleta;
import com.example.comparador.Entity.ENUM.TipoBicicleta;
import com.example.comparador.Repository.BicicletaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
@Service
public class BicicletaServiceImpl implements BicicletaService {

    private final BicicletaRepository repository;

    public BicicletaServiceImpl(BicicletaRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Bicicleta> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Optional<Bicicleta> findById(Long id) {
        return this.repository.findById(id);
    }

    @Override
    public Bicicleta save(Bicicleta bicicleta) {
        Objects.requireNonNull(bicicleta);
        this.repository.save(bicicleta);
        return bicicleta;
    }

    @Override
    public void deleteById(Long id) {
        Objects.requireNonNull(id);
        this.repository.deleteById(id);

    }

//    @Override
//    public List<Bicicleta> findByTipo(TipoBicicleta tipoBicicleta) {
//        Objects.requireNonNull(tipoBicicleta);
//        return this.repository.findBicicletasByTipo(tipoBicicleta);
//    }


}
