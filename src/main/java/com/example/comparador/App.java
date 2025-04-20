package com.example.comparador;

import com.example.comparador.Data.Datos;
import com.example.comparador.Entity.*;
import com.example.comparador.Entity.ENUM.MaterialCuadro;
import com.example.comparador.Entity.ENUM.TipoBicicleta;
import com.example.comparador.Entity.ENUM.TipoCambio;
import com.example.comparador.Entity.ENUM.TipoComponente;
import com.example.comparador.Repository.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication(scanBasePackages = "com.example.comparador")
public class App {

    public static void main(String[] args) {
        var context = SpringApplication.run(App.class, args);
        var componenteRepository = context.getBean(ComponenteRepository.class);
        var bicicletaRepository = context.getBean(BicicletaRepository.class);
        var bicicletaComponenteRepository = context.getBean(BicicletaComponenteRepository.class);
        Datos datos = new Datos();

        bicicletaRepository.saveAll(datos.bicicletaslist);
        componenteRepository.saveAll(datos.ComponentesList);

        Bicicleta grizl5 = datos.getBicicleta("Grizl 5", "Canyon");

        List<BicicletaComponente> componentesGrizl5 = new ArrayList<>();
        componentesGrizl5.add(new BicicletaComponente(grizl5, datos.getComponente("Canyon Grizl AL", TipoComponente.Cuadro)));
        componentesGrizl5.add(new BicicletaComponente(grizl5, datos.getComponente("Canyon FK0087 CF", TipoComponente.Horquilla)));
        componentesGrizl5.add(new BicicletaComponente(grizl5, datos.getComponente("Shimano GRX RX400", TipoComponente.Frenos)));
        componentesGrizl5.add(new BicicletaComponente(grizl5, datos.getComponente("Shimano GRX RX400", TipoComponente.Cambio_Trasero)));
        componentesGrizl5.add(new BicicletaComponente(grizl5, datos.getComponente("DT Swiss G1800", TipoComponente.Ruedas)));
        bicicletaComponenteRepository.saveAll(componentesGrizl5);
    }
}
