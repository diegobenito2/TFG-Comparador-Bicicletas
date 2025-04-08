package com.example.comparador.Repository;

import com.example.comparador.Entity.Bicicleta;
import com.example.comparador.Entity.BicicletaComponente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BicicletaComponenteRepository extends JpaRepository<BicicletaComponente, Long> {



}
