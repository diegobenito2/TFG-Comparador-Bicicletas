package com.example.comparador;

import com.example.comparador.Entity.*;
import com.example.comparador.Entity.ENUM.MaterialCuadro;
import com.example.comparador.Entity.ENUM.TipoBicicleta;
import com.example.comparador.Entity.ENUM.TipoCambio;
import com.example.comparador.Entity.ENUM.TipoComponente;
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
//        var bicicletaComponenteRepository= context.getBean(Bicicleta_ComponenteRepository.class);
        List<Bicicleta> bicicletas = List.of(
                new Bicicleta("Oiz M10 TR", new BigDecimal("5499"), TipoBicicleta.MONTAÑA, MaterialCuadro.ALUMINIO, TipoCambio.MECANICO, new BigDecimal("12"), "https://www.orbea.com/img/products/product/over/large/S241TTCC-KT-SIDE-OIZ_MPRO_over.jpg", "https://www.orbea.com/es-es/bicicletas/montana/oiz/cat/oiz-m10", "Orbea")
                , new Bicicleta("Scalpel Carbon 2", new BigDecimal("5299"), TipoBicicleta.MONTAÑA, MaterialCuadro.CARBONO, TipoCambio.MECANICO, new BigDecimal("12"), "https://embed.widencdn.net/img/dorelrl/rmhoza7v2v/1100px@1x/C23_C24301M_Scalpel_Crb_2_SNB_PD.webp?color=F6F6F6&q=99", "https://www.cannondale.com/es-es/bikes/mountain/cross-country/scalpel/scalpel-carbon-2", "Cannondale"),
                new Bicicleta("Belador BR RED AXS PWM", new BigDecimal("10990"), TipoBicicleta.CARRETERA, MaterialCuadro.CARBONO, TipoCambio.ELECTRONICO, new BigDecimal("6.5"), "https://berriabikes.com/cdn/shop/files/download_14585b77-7ada-40b8-b0a9-e2c7109dda67.jpg?v=1721117600&width=1100", "https://berriabikes.com/products/belador-br-red-axs-pwm?variant=42521808896099", "Berria")
                , new Bicicleta("Mako BR XX-SL", new BigDecimal("11990"), TipoBicicleta.MONTAÑA, MaterialCuadro.CARBONO, TipoCambio.ELECTRONICO, new BigDecimal("8"), "https://berriabikes.com/cdn/shop/files/MAKO_BR_XX-SL_FA_C1_1FRONTAL_NAKEDCARBON-WHITEPEARL.jpg?v=1721125110&width=990", "https://berriabikes.com/products/mako-br-xx-sl", "Berria")
                , new Bicicleta("ALLROAD HPR ELITE APEX", new BigDecimal("1499"), TipoBicicleta.GRAVEL, MaterialCuadro.ALUMINIO, TipoCambio.MECANICO, new BigDecimal("8.33"), "https://berriabikes.com/cdn/shop/files/ALLROAD_HPR_ELITE_APEX_1FRONTAL_bd39722c-0196-4ba1-a50c-9cb3c20bcc1b.jpg?v=1721255333&width=823", "https://berriabikes.com/products/allroad-hpr-elite-apex", "Berria")
        );
        bicicletaRepository.saveAll(bicicletas);
//        List<Componente> componentes = List.of(
//                new Componente("Belador 6 BR DISC, Racing Geometry BGC Aero Shape Efficiency (ASE), Full carbon UHM3X, Triple monocoque, T47 Bottom Bracket, Full internal cable system ICS2, Headset semi integrado OH2S 1-1/2\"- 1-1/2\", Flat Mount System brake, neumático máximo 700x34c, Eje pasante 12x142mm, peso 720gr.", TipoComponente.Cuadro),
//                new Componente("Belador Blade 6 BR horquilla de carbono completa, sistema de cableado interno ICS2, compatible con tubo de dirección cónico 1-1/8\" - 1-1/2\", sistema de freno Flat Mount, neumático máximo 700x34c, Eje pasante 12x100mm, peso 350g.", TipoComponente.Horquilla),
//                new Componente("Avanforce Airone, Manillar de carretera integral de carbono, sistema de cableado interno completo ICS2, tamaños 380x90 - 400x100 - 420x110 - 420x120, peso: 320gr.", TipoComponente.Manillar),
//                new Componente("Belador 6 SP, UD Carbono, offset 0/20 mm, tecnología ISP, peso 90gr.", TipoComponente.TijaSillin),
//                new Componente("Fizik Vento Argo R1, raíles de carbono 7x9mm, longitud: 265 mm, ancho: 140 mm, peso: 179g.", TipoComponente.Sillin),
//                new Componente("Enve SES 4.5, llanta de carbono Hookless, TLR, buje Innerdrive, ancho interno 29mm, altura 49-55mm, Center Lock, peso: 1432gr.", TipoComponente.Ruedas),
//                new Componente("Vittoria Corsa PRO, 28-622, plegable, Tubeless Ready, completamente negro, Graphene 2.0.", TipoComponente.Cubiertas),
//                new Componente("SRAM RED AXS E1 Shift-Brake System, sistema de cambio electrónico.", TipoComponente.ManetasCambio),
//                new Componente("SRAM RED AXS E1 12s, sistema de cambio electrónico.", TipoComponente.CambioTrasero),
//                new Componente("SRAM RED AXS E1, sistema de cambio electrónico.", TipoComponente.Desviador),
//                new Componente("SRAM RED AXS E1 POWER METER, juego de bielas 48/35 T CARBONO, tamaños 170-172,5-175.", TipoComponente.Bielas),
//                new Componente("CN RED E1 116LINK.", TipoComponente.Cadena),
//                new Componente("CS XG 1290 E1 10-36.", TipoComponente.Cassette),
//                new Componente("SRAM RED AXS E1, sistema de freno hidráulico Shift-Brake.", TipoComponente.Frenos),
//                new Componente("Ceramic Speed SRAM DUB T47 Bottom Bracket.", TipoComponente.Pedalier)
//        );
//        componenteRepository.saveAll(componentes);
//        List<Bicicleta_Componente> bicicleta_componentes = List.of(
//                new Bicicleta_Componente(bicicletas.get(2), componentes.get(0)),
//                new Bicicleta_Componente(bicicletas.get(2), componentes.get(1)),
//                new Bicicleta_Componente(bicicletas.get(2), componentes.get(2)),
//                new Bicicleta_Componente(bicicletas.get(2), componentes.get(3)),
//                new Bicicleta_Componente(bicicletas.get(2), componentes.get(4)),
//                new Bicicleta_Componente(bicicletas.get(2), componentes.get(5)),
//                new Bicicleta_Componente(bicicletas.get(2), componentes.get(6)),
//                new Bicicleta_Componente(bicicletas.get(2), componentes.get(7)),
//                new Bicicleta_Componente(bicicletas.get(2), componentes.get(8)),
//                new Bicicleta_Componente(bicicletas.get(2), componentes.get(9)),
//                new Bicicleta_Componente(bicicletas.get(2), componentes.get(10)),
//                new Bicicleta_Componente(bicicletas.get(2), componentes.get(11)),
//                new Bicicleta_Componente(bicicletas.get(2), componentes.get(12)),
//                new Bicicleta_Componente(bicicletas.get(2), componentes.get(13))
//        );
//        bicicletaComponenteRepository.saveAll(bicicleta_componentes);
    }
}
