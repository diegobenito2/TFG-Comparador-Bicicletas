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
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication(scanBasePackages = "com.example.comparador")
public class App {

    public static void main(String[] args) {
        var context = SpringApplication.run(App.class, args);
        var componenteRepository = context.getBean(ComponenteRepository.class);
        var bicicletaRepository = context.getBean(BicicletaRepository.class);
        var bicicletaComponenteRepository = context.getBean(BicicletaComponenteRepository.class);

        List<Componente> componentesBerria = List.of(
                new Componente("Belador 6 BR DISC, Racing Geometry BGC ASE, Full carbon UHM3X, Triple monocoque, T47 Bottom Bracket, Full internal cable system ICS2, Headset semi integrado OH2S, Flat Mount System brake, neumático máximo 700x34c, Eje pasante 12x142mm, peso 720gr.", TipoComponente.Cuadro),
                new Componente("Belador Blade 6 BR horquilla de carbono completa, sistema de cableado interno ICS2, compatible con tubo de dirección cónico 1-1/8\" - 1-1/2\", sistema de freno Flat Mount, neumático máximo 700x34c, Eje pasante 12x100mm, peso 350g.", TipoComponente.Horquilla),
                new Componente("Avanforce Airone, Manillar de carretera integral de carbono, sistema de cableado interno completo ICS2, tamaños 380x90 - 400x100 - 420x110 - 420x120, peso: 320gr.", TipoComponente.Manillar),
                new Componente("Belador 6 SP, UD Carbono, offset 0/20 mm, tecnología ISP, peso 90gr.", TipoComponente.Tija_Sillin),
                new Componente("Fizik Vento Argo R1, raíles de carbono 7x9mm, longitud: 265 mm, ancho: 140 mm, peso: 179g.", TipoComponente.Sillin),
                new Componente("Enve SES 4.5, llanta de carbono Hookless, TLR, buje Innerdrive, ancho interno 29mm, altura 49-55mm, Center Lock, peso: 1432gr.", TipoComponente.Ruedas),
                new Componente("Vittoria Corsa PRO, 28-622, plegable, Tubeless Ready, completamente negro, Graphene 2.0.", TipoComponente.Cubiertas),
                new Componente("SRAM RED AXS E1 Shift-Brake System, sistema de cambio electrónico.", TipoComponente.Manetas_Cambio),
                new Componente("SRAM RED AXS E1 12s, sistema de cambio electrónico.", TipoComponente.Cambio_Trasero),
                new Componente("SRAM RED AXS E1, sistema de cambio electrónico.", TipoComponente.Desviador),
                new Componente("SRAM RED AXS E1 POWER METER, juego de bielas 48/35 T CARBONO, tamaños 170-172,5-175.", TipoComponente.Bielas),
                new Componente("CN RED E1 116LINK.", TipoComponente.Cadena),
                new Componente("CS XG 1290 E1 10-36.", TipoComponente.Cassette),
                new Componente("SRAM RED AXS E1, sistema de freno hidráulico Shift-Brake.", TipoComponente.Frenos),
                new Componente("Ceramic Speed SRAM DUB T47 Bottom Bracket.", TipoComponente.Pedalier)
        );
        List<Componente> componentesCanyon = List.of(
                new Componente("Canyon Ultimate CFR - Cuadro de nivel profesional, carbono CFR, eje 12x142 mm, espacio para cubiertas 33MM. Alta rigidez y peso ligero.", TipoComponente.Cuadro),
                new Componente("Canyon FK0108 CFR - Horquilla de carbono superligera, eje 12x100 mm, cubiertas hasta 33MM. Precisión y rigidez optimizadas.", TipoComponente.Horquilla),
                new Componente("Canyon CP0018 Aerocockpit Diseño aerodinámico con paredes de carbono reforzadas para mayor rigidez y mayor durabilidad. Material: Carbono (CF) Peso: 195 g", TipoComponente.Manillar),
                new Componente("Canyon SP0064 - Tija de sillín aerodinámica de carbono con retroceso de 20 mm y peso de 70 g.", TipoComponente.Tija_Sillin),
                new Componente("Selle Italia SLR Boost Tekno Superflow - Máximo peso de ciclista: 100 kg.", TipoComponente.Sillin),
                new Componente("DT Swiss ARC 1100 Dicut db - Llanta de carbono.", TipoComponente.Ruedas),
                new Componente("Schwalbe Pro One TT, 28mm - Rueda 28\", peso 215 g.", TipoComponente.Cubiertas),
                new Componente("Shimano Dura-Ace Di2 R9270, 12-speed - 2 pistones, 332 g.", TipoComponente.Manetas_Cambio),
                new Componente("Shimano Dura-Ace Di2 RD-R9250, 12-speed - Caja larga, 217 g.", TipoComponente.Cambio_Trasero),
                new Componente("Shimano Dura-Ace Di2 FD-R9250 - 96 g.", TipoComponente.Desviador),
                new Componente("Shimano Dura-Ace Di2 R9200 Powermeter - 2 platos.", TipoComponente.Bielas),
                new Componente("Shimano CN-M9100 12s", TipoComponente.Cadena),
                new Componente("Shimano Dura-Ace CS-R9200 - 12 piñones, relación 11-30.", TipoComponente.Cassette),
                new Componente("Shimano Dura-Ace RT-CL900", TipoComponente.Frenos),
                new Componente("Shimano Pressfit BB92 - PF 86,5, 55 g.", TipoComponente.Pedalier)
        );
        List<Bicicleta> bicicletas = List.of(
                new Bicicleta("Oiz M10 TR", new BigDecimal("5499"), TipoBicicleta.MONTAÑA, MaterialCuadro.ALUMINIO, TipoCambio.MECANICO, new BigDecimal("12"), "https://www.orbea.com/img/products/product/over/large/S241TTCC-KT-SIDE-OIZ_MPRO_over.jpg", "https://www.orbea.com/es-es/bicicletas/montana/oiz/cat/oiz-m10", "Orbea")
                ,
                new Bicicleta("Belador BR RED AXS PWM", new BigDecimal("10990"), TipoBicicleta.CARRETERA, MaterialCuadro.CARBONO, TipoCambio.ELECTRONICO, new BigDecimal("6.5"), "https://berriabikes.com/cdn/shop/files/download_14585b77-7ada-40b8-b0a9-e2c7109dda67.jpg?v=1721117600&width=1100", "https://berriabikes.com/products/belador-br-red-axs-pwm?variant=42521808896099", "Berria")
                , new Bicicleta("Mako BR XX-SL", new BigDecimal("11990"), TipoBicicleta.MONTAÑA, MaterialCuadro.CARBONO, TipoCambio.ELECTRONICO, new BigDecimal("8"), "https://berriabikes.com/cdn/shop/files/MAKO_BR_XX-SL_FA_C1_1FRONTAL_NAKEDCARBON-WHITEPEARL.jpg?v=1721125110&width=990", "https://berriabikes.com/products/mako-br-xx-sl", "Berria")
                , new Bicicleta("ALLROAD HPR ELITE APEX", new BigDecimal("1499"), TipoBicicleta.GRAVEL, MaterialCuadro.ALUMINIO, TipoCambio.MECANICO, new BigDecimal("8.33"), "https://berriabikes.com/cdn/shop/files/ALLROAD_HPR_ELITE_APEX_1FRONTAL_bd39722c-0196-4ba1-a50c-9cb3c20bcc1b.jpg?v=1721255333&width=823", "https://berriabikes.com/products/allroad-hpr-elite-apex", "Berria")
                , new Bicicleta("Ultimate CFR Di2 Aero", new BigDecimal("8629"), TipoBicicleta.CARRETERA, MaterialCuadro.CARBONO, TipoCambio.ELECTRONICO, new BigDecimal("6.64"), "https://www.canyon.com/dw/image/v2/BCML_PRD/on/demandware.static/-/Sites-canyon-master/default/dwa0285dac/images/full/full_2023_/2023/full_2023_3564_ultimate-cfr-di2_P04_P5.jpg?sw=1300&sfrm=png&q=90&bgcolor=F2F2F2", "https://www.canyon.com/es-es/bicicletas-de-carretera/bicicletas-carreras/ultimate/cfr/ultimate-cfr-di2-aero/3564.html?dwvar_3564_pv_rahmenfarbe=R102_P04", "Canyon")
        );
        bicicletaRepository.saveAll(bicicletas);
        componenteRepository.saveAll(componentesBerria);
        componenteRepository.saveAll(componentesCanyon);
        List<BicicletaComponente> bicicletaComponentes = new ArrayList<>();
        for (Componente componente : componentesBerria) {
            bicicletaComponentes.add(new BicicletaComponente(bicicletas.get(1), componente));
        }
        for (Componente componente : componentesCanyon) {
            bicicletaComponentes.add(new BicicletaComponente(bicicletas.get(4), componente));
        }
        bicicletaComponenteRepository.saveAll(bicicletaComponentes);
    }
}
