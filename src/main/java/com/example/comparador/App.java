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
            new Bicicleta("Oiz M10 TR",new BigDecimal("5499"), TipoBicicleta.MONTAÑA, MaterialCuadro.ALUMINIO, TipoCambio.MECANICO,new BigDecimal("12"),"https://www.orbea.com/img/products/product/over/large/S241TTCC-KT-SIDE-OIZ_MPRO_over.jpg","https://www.orbea.com/es-es/bicicletas/montana/oiz/cat/oiz-m10","Orbea")
            , new Bicicleta("Scalpel Carbon 2",new BigDecimal("5299"),TipoBicicleta.MONTAÑA,MaterialCuadro.CARBONO,TipoCambio.MECANICO,new BigDecimal("12"),"https://embed.widencdn.net/img/dorelrl/rmhoza7v2v/1100px@1x/C23_C24301M_Scalpel_Crb_2_SNB_PD.webp?color=F6F6F6&q=99","https://www.cannondale.com/es-es/bikes/mountain/cross-country/scalpel/scalpel-carbon-2","Cannondale"),
            new Bicicleta("Belador BR RED AXS PWM",new BigDecimal("10990"),TipoBicicleta.CARRETERA,MaterialCuadro.CARBONO,TipoCambio.ELECTRONICO,new BigDecimal("6.5"),"https://berriabikes.com/cdn/shop/files/download_14585b77-7ada-40b8-b0a9-e2c7109dda67.jpg?v=1721117600&width=1100","https://berriabikes.com/products/belador-br-red-axs-pwm?variant=42521808896099","Berria")
            ,new Bicicleta("Mako BR XX-SL",new BigDecimal("11990"),TipoBicicleta.MONTAÑA,MaterialCuadro.CARBONO,TipoCambio.ELECTRONICO,new BigDecimal("8"),"https://berriabikes.com/cdn/shop/files/MAKO_BR_XX-SL_FA_C1_1FRONTAL_NAKEDCARBON-WHITEPEARL.jpg?v=1721125110&width=990","https://berriabikes.com/products/mako-br-xx-sl","Berria")
            ,new Bicicleta("ALLROAD HPR ELITE APEX",new BigDecimal("1499"),TipoBicicleta.GRAVEL,MaterialCuadro.ALUMINIO,TipoCambio.MECANICO,new BigDecimal("8.33"),"https://berriabikes.com/cdn/shop/files/ALLROAD_HPR_ELITE_APEX_1FRONTAL_bd39722c-0196-4ba1-a50c-9cb3c20bcc1b.jpg?v=1721255333&width=823","https://berriabikes.com/products/allroad-hpr-elite-apex","Berria")
        );
        bicicletaRepository.saveAll(bicicletas);
        List<Componente> componentes = List.of(

        );
        componenteRepository.saveAll(componentes);

    }
}
