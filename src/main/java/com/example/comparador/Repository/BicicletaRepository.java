package com.example.comparador.Repository;

import com.example.comparador.Entity.Bicicleta;
import com.example.comparador.Entity.ENUM.MaterialCuadro;
import com.example.comparador.Entity.ENUM.TipoBicicleta;
import com.example.comparador.Entity.ENUM.TipoCambio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface BicicletaRepository extends JpaRepository<Bicicleta, Long> {

    //Para ver los detalles de cada modelo de bici y para el comparador.
    Optional<Bicicleta> findById(Long id);

//    //Filtros
//    List<Bicicleta> findBicicletasByTipo(TipoBicicleta tipo);
//
//    List<Bicicleta> findBicicletasByTipoCambio(TipoCambio tipoCambio);
//
//    List<Bicicleta> findBicicletasByMaterialCuadro(MaterialCuadro materialCuadro);
//

    void deleteById(Long id);


}
