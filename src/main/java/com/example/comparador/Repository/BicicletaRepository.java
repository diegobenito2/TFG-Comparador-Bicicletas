package com.example.comparador.Repository;

import com.example.comparador.Entity.Bicicleta;
import com.example.comparador.Entity.ENUM.TipoBicicleta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BicicletaRepository extends JpaRepository<Bicicleta, Long> {

//    Filtros
    List<Bicicleta> findBicicletasByTipo(TipoBicicleta tipo);

    List<Bicicleta> findByNombreCompletoContainingIgnoreCase(String nombreCompleto);

    void deleteById(Long id);
}
