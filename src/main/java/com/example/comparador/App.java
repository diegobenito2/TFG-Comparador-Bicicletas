package com.example.comparador;

import com.example.comparador.Entity.*;
import com.example.comparador.Entity.ENUM.MaterialCuadro;
import com.example.comparador.Entity.ENUM.TipoBicicleta;
import com.example.comparador.Entity.ENUM.TipoCambio;
import com.example.comparador.Repository.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.List;

@SpringBootApplication(scanBasePackages = "com.example.comparador")
public class App {

    public static void main(String[] args) {
        var context = SpringApplication.run(App.class, args);
        var componenteRepository = context.getBean(ComponenteRepository.class);
        var bicicletaRepository = context.getBean(BicicletaRepository.class);
        List<Bicicleta> bicicletas = List.of(
            new Bicicleta("Orbea Oiz M10 TR",new BigDecimal("5499.00"), TipoBicicleta.MONTAÑA, MaterialCuadro.ALUMINIO, TipoCambio.MECANICO,new BigDecimal("1200.00"),"https://www.orbea.com/img/products/product/over/large/S241TTCC-KT-SIDE-OIZ_MPRO_over.jpg","https://www.orbea.com/es-es/bicicletas/montana/oiz/cat/oiz-m10","Orbea")
        );
        bicicletaRepository.saveAll(bicicletas);
        List<Componente> componentes = List.of(

        );
        componenteRepository.saveAll(componentes);

    }
}
