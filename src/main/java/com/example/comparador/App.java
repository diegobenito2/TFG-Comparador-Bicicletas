package com.example.comparador;

import com.example.comparador.Data.Datos;
import com.example.comparador.Entity.*;
import com.example.comparador.Entity.ENUM.TipoComponente;
import com.example.comparador.Repository.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
        //Carga de todas las Bicicletas
        bicicletaRepository.saveAll(datos.bicicletaslist);
        //Carga de todos los Componentes
        componenteRepository.saveAll(datos.ComponentesList);

        // Relación de los componentes con las bicicletas

        // Canyon Grizl 5
        Bicicleta grizl5 = datos.getBicicleta("Grizl 5", "Canyon");

        List<BicicletaComponente> componentesGrizl5 = new ArrayList<>();
        componentesGrizl5.add(new BicicletaComponente(grizl5, datos.getComponente("Canyon Grizl AL", TipoComponente.Cuadro)));
        componentesGrizl5.add(new BicicletaComponente(grizl5, datos.getComponente("Canyon FK0087 CF", TipoComponente.Horquilla)));
        componentesGrizl5.add(new BicicletaComponente(grizl5, datos.getComponente("Shimano GRX RX400", TipoComponente.Frenos)));
        componentesGrizl5.add(new BicicletaComponente(grizl5, datos.getComponente("Shimano GRX RX400", TipoComponente.Cambio_Trasero)));
        componentesGrizl5.add(new BicicletaComponente(grizl5, datos.getComponente("DT Swiss G1800", TipoComponente.Ruedas)));
        componentesGrizl5.add(new BicicletaComponente(grizl5, datos.getComponente("Canyon CP07 Gravelcockpit CF", TipoComponente.Manillar)));
        componentesGrizl5.add(new BicicletaComponente(grizl5, datos.getComponente("Shimano CN-M9100 12s", TipoComponente.Cadena)));
        componentesGrizl5.add(new BicicletaComponente(grizl5, datos.getComponente("Ceramic Speed SRAM DUB T47 Bottom Bracket.", TipoComponente.Pedalier)));
        componentesGrizl5.add(new BicicletaComponente(grizl5, datos.getComponente("SRAM APEX D1 AL DUB WIDE Crankset, 44T, 170-172,5-175", TipoComponente.Bielas)));
        componentesGrizl5.add(new BicicletaComponente(grizl5, datos.getComponente("Shimano Dura-Ace CS-R9200 - 12 piñones, relación 11-30.", TipoComponente.Cassette)));
        componentesGrizl5.add(new BicicletaComponente(grizl5, datos.getComponente("Canyon SP0064 - Tija de sillín aerodinámica de carbono con retroceso de 20 mm y peso de 70 g.", TipoComponente.Tija_Sillin)));
        componentesGrizl5.add(new BicicletaComponente(grizl5, datos.getComponente("Fizik Antares R3", TipoComponente.Sillin)));
        bicicletaComponenteRepository.saveAll(componentesGrizl5);

        // Canyon Ultimate CFR Di2 Aero
        Bicicleta ultimateCfrDi2Aero = datos.getBicicleta("Ultimate CFR Di2 Aero", "Canyon");
        List<BicicletaComponente> componentesUltimateCfrDi2Aero = new ArrayList<>();
        componentesUltimateCfrDi2Aero.add(new BicicletaComponente(ultimateCfrDi2Aero, datos.getComponente("Canyon Ultimate CFR", TipoComponente.Cuadro)));
        componentesUltimateCfrDi2Aero.add(new BicicletaComponente(ultimateCfrDi2Aero, datos.getComponente("Canyon FK0108 CFR", TipoComponente.Horquilla)));
        componentesUltimateCfrDi2Aero.add(new BicicletaComponente(ultimateCfrDi2Aero, datos.getComponente("Shimano Dura-Ace Di2 R9270", TipoComponente.Frenos)));
        componentesUltimateCfrDi2Aero.add(new BicicletaComponente(ultimateCfrDi2Aero, datos.getComponente("Shimano Dura-Ace Di2", TipoComponente.Cambio_Trasero)));
        componentesUltimateCfrDi2Aero.add(new BicicletaComponente(ultimateCfrDi2Aero, datos.getComponente("DT Swiss ARC 1100", TipoComponente.Ruedas)));
        componentesUltimateCfrDi2Aero.add(new BicicletaComponente(ultimateCfrDi2Aero, datos.getComponente("Canyon CP0018", TipoComponente.Manillar)));
        componentesUltimateCfrDi2Aero.add(new BicicletaComponente(ultimateCfrDi2Aero, datos.getComponente("Shimano CN-M9100 12s", TipoComponente.Cadena)));
        componentesUltimateCfrDi2Aero.add(new BicicletaComponente(ultimateCfrDi2Aero, datos.getComponente("Shimano Dura-Ace RT-CL900", TipoComponente.Disco)));
        componentesUltimateCfrDi2Aero.add(new BicicletaComponente(ultimateCfrDi2Aero, datos.getComponente("Shimano Dura-Ace Di2", TipoComponente.Bielas)));
        componentesUltimateCfrDi2Aero.add(new BicicletaComponente(ultimateCfrDi2Aero, datos.getComponente("Shimano Dura-Ace", TipoComponente.Cassette)));
        componentesUltimateCfrDi2Aero.add(new BicicletaComponente(ultimateCfrDi2Aero, datos.getComponente("Canyon SP0064", TipoComponente.Tija_Sillin)));
        componentesUltimateCfrDi2Aero.add(new BicicletaComponente(ultimateCfrDi2Aero, datos.getComponente("Selle Italia SLR", TipoComponente.Sillin)));
        componentesUltimateCfrDi2Aero.add(new BicicletaComponente(ultimateCfrDi2Aero, datos.getComponente("Shimano Dura-Ace Di2 R9270, 12-speed - 2 pistones, 332 g.", TipoComponente.Manetas_Cambio)));
        componentesUltimateCfrDi2Aero.add(new BicicletaComponente(ultimateCfrDi2Aero, datos.getComponente("Shimano Dura-Ace Di2 ", TipoComponente.Desviador)));
        bicicletaComponenteRepository.saveAll(componentesUltimateCfrDi2Aero);

        // Asociaciones para Orbea Alma H20
        Bicicleta almaH20 = datos.getBicicleta("Alma H20", "Orbea");
        List<BicicletaComponente> componentesAlmaH20 = new ArrayList<>();

        componentesAlmaH20.add(new BicicletaComponente(almaH20, datos.getComponente("Orbea Alma Hydro Alloy, Boost 12x148, BSA BB, Internal cable routing", TipoComponente.Cuadro)));
        componentesAlmaH20.add(new BicicletaComponente(almaH20, datos.getComponente("RockShox Judy Silver TK Remote Solo Air 100 15x110 Boost", TipoComponente.Horquilla)));
        componentesAlmaH20.add(new BicicletaComponente(almaH20, datos.getComponente("Shimano MT511 32t", TipoComponente.Bielas)));
        componentesAlmaH20.add(new BicicletaComponente(almaH20, datos.getComponente("Shimano Deore M6100", TipoComponente.Manetas_Cambio)));
        componentesAlmaH20.add(new BicicletaComponente(almaH20, datos.getComponente("Shimano CS-M6100 10-51t 12-Speed", TipoComponente.Cassette)));
        componentesAlmaH20.add(new BicicletaComponente(almaH20, datos.getComponente("Shimano SLX M7100 SGS Shadow Plus", TipoComponente.Cambio_Trasero)));
        componentesAlmaH20.add(new BicicletaComponente(almaH20, datos.getComponente("Shimano M6100", TipoComponente.Cadena)));
        componentesAlmaH20.add(new BicicletaComponente(almaH20, datos.getComponente("Alloy, 31.8mm, Flat, 740mm, Sweep 9", TipoComponente.Manillar)));
        componentesAlmaH20.add(new BicicletaComponente(almaH20, datos.getComponente("Shimano MT201 Hydraulic Disc", TipoComponente.Frenos)));
        componentesAlmaH20.add(new BicicletaComponente(almaH20, datos.getComponente("Alloy, Tubeless, 25c, 32H", TipoComponente.Ruedas)));
        componentesAlmaH20.add(new BicicletaComponente(almaH20, datos.getComponente("Maxxis Rekon Race 2.35\" 120 TPI Exo TLR", TipoComponente.Cubiertas)));
        componentesAlmaH20.add(new BicicletaComponente(almaH20, datos.getComponente("SP01, Alloy, forged head, 27.2mm, Setback 0", TipoComponente.Tija_Sillin)));
        componentesAlmaH20.add(new BicicletaComponente(almaH20, datos.getComponente("Selle Italia Model X FecAlloy Rail 145x248mm", TipoComponente.Sillin)));

        bicicletaComponenteRepository.saveAll(componentesAlmaH20);


        // Asociaciones para Orbea Alma M50
        Bicicleta almaM50 = datos.getBicicleta("Alma M50", "Orbea");
        List<BicicletaComponente> componentesAlmaM50 = new ArrayList<>();
        componentesAlmaM50.add(new BicicletaComponente(almaM50, datos.getComponente("Orbea Alma Carbon, Boost 12x148, Internal cable routing", TipoComponente.Cuadro)));
        componentesAlmaM50.add(new BicicletaComponente(almaM50, datos.getComponente("RockShox Judy Silver TK 110 Remote 15x110 Boost", TipoComponente.Horquilla)));
        componentesAlmaM50.add(new BicicletaComponente(almaM50, datos.getComponente("Shimano MT512 32t", TipoComponente.Bielas)));
        componentesAlmaM50.add(new BicicletaComponente(almaM50, datos.getComponente("Shimano Deore M6100", TipoComponente.Manetas_Cambio)));
        componentesAlmaM50.add(new BicicletaComponente(almaM50, datos.getComponente("Shimano CS-M6100 10-51t 12-Speed", TipoComponente.Cassette)));
        componentesAlmaM50.add(new BicicletaComponente(almaM50, datos.getComponente("Shimano Deore M6100 SGS Shadow Plus", TipoComponente.Cambio_Trasero)));
        componentesAlmaM50.add(new BicicletaComponente(almaM50, datos.getComponente("Shimano M6100", TipoComponente.Cadena)));
        componentesAlmaM50.add(new BicicletaComponente(almaM50, datos.getComponente("Alloy, 31.8mm, Flat, 740mm, Sweep 9", TipoComponente.Manillar)));
        componentesAlmaM50.add(new BicicletaComponente(almaM50, datos.getComponente("Shimano MT201 Hydraulic Disc", TipoComponente.Frenos)));
        componentesAlmaM50.add(new BicicletaComponente(almaM50, datos.getComponente("Alloy, 30c, 28H, TLR", TipoComponente.Ruedas)));
        componentesAlmaM50.add(new BicicletaComponente(almaM50, datos.getComponente("Pirelli Scorpion Sport XC H 2.40\" 60TPI ProWall/TLR", TipoComponente.Cubiertas)));
        componentesAlmaM50.add(new BicicletaComponente(almaM50, datos.getComponente("SP04, Alloy, forged head, 31,6mm, Setback 0", TipoComponente.Tija_Sillin)));
        componentesAlmaM50.add(new BicicletaComponente(almaM50, datos.getComponente("Selle Italia Model X FecAlloy Rail 145x248mm", TipoComponente.Sillin)));
        bicicletaComponenteRepository.saveAll(componentesAlmaM50);


        // Asociaciones para Orbea Alma M LTD
        Bicicleta almaMLTD = datos.getBicicleta("Alma M LTD", "Orbea");
        List<BicicletaComponente> componentesAlmaMLTD = new ArrayList<>();
        componentesAlmaMLTD.add(new BicicletaComponente(almaMLTD, datos.getComponente("Orbea Alma Carbon, Boost 12x148, Internal cable routing", TipoComponente.Cuadro)));
        componentesAlmaMLTD.add(new BicicletaComponente(almaMLTD, datos.getComponente("RockShox SID SL Ultimate 110 DebonAir+ RL 3-Position 15X110", TipoComponente.Horquilla)));
        componentesAlmaMLTD.add(new BicicletaComponente(almaMLTD, datos.getComponente("SRAM XX SL Eagle AXS Transmission", TipoComponente.Cambio_Trasero)));
        componentesAlmaMLTD.add(new BicicletaComponente(almaMLTD, datos.getComponente("SRAM AXS POD Rocker", TipoComponente.Manetas_Cambio)));
        componentesAlmaMLTD.add(new BicicletaComponente(almaMLTD, datos.getComponente("SRAM XS-1299 Eagle Transmission", TipoComponente.Cassette)));
        componentesAlmaMLTD.add(new BicicletaComponente(almaMLTD, datos.getComponente("SRAM XX Eagle Carbon DUB, 34T", TipoComponente.Bielas)));
        componentesAlmaMLTD.add(new BicicletaComponente(almaMLTD, datos.getComponente("SRAM Level Ultimate", TipoComponente.Frenos)));
        componentesAlmaMLTD.add(new BicicletaComponente(almaMLTD, datos.getComponente("Sram XX-SL Eagle 12-Speed", TipoComponente.Cadena)));
        componentesAlmaMLTD.add(new BicicletaComponente(almaMLTD, datos.getComponente("OC Mountain Performance MP10 Carbon, Cockpit, Width 760", TipoComponente.Manillar)));
        componentesAlmaMLTD.add(new BicicletaComponente(almaMLTD, datos.getComponente("Oquo Mountain Performance MP30LTD", TipoComponente.Ruedas)));
        componentesAlmaMLTD.add(new BicicletaComponente(almaMLTD, datos.getComponente("Pirelli Scorpion XC RC 2.40\" 120TPI ProWall/TLR", TipoComponente.Cubiertas)));
        componentesAlmaMLTD.add(new BicicletaComponente(almaMLTD, datos.getComponente("OC Performance XP10 Carbon Seatpost, 31,6mm, Setback 0", TipoComponente.Tija_Sillin)));
        componentesAlmaMLTD.add(new BicicletaComponente(almaMLTD, datos.getComponente("Prologo Nago R4 carbon rails size 137mm", TipoComponente.Sillin)));
        bicicletaComponenteRepository.saveAll(componentesAlmaMLTD);


        // Asociaciones para Orbea Orca M30
        Bicicleta orcaM30 = datos.getBicicleta("Orca M30", "Orbea");
        List<BicicletaComponente> componentesOrcaM30 = new ArrayList<>();
        componentesOrcaM30.add(new BicicletaComponente(orcaM30, datos.getComponente("Orbea Orca carbon OMR 2024", TipoComponente.Cuadro)));
        componentesOrcaM30.add(new BicicletaComponente(orcaM30, datos.getComponente("Orbea Orca OMR ICR 2024", TipoComponente.Horquilla)));
        componentesOrcaM30.add(new BicicletaComponente(orcaM30, datos.getComponente("Shimano 105 R7100 50/34t", TipoComponente.Bielas)));
        componentesOrcaM30.add(new BicicletaComponente(orcaM30, datos.getComponente("Shimano R7120", TipoComponente.Manetas_Cambio)));
        componentesOrcaM30.add(new BicicletaComponente(orcaM30, datos.getComponente("Shimano 105 R7100 11-34t", TipoComponente.Cassette)));
        componentesOrcaM30.add(new BicicletaComponente(orcaM30, datos.getComponente("Shimano 105 R7100", TipoComponente.Cambio_Trasero)));
        componentesOrcaM30.add(new BicicletaComponente(orcaM30, datos.getComponente("Shimano 105 R7100", TipoComponente.Desviador)));
        componentesOrcaM30.add(new BicicletaComponente(orcaM30, datos.getComponente("Shimano M6100", TipoComponente.Cadena)));
        componentesOrcaM30.add(new BicicletaComponente(orcaM30, datos.getComponente("OC Road Performance RP31-R", TipoComponente.Manillar)));
        componentesOrcaM30.add(new BicicletaComponente(orcaM30, datos.getComponente("Shimano R7170 Hydraulic Disc", TipoComponente.Frenos)));
        componentesOrcaM30.add(new BicicletaComponente(orcaM30, datos.getComponente("Alloy, Tubeless, 700c, 19c, 28H", TipoComponente.Ruedas)));
        componentesOrcaM30.add(new BicicletaComponente(orcaM30, datos.getComponente("Vittoria Zafiro V Rigid bead 700x28c", TipoComponente.Cubiertas)));
        componentesOrcaM30.add(new BicicletaComponente(orcaM30, datos.getComponente("Orbea Thru Axle 12x100mm M12x2 P1 Hollow", TipoComponente.Bujes)));
        componentesOrcaM30.add(new BicicletaComponente(orcaM30, datos.getComponente("Orbea Thru Axle 12x142mm M12x2 P1 Hollow", TipoComponente.Bujes)));
        componentesOrcaM30.add(new BicicletaComponente(orcaM30, datos.getComponente("SP 0.2 Carbon, 27.2mm, Setback 20", TipoComponente.Tija_Sillin)));
        componentesOrcaM30.add(new BicicletaComponente(orcaM30, datos.getComponente("Fizik Aliante R5", TipoComponente.Sillin)));
        bicicletaComponenteRepository.saveAll(componentesOrcaM30);


        // Asociaciones para Orbea Orca M20i Team Replica
        Bicicleta orcaM20iTeamReplica = datos.getBicicleta("Orca M20i Team Replica", "Orbea");
        List<BicicletaComponente> componentesOrcaM20iTeamReplica = new ArrayList<>();
        componentesOrcaM20iTeamReplica.add(new BicicletaComponente(orcaM20iTeamReplica, datos.getComponente("Orbea Orca Carbon OMX Disc", TipoComponente.Cuadro)));
        componentesOrcaM20iTeamReplica.add(new BicicletaComponente(orcaM20iTeamReplica, datos.getComponente("Orca OMX Carbon fork", TipoComponente.Horquilla)));
        componentesOrcaM20iTeamReplica.add(new BicicletaComponente(orcaM20iTeamReplica, datos.getComponente("Shimano Ultegra Di2 R8150", TipoComponente.Cambio_Trasero)));
        componentesOrcaM20iTeamReplica.add(new BicicletaComponente(orcaM20iTeamReplica, datos.getComponente("Shimano Ultegra R8170 hidráulicos", TipoComponente.Frenos)));
        componentesOrcaM20iTeamReplica.add(new BicicletaComponente(orcaM20iTeamReplica, datos.getComponente("Fulcrum Racing 600 DB", TipoComponente.Ruedas)));
        componentesOrcaM20iTeamReplica.add(new BicicletaComponente(orcaM20iTeamReplica, datos.getComponente("Shimano Ultegra R8100 52/36t", TipoComponente.Bielas)));
        componentesOrcaM20iTeamReplica.add(new BicicletaComponente(orcaM20iTeamReplica, datos.getComponente("Shimano Ultegra R8100 11-30t", TipoComponente.Cassette)));
        componentesOrcaM20iTeamReplica.add(new BicicletaComponente(orcaM20iTeamReplica, datos.getComponente("Fizik Antares R3", TipoComponente.Sillin)));
        bicicletaComponenteRepository.saveAll(componentesOrcaM20iTeamReplica);


        // Asociaciones para Orbea Orca M11eLTD PWR
        Bicicleta orcaM11eLTDPWR = datos.getBicicleta("Orca M11eLTD PWR", "Orbea");
        List<BicicletaComponente> componentesOrcaM11eLTDPWR = new ArrayList<>();
        componentesOrcaM11eLTDPWR.add(new BicicletaComponente(orcaM11eLTDPWR, datos.getComponente("Orbea Orca Carbon OMX Disc", TipoComponente.Cuadro)));
        componentesOrcaM11eLTDPWR.add(new BicicletaComponente(orcaM11eLTDPWR, datos.getComponente("Orca OMX Carbon fork", TipoComponente.Horquilla)));
        componentesOrcaM11eLTDPWR.add(new BicicletaComponente(orcaM11eLTDPWR, datos.getComponente("SRAM Red eTap AXS", TipoComponente.Cambio_Trasero)));
        componentesOrcaM11eLTDPWR.add(new BicicletaComponente(orcaM11eLTDPWR, datos.getComponente("SRAM Red eTap AXS", TipoComponente.Frenos)));
        componentesOrcaM11eLTDPWR.add(new BicicletaComponente(orcaM11eLTDPWR, datos.getComponente("Orca OMX Vision Carbon 35 TLR", TipoComponente.Ruedas)));
        componentesOrcaM11eLTDPWR.add(new BicicletaComponente(orcaM11eLTDPWR, datos.getComponente("SRAM Red Power Meter DUB 48/35t", TipoComponente.Bielas)));
        componentesOrcaM11eLTDPWR.add(new BicicletaComponente(orcaM11eLTDPWR, datos.getComponente("SRAM Red XG-1290 10-33t", TipoComponente.Cassette)));
        componentesOrcaM11eLTDPWR.add(new BicicletaComponente(orcaM11eLTDPWR, datos.getComponente("Fizik Antares R3", TipoComponente.Sillin)));
        bicicletaComponenteRepository.saveAll(componentesOrcaM11eLTDPWR);

        // Asociaciones para Orbea Oiz M LTD
        Bicicleta oizMLTD = datos.getBicicleta("Oiz M LTD", "Orbea");
        List<BicicletaComponente> componentesOizMLTD = new ArrayList<>();
        componentesOizMLTD.add(new BicicletaComponente(oizMLTD, datos.getComponente("Orbea Oiz Carbon OMX", TipoComponente.Cuadro)));
        componentesOizMLTD.add(new BicicletaComponente(oizMLTD, datos.getComponente("Fox 32 Float SC Factory", TipoComponente.Horquilla)));
        componentesOizMLTD.add(new BicicletaComponente(oizMLTD, datos.getComponente("Fox Float DPS Factory", TipoComponente.Amortiguador)));
        componentesOizMLTD.add(new BicicletaComponente(oizMLTD, datos.getComponente("SRAM XX1 Eagle AXS", TipoComponente.Cambio_Trasero)));
        componentesOizMLTD.add(new BicicletaComponente(oizMLTD, datos.getComponente("SRAM Red", TipoComponente.Frenos)));
        componentesOizMLTD.add(new BicicletaComponente(oizMLTD, datos.getComponente("DT Swiss XRC 1200", TipoComponente.Ruedas)));
        bicicletaComponenteRepository.saveAll(componentesOizMLTD);

        // Asociaciones para Orbea Oiz M PRO
        Bicicleta oizMPRO = datos.getBicicleta("Oiz M PRO", "Orbea");
        List<BicicletaComponente> componentesOizMPRO = new ArrayList<>();
        componentesOizMPRO.add(new BicicletaComponente(oizMPRO, datos.getComponente("Orbea Oiz Carbon OMR", TipoComponente.Cuadro)));
        componentesOizMPRO.add(new BicicletaComponente(oizMPRO, datos.getComponente("Fox 32 Float SC Performance", TipoComponente.Horquilla)));
        componentesOizMPRO.add(new BicicletaComponente(oizMPRO, datos.getComponente("Fox Float DPS Performance", TipoComponente.Amortiguador)));
        componentesOizMPRO.add(new BicicletaComponente(oizMPRO, datos.getComponente("SRAM X01 Eagle", TipoComponente.Cambio_Trasero)));
        componentesOizMPRO.add(new BicicletaComponente(oizMPRO, datos.getComponente("SRAM Level", TipoComponente.Frenos)));
        bicicletaComponenteRepository.saveAll(componentesOizMPRO);

        // Asociaciones para Orbea Oiz M21
        Bicicleta oizM21 = datos.getBicicleta("Oiz M21", "Orbea");
        List<BicicletaComponente> componentesOizM21 = new ArrayList<>();
        componentesOizM21.add(new BicicletaComponente(oizM21, datos.getComponente("Orbea Oiz Carbon OMR", TipoComponente.Cuadro)));
        componentesOizM21.add(new BicicletaComponente(oizM21, datos.getComponente("Fox 32 Float SC Performance", TipoComponente.Horquilla)));
        componentesOizM21.add(new BicicletaComponente(oizM21, datos.getComponente("Fox Float DPS Performance", TipoComponente.Amortiguador)));
        componentesOizM21.add(new BicicletaComponente(oizM21, datos.getComponente("Shimano SLX M7100", TipoComponente.Cambio_Trasero)));
        componentesOizM21.add(new BicicletaComponente(oizM21, datos.getComponente("Shimano SLX M7100", TipoComponente.Frenos)));
        bicicletaComponenteRepository.saveAll(componentesOizM21);

        // Asociaciones para Trek Madone SLR 9 AXS Gen 8
        Bicicleta madoneSLR9 = datos.getBicicleta("Madone SLR 9 AXS Gen 8", "Trek");
        List<BicicletaComponente> componentesMadoneSLR9 = new ArrayList<>();
        componentesMadoneSLR9.add(new BicicletaComponente(madoneSLR9, datos.getComponente("Trek Madone Gen 8 OCLV 900", TipoComponente.Cuadro)));
        componentesMadoneSLR9.add(new BicicletaComponente(madoneSLR9, datos.getComponente("Madone Gen 8 carbono", TipoComponente.Horquilla)));
        componentesMadoneSLR9.add(new BicicletaComponente(madoneSLR9, datos.getComponente("SRAM RED AXS E1", TipoComponente.Manetas_Cambio)));
        componentesMadoneSLR9.add(new BicicletaComponente(madoneSLR9, datos.getComponente("SRAM RED AXS E1", TipoComponente.Desviador)));
        componentesMadoneSLR9.add(new BicicletaComponente(madoneSLR9, datos.getComponente("SRAM RED AXS E1", TipoComponente.Cambio_Trasero)));
        componentesMadoneSLR9.add(new BicicletaComponente(madoneSLR9, datos.getComponente("SRAM RED AXS E1 con potenciómetro, 48/35, DUB", TipoComponente.Bielas)));
        componentesMadoneSLR9.add(new BicicletaComponente(madoneSLR9, datos.getComponente("SRAM DUB T47 roscado, rodamiento interno", TipoComponente.Pedalier)));
        componentesMadoneSLR9.add(new BicicletaComponente(madoneSLR9, datos.getComponente("SRAM RED XG-1290 10-33t", TipoComponente.Cassette)));
        componentesMadoneSLR9.add(new BicicletaComponente(madoneSLR9, datos.getComponente("SRAM RED E1, 12 velocidades", TipoComponente.Cadena)));
        componentesMadoneSLR9.add(new BicicletaComponente(madoneSLR9, datos.getComponente("Bontrager Aeolus RSL 51", TipoComponente.Ruedas)));
        componentesMadoneSLR9.add(new BicicletaComponente(madoneSLR9, datos.getComponente("Pirelli P Zero Race 700x28", TipoComponente.Cubiertas)));
        componentesMadoneSLR9.add(new BicicletaComponente(madoneSLR9, datos.getComponente("Aeolus RSL, raíles carbono", TipoComponente.Sillin)));
        componentesMadoneSLR9.add(new BicicletaComponente(madoneSLR9, datos.getComponente("Tija integrada Madone", TipoComponente.Tija_Sillin)));
        componentesMadoneSLR9.add(new BicicletaComponente(madoneSLR9, datos.getComponente("Trek Aero RSL Carretera", TipoComponente.Manillar)));
        bicicletaComponenteRepository.saveAll(componentesMadoneSLR9);


        // Asociaciones para Trek Supercaliber SLR 9.9 XX AXS Gen 2
        Bicicleta supercaliberSLR99 = datos.getBicicleta("Supercaliber SLR 9.9 XX AXS Gen 2", "Trek");
        List<BicicletaComponente> componentesSupercaliberSLR99 = new ArrayList<>();
        componentesSupercaliberSLR99.add(new BicicletaComponente(supercaliberSLR99, datos.getComponente("Cuadro de carbono OCLV Mountain Carbon, IsoStrut, boost148, tubo de dirección cónico E2", TipoComponente.Cuadro)));
        componentesSupercaliberSLR99.add(new BicicletaComponente(supercaliberSLR99, datos.getComponente("RockShox SID SL Ultimate, amortiguador Charger Race Day, eje pasante Boost110, offset 44mm", TipoComponente.Horquilla)));
        componentesSupercaliberSLR99.add(new BicicletaComponente(supercaliberSLR99, datos.getComponente("SRAM XX AXS T-Type, 12 velocidades", TipoComponente.Cambio_Trasero)));
        componentesSupercaliberSLR99.add(new BicicletaComponente(supercaliberSLR99, datos.getComponente("SRAM XX Eagle Carbon, 32T, Boost", TipoComponente.Bielas)));
        componentesSupercaliberSLR99.add(new BicicletaComponente(supercaliberSLR99, datos.getComponente("Bontrager Kovee XXX 30, carbono OCLV, tubeless ready", TipoComponente.Ruedas)));
        componentesSupercaliberSLR99.add(new BicicletaComponente(supercaliberSLR99, datos.getComponente("SRAM Level Ultimate Hydr Disc", TipoComponente.Frenos)));
        componentesSupercaliberSLR99.add(new BicicletaComponente(supercaliberSLR99, datos.getComponente("Bontrager RSL, OCLV Carbon, 31.8mm, 15mm de altura, 750mm de ancho", TipoComponente.Manillar)));
        bicicletaComponenteRepository.saveAll(componentesSupercaliberSLR99);

        // Asociaciones para Trek Supercaliber SLR 9.8 X0 AXS T-Type Gen 2
        Bicicleta supercaliberSLR98 = datos.getBicicleta("Supercaliber SLR 9.8 X0 AXS T-Type Gen 2", "Trek");
        List<BicicletaComponente> componentesSupercaliberSLR98 = new ArrayList<>();
        componentesSupercaliberSLR98.add(new BicicletaComponente(supercaliberSLR98, datos.getComponente("Cuadro de carbono OCLV Mountain Carbon, IsoStrut, boost148, tubo de dirección cónico E2", TipoComponente.Cuadro)));
        componentesSupercaliberSLR98.add(new BicicletaComponente(supercaliberSLR98, datos.getComponente("RockShox SID SL Select+, amortiguador Charger 2 RL, muelle DebonAir, eje pasante Boost110", TipoComponente.Horquilla)));
        componentesSupercaliberSLR98.add(new BicicletaComponente(supercaliberSLR98, datos.getComponente("SRAM X0 AXS T-Type Eagle, 12 velocidades", TipoComponente.Cambio_Trasero)));
        componentesSupercaliberSLR98.add(new BicicletaComponente(supercaliberSLR98, datos.getComponente("SRAM X0 AXS Eagle, 32T, Boost", TipoComponente.Bielas)));
        componentesSupercaliberSLR98.add(new BicicletaComponente(supercaliberSLR98, datos.getComponente("Bontrager Kovee Elite 30, tubeless ready", TipoComponente.Ruedas)));
        componentesSupercaliberSLR98.add(new BicicletaComponente(supercaliberSLR98, datos.getComponente("SRAM Level Silver Hydr Disc", TipoComponente.Frenos)));
        componentesSupercaliberSLR98.add(new BicicletaComponente(supercaliberSLR98, datos.getComponente("Bontrager Kovee Pro, OCLV Carbon, 31.8mm, 15mm de altura, 750mm de ancho", TipoComponente.Manillar)));
        bicicletaComponenteRepository.saveAll(componentesSupercaliberSLR98);

        // Asociaciones para Scott Spark RC SL
        Bicicleta sparkRCSL = datos.getBicicleta("Spark RC SL", "Scott");
        List<BicicletaComponente> componentesSparkRCSL = new ArrayList<>();
        componentesSparkRCSL.add(new BicicletaComponente(sparkRCSL, datos.getComponente("Spark RC SL Carbon HMX, Tecnología Integrada de Suspensión, geometría ajustable", TipoComponente.Cuadro)));
        componentesSparkRCSL.add(new BicicletaComponente(sparkRCSL, datos.getComponente("FOX 32 Float Factory SC, FIT4, 3 posiciones, Kashima, recorrido 100mm", TipoComponente.Horquilla)));
        componentesSparkRCSL.add(new BicicletaComponente(sparkRCSL, datos.getComponente("FOX NUDE 5T, SCOTT TwinLoc Tech, 3 modos, recorrido 100mm", TipoComponente.Amortiguador)));
        componentesSparkRCSL.add(new BicicletaComponente(sparkRCSL, datos.getComponente("SRAM XX Eagle AXS, 12 velocidades", TipoComponente.Cambio_Trasero)));
        componentesSparkRCSL.add(new BicicletaComponente(sparkRCSL, datos.getComponente("DT Swiss XRC 1200 Spline, carbono, 30mm de ancho interno", TipoComponente.Ruedas)));
        componentesSparkRCSL.add(new BicicletaComponente(sparkRCSL, datos.getComponente("Shimano XTR M9100 4 pistones", TipoComponente.Frenos)));
        componentesSparkRCSL.add(new BicicletaComponente(sparkRCSL, datos.getComponente("SRAM XX Eagle Carbon DUB, 34T", TipoComponente.Bielas)));
        bicicletaComponenteRepository.saveAll(componentesSparkRCSL);

        // Asociaciones para Scott Scale 940 Black
        Bicicleta scale940 = datos.getBicicleta("Scale 940 Black", "Scott");
        List<BicicletaComponente> componentesScale940 = new ArrayList<>();
        componentesScale940.add(new BicicletaComponente(scale940, datos.getComponente("Scale Alloy 6061 custom butted, tapered headtube, BB92", TipoComponente.Cuadro)));
        componentesScale940.add(new BicicletaComponente(scale940, datos.getComponente("RockShox Judy Silver TK, recorrido 100mm", TipoComponente.Horquilla)));
        componentesScale940.add(new BicicletaComponente(scale940, datos.getComponente("Shimano Deore RD-M6100-SGS, 12 velocidades", TipoComponente.Cambio_Trasero)));
        componentesScale940.add(new BicicletaComponente(scale940, datos.getComponente("Shimano Deore SL-M6100", TipoComponente.Manetas_Cambio)));
        componentesScale940.add(new BicicletaComponente(scale940, datos.getComponente("Syncros X-30, 32H", TipoComponente.Ruedas)));
        componentesScale940.add(new BicicletaComponente(scale940, datos.getComponente("Shimano BR-MT410, discos 180mm F & R", TipoComponente.Disco)));
        componentesScale940.add(new BicicletaComponente(scale940, datos.getComponente("Shimano FC-MT511, 32T", TipoComponente.Bielas)));
        bicicletaComponenteRepository.saveAll(componentesScale940);

        // Asociaciones para Scott Scale RC Team
        Bicicleta scaleRCTeam = datos.getBicicleta("Scale RC Team", "Scott");
        List<BicicletaComponente> componentesScaleRCTeam = new ArrayList<>();
        componentesScaleRCTeam.add(new BicicletaComponente(scaleRCTeam, datos.getComponente("Scale Carbon HMF, BB92, Boost 12x148mm, diseño integrado", TipoComponente.Cuadro)));
        componentesScaleRCTeam.add(new BicicletaComponente(scaleRCTeam, datos.getComponente("RockShox SID SL Select+, remote lockout, Boost, recorrido 100mm", TipoComponente.Horquilla)));
        componentesScaleRCTeam.add(new BicicletaComponente(scaleRCTeam, datos.getComponente("Shimano XT M8100", TipoComponente.Cambio_Trasero)));
        componentesScaleRCTeam.add(new BicicletaComponente(scaleRCTeam, datos.getComponente("SRAM GX Eagle", TipoComponente.Manetas_Cambio)));
        componentesScaleRCTeam.add(new BicicletaComponente(scaleRCTeam, datos.getComponente("Syncros Silverton 2.0, tubeless ready", TipoComponente.Ruedas)));
        componentesScaleRCTeam.add(new BicicletaComponente(scaleRCTeam, datos.getComponente("Shimano XT M8100, discos 180mm F / 160mm R", TipoComponente.Disco)));
        componentesScaleRCTeam.add(new BicicletaComponente(scaleRCTeam, datos.getComponente("SRAM GX Eagle DUB, 32T", TipoComponente.Bielas)));
        bicicletaComponenteRepository.saveAll(componentesScaleRCTeam);

// Canyon Grand Canyon 7
        Bicicleta grandCanyon7 = datos.getBicicleta("Grand Canyon 7", "Canyon");
        List<BicicletaComponente> componentesGrandCanyon7 = new ArrayList<>();
        componentesGrandCanyon7.add(new BicicletaComponente(grandCanyon7, datos.getComponente("Grand Canyon AL SL", TipoComponente.Cuadro)));
        componentesGrandCanyon7.add(new BicicletaComponente(grandCanyon7, datos.getComponente("RockShox Judy Silver", TipoComponente.Horquilla)));
        componentesGrandCanyon7.add(new BicicletaComponente(grandCanyon7, datos.getComponente("SRAM SX Eagle", TipoComponente.Cambio_Trasero)));
        componentesGrandCanyon7.add(new BicicletaComponente(grandCanyon7, datos.getComponente("SRAM SX Eagle", TipoComponente.Manetas_Cambio)));
        componentesGrandCanyon7.add(new BicicletaComponente(grandCanyon7, datos.getComponente("SRAM PG-1210", TipoComponente.Cassette)));
        componentesGrandCanyon7.add(new BicicletaComponente(grandCanyon7, datos.getComponente("Truvativ Stylo", TipoComponente.Bielas)));
        componentesGrandCanyon7.add(new BicicletaComponente(grandCanyon7, datos.getComponente("SRAM Pressfit DUB", TipoComponente.Bujes)));
        componentesGrandCanyon7.add(new BicicletaComponente(grandCanyon7, datos.getComponente("SRAM SX Eagle", TipoComponente.Cadena)));
        componentesGrandCanyon7.add(new BicicletaComponente(grandCanyon7, datos.getComponente("Shimano MT400", TipoComponente.Frenos)));
        componentesGrandCanyon7.add(new BicicletaComponente(grandCanyon7, datos.getComponente("Alexrims MD25", TipoComponente.Ruedas)));
        componentesGrandCanyon7.add(new BicicletaComponente(grandCanyon7, datos.getComponente("Schwalbe Wicked Will", TipoComponente.Cubiertas)));
        componentesGrandCanyon7.add(new BicicletaComponente(grandCanyon7, datos.getComponente("Iridium Flatbar", TipoComponente.Manillar)));
        componentesGrandCanyon7.add(new BicicletaComponente(grandCanyon7, datos.getComponente("Iridium Trail", TipoComponente.Sillin)));
        componentesGrandCanyon7.add(new BicicletaComponente(grandCanyon7, datos.getComponente("Iridium Dropper", TipoComponente.Tija_Sillin)));
        bicicletaComponenteRepository.saveAll(componentesGrandCanyon7);


// Canyon Lux World Cup CFR AXS
        Bicicleta luxWorldCupCfrAxs = datos.getBicicleta("Lux World Cup CFR AXS", "Canyon");
        List<BicicletaComponente> componentesLuxWorldCupCfrAxs = new ArrayList<>();
        componentesLuxWorldCupCfrAxs.add(new BicicletaComponente(luxWorldCupCfrAxs, datos.getComponente("Canyon Lux WC CFR", TipoComponente.Cuadro)));
        componentesLuxWorldCupCfrAxs.add(new BicicletaComponente(luxWorldCupCfrAxs, datos.getComponente("RockShox SIDLuxe Ultimate", TipoComponente.Amortiguador)));
        componentesLuxWorldCupCfrAxs.add(new BicicletaComponente(luxWorldCupCfrAxs, datos.getComponente("RockShox SID SL Ultimate", TipoComponente.Horquilla)));
        componentesLuxWorldCupCfrAxs.add(new BicicletaComponente(luxWorldCupCfrAxs, datos.getComponente("SRAM XX SL Eagle AXS", TipoComponente.Cambio_Trasero)));
        componentesLuxWorldCupCfrAxs.add(new BicicletaComponente(luxWorldCupCfrAxs, datos.getComponente("SRAM AXS POD", TipoComponente.Manetas_Cambio)));
        componentesLuxWorldCupCfrAxs.add(new BicicletaComponente(luxWorldCupCfrAxs, datos.getComponente("SRAM XS-1299", TipoComponente.Cassette)));
        componentesLuxWorldCupCfrAxs.add(new BicicletaComponente(luxWorldCupCfrAxs, datos.getComponente("SRAM XX SL Eagle", TipoComponente.Bielas)));
        componentesLuxWorldCupCfrAxs.add(new BicicletaComponente(luxWorldCupCfrAxs, datos.getComponente("Ceramicspeed Coated", TipoComponente.Bujes)));
        componentesLuxWorldCupCfrAxs.add(new BicicletaComponente(luxWorldCupCfrAxs, datos.getComponente("SRAM XX SL T-Type", TipoComponente.Cadena)));
        componentesLuxWorldCupCfrAxs.add(new BicicletaComponente(luxWorldCupCfrAxs, datos.getComponente("SRAM PowerLock", TipoComponente.Cadena)));
        componentesLuxWorldCupCfrAxs.add(new BicicletaComponente(luxWorldCupCfrAxs, datos.getComponente("SRAM Level Ultimate", TipoComponente.Frenos)));
        componentesLuxWorldCupCfrAxs.add(new BicicletaComponente(luxWorldCupCfrAxs, datos.getComponente("SRAM HS2 Rounded", TipoComponente.Disco)));
        componentesLuxWorldCupCfrAxs.add(new BicicletaComponente(luxWorldCupCfrAxs, datos.getComponente("DT Swiss XRC 1200", TipoComponente.Ruedas)));
        componentesLuxWorldCupCfrAxs.add(new BicicletaComponente(luxWorldCupCfrAxs, datos.getComponente("Schwalbe Racing Ralph", TipoComponente.Cubiertas)));
        componentesLuxWorldCupCfrAxs.add(new BicicletaComponente(luxWorldCupCfrAxs, datos.getComponente("Schwalbe Racing Ray", TipoComponente.Cubiertas)));
        componentesLuxWorldCupCfrAxs.add(new BicicletaComponente(luxWorldCupCfrAxs, datos.getComponente("Canyon CP0036", TipoComponente.Manillar)));
        componentesLuxWorldCupCfrAxs.add(new BicicletaComponente(luxWorldCupCfrAxs, datos.getComponente("Ergon SR10", TipoComponente.Sillin)));
        componentesLuxWorldCupCfrAxs.add(new BicicletaComponente(luxWorldCupCfrAxs, datos.getComponente("FOX Transfer SL", TipoComponente.Tija_Sillin)));
        bicicletaComponenteRepository.saveAll(componentesLuxWorldCupCfrAxs);

// Scott Spark RC Team
        Bicicleta sparkRcTeam = datos.getBicicleta("Spark RC Team", "Scott");
        List<BicicletaComponente> componentesSparkRcTeam = new ArrayList<>();
        componentesSparkRcTeam.add(new BicicletaComponente(sparkRcTeam, datos.getComponente("Spark RC Carbon HMF", TipoComponente.Cuadro)));
        componentesSparkRcTeam.add(new BicicletaComponente(sparkRcTeam, datos.getComponente("FOX 34 Float Performance", TipoComponente.Horquilla)));
        componentesSparkRcTeam.add(new BicicletaComponente(sparkRcTeam, datos.getComponente("FOX Float Performance", TipoComponente.Amortiguador)));
        componentesSparkRcTeam.add(new BicicletaComponente(sparkRcTeam, datos.getComponente("SRAM GX Eagle", TipoComponente.Cambio_Trasero)));
        componentesSparkRcTeam.add(new BicicletaComponente(sparkRcTeam, datos.getComponente("Syncros Silverton 2.0", TipoComponente.Ruedas)));
        componentesSparkRcTeam.add(new BicicletaComponente(sparkRcTeam, datos.getComponente("Shimano Deore M6120", TipoComponente.Frenos)));
        componentesSparkRcTeam.add(new BicicletaComponente(sparkRcTeam, datos.getComponente("SRAM GX Eagle DUB", TipoComponente.Bielas)));
        bicicletaComponenteRepository.saveAll(componentesSparkRcTeam);

// Scott Addict Gravel RC
        Bicicleta addictGravelRC = datos.getBicicleta("Addict Gravel RC", "Scott");
        List<BicicletaComponente> componentesAddictGravelRC = new ArrayList<>();
        componentesAddictGravelRC.add(new BicicletaComponente(addictGravelRC, datos.getComponente("Addict Gravel Carbon HMX", TipoComponente.Cuadro)));
        componentesAddictGravelRC.add(new BicicletaComponente(addictGravelRC, datos.getComponente("Addict Gravel HMX", TipoComponente.Horquilla)));
        componentesAddictGravelRC.add(new BicicletaComponente(addictGravelRC, datos.getComponente("SRAM RED eTap AXS", TipoComponente.Cambio_Trasero)));
        componentesAddictGravelRC.add(new BicicletaComponente(addictGravelRC, datos.getComponente("SRAM RED eTap AXS", TipoComponente.Desviador)));
        componentesAddictGravelRC.add(new BicicletaComponente(addictGravelRC, datos.getComponente("DT Swiss GRC 1100", TipoComponente.Ruedas)));
        componentesAddictGravelRC.add(new BicicletaComponente(addictGravelRC, datos.getComponente("SRAM RED eTap AXS HRD", TipoComponente.Frenos)));
        componentesAddictGravelRC.add(new BicicletaComponente(addictGravelRC, datos.getComponente("SRAM RED D1 DUB", TipoComponente.Bielas)));
        bicicletaComponenteRepository.saveAll(componentesAddictGravelRC);

// Scott Addict Gravel RC 2
        Bicicleta addictGravelRC2 = datos.getBicicleta("Addict Gravel RC 2", "Scott");
        List<BicicletaComponente> componentesAddictGravelRC2 = new ArrayList<>();
        componentesAddictGravelRC2.add(new BicicletaComponente(addictGravelRC2, datos.getComponente("Addict Gravel Carbon HMF", TipoComponente.Cuadro)));
        componentesAddictGravelRC2.add(new BicicletaComponente(addictGravelRC2, datos.getComponente("Addict Gravel HMF", TipoComponente.Horquilla)));
        componentesAddictGravelRC2.add(new BicicletaComponente(addictGravelRC2, datos.getComponente("Shimano GRX Di2 RD-RX815", TipoComponente.Cambio_Trasero)));
        componentesAddictGravelRC2.add(new BicicletaComponente(addictGravelRC2, datos.getComponente("Shimano GRX Di2 FD-RX815", TipoComponente.Desviador)));
        componentesAddictGravelRC2.add(new BicicletaComponente(addictGravelRC2, datos.getComponente("Syncros RP2.0 Disc", TipoComponente.Ruedas)));
        componentesAddictGravelRC2.add(new BicicletaComponente(addictGravelRC2, datos.getComponente("Shimano GRX BR-RX810", TipoComponente.Frenos)));
        componentesAddictGravelRC2.add(new BicicletaComponente(addictGravelRC2, datos.getComponente("Shimano GRX FC-RX810-2", TipoComponente.Bielas)));
        bicicletaComponenteRepository.saveAll(componentesAddictGravelRC2);

// Specialized Tarmac SL7 Comp
        Bicicleta tarmacSL7Comp = datos.getBicicleta("Tarmac SL7 Comp", "Specialized");
        List<BicicletaComponente> componentesTarmacSL7Comp = new ArrayList<>();
        componentesTarmacSL7Comp.add(new BicicletaComponente(tarmacSL7Comp, datos.getComponente("FACT 10r Carbon", TipoComponente.Cuadro)));
        componentesTarmacSL7Comp.add(new BicicletaComponente(tarmacSL7Comp, datos.getComponente("FACT Carbon", TipoComponente.Horquilla)));
        componentesTarmacSL7Comp.add(new BicicletaComponente(tarmacSL7Comp, datos.getComponente("Shimano Ultegra R8000", TipoComponente.Cambio_Trasero)));
        componentesTarmacSL7Comp.add(new BicicletaComponente(tarmacSL7Comp, datos.getComponente("Shimano Ultegra R8000", TipoComponente.Desviador)));
        componentesTarmacSL7Comp.add(new BicicletaComponente(tarmacSL7Comp, datos.getComponente("DT Swiss R470 Disc", TipoComponente.Ruedas)));
        componentesTarmacSL7Comp.add(new BicicletaComponente(tarmacSL7Comp, datos.getComponente("Shimano Ultegra R8070", TipoComponente.Frenos)));
        componentesTarmacSL7Comp.add(new BicicletaComponente(tarmacSL7Comp, datos.getComponente("Shimano Ultegra R8000", TipoComponente.Bielas)));
        componentesTarmacSL7Comp.add(new BicicletaComponente(tarmacSL7Comp, datos.getComponente("Specialized Expert Shallow Drop", TipoComponente.Manillar)));
        componentesTarmacSL7Comp.add(new BicicletaComponente(tarmacSL7Comp, datos.getComponente("Body Geometry Power Pro", TipoComponente.Sillin)));
        bicicletaComponenteRepository.saveAll(componentesTarmacSL7Comp);

// Trek Fuel EX 8
        Bicicleta fuelEX8 = datos.getBicicleta("Fuel EX 8", "Trek");
        List<BicicletaComponente> componentesFuelEX8 = new ArrayList<>();
        componentesFuelEX8.add(new BicicletaComponente(fuelEX8, datos.getComponente("Aluminio Alpha Platinum", TipoComponente.Cuadro)));
        componentesFuelEX8.add(new BicicletaComponente(fuelEX8, datos.getComponente("RockShox 35 Gold RL", TipoComponente.Horquilla)));
        componentesFuelEX8.add(new BicicletaComponente(fuelEX8, datos.getComponente("FOX Float X Performance", TipoComponente.Amortiguador)));
        componentesFuelEX8.add(new BicicletaComponente(fuelEX8, datos.getComponente("SRAM GX Eagle", TipoComponente.Cambio_Trasero)));
        componentesFuelEX8.add(new BicicletaComponente(fuelEX8, datos.getComponente("SRAM GX Eagle", TipoComponente.Manetas_Cambio)));
        componentesFuelEX8.add(new BicicletaComponente(fuelEX8, datos.getComponente("Bontrager Line Comp 30", TipoComponente.Ruedas)));
        componentesFuelEX8.add(new BicicletaComponente(fuelEX8, datos.getComponente("Shimano Deore M6120", TipoComponente.Frenos)));
        componentesFuelEX8.add(new BicicletaComponente(fuelEX8, datos.getComponente("SRAM Descendant 6K Eagle", TipoComponente.Bielas)));
        componentesFuelEX8.add(new BicicletaComponente(fuelEX8, datos.getComponente("SRAM XG-1275 Eagle", TipoComponente.Cassette)));
        componentesFuelEX8.add(new BicicletaComponente(fuelEX8, datos.getComponente("Bontrager Line", TipoComponente.Manillar)));
        componentesFuelEX8.add(new BicicletaComponente(fuelEX8, datos.getComponente("Bontrager Line Elite Dropper", TipoComponente.Tija_Sillin)));
        bicicletaComponenteRepository.saveAll(componentesFuelEX8);

// Giant Revolt Advanced 2
        Bicicleta revoltAdvanced2 = datos.getBicicleta("Revolt Advanced 2", "Giant");
        List<BicicletaComponente> componentesRevoltAdvanced2 = new ArrayList<>();
        componentesRevoltAdvanced2.add(new BicicletaComponente(revoltAdvanced2, datos.getComponente("Advanced Grade Composite", TipoComponente.Cuadro)));
        componentesRevoltAdvanced2.add(new BicicletaComponente(revoltAdvanced2, datos.getComponente("Advanced Grade Composite", TipoComponente.Horquilla)));
        componentesRevoltAdvanced2.add(new BicicletaComponente(revoltAdvanced2, datos.getComponente("Shimano GRX RX-810", TipoComponente.Cambio_Trasero)));
        componentesRevoltAdvanced2.add(new BicicletaComponente(revoltAdvanced2, datos.getComponente("Shimano GRX RX-810", TipoComponente.Desviador)));
        componentesRevoltAdvanced2.add(new BicicletaComponente(revoltAdvanced2, datos.getComponente("Shimano GRX RX-600", TipoComponente.Manetas_Cambio)));
        componentesRevoltAdvanced2.add(new BicicletaComponente(revoltAdvanced2, datos.getComponente("Giant P-X2 Disc", TipoComponente.Ruedas)));
        componentesRevoltAdvanced2.add(new BicicletaComponente(revoltAdvanced2, datos.getComponente("Maxxis Receptor", TipoComponente.Cubiertas)));
        componentesRevoltAdvanced2.add(new BicicletaComponente(revoltAdvanced2, datos.getComponente("Shimano GRX RX-400", TipoComponente.Frenos)));
        componentesRevoltAdvanced2.add(new BicicletaComponente(revoltAdvanced2, datos.getComponente("Shimano GRX RX-600", TipoComponente.Bielas)));
        componentesRevoltAdvanced2.add(new BicicletaComponente(revoltAdvanced2, datos.getComponente("Shimano 105 HG700", TipoComponente.Cassette)));
        componentesRevoltAdvanced2.add(new BicicletaComponente(revoltAdvanced2, datos.getComponente("Giant Contact XR D-Fuse", TipoComponente.Manillar)));
        componentesRevoltAdvanced2.add(new BicicletaComponente(revoltAdvanced2, datos.getComponente("Giant D-Fuse SL", TipoComponente.Tija_Sillin)));
        bicicletaComponenteRepository.saveAll(componentesRevoltAdvanced2);
        // Belador BR RED AXS PWM
        Bicicleta beladorRedAxs = datos.getBicicleta("Belador BR RED AXS PWM", "Berria");
        List<BicicletaComponente> componentesBeladorRedAxs = new ArrayList<>();
        componentesBeladorRedAxs.add(new BicicletaComponente(beladorRedAxs, datos.getComponente("Belador 6 BR DISC", TipoComponente.Cuadro)));
        componentesBeladorRedAxs.add(new BicicletaComponente(beladorRedAxs, datos.getComponente("Belador Blade 6 BR", TipoComponente.Horquilla)));
        componentesBeladorRedAxs.add(new BicicletaComponente(beladorRedAxs, datos.getComponente("Avanforce Airone", TipoComponente.Manillar)));
        componentesBeladorRedAxs.add(new BicicletaComponente(beladorRedAxs, datos.getComponente("Belador 6 SP", TipoComponente.Tija_Sillin)));
        componentesBeladorRedAxs.add(new BicicletaComponente(beladorRedAxs, datos.getComponente("Fizik Vento Argo R1", TipoComponente.Sillin)));
        componentesBeladorRedAxs.add(new BicicletaComponente(beladorRedAxs, datos.getComponente("Enve SES 4.5", TipoComponente.Ruedas)));
        componentesBeladorRedAxs.add(new BicicletaComponente(beladorRedAxs, datos.getComponente("Vittoria Corsa PRO", TipoComponente.Cubiertas)));
        componentesBeladorRedAxs.add(new BicicletaComponente(beladorRedAxs, datos.getComponente("SRAM RED AXS E1 Shift-Brake System", TipoComponente.Manetas_Cambio)));
        componentesBeladorRedAxs.add(new BicicletaComponente(beladorRedAxs, datos.getComponente("SRAM RED AXS E1 12s", TipoComponente.Cambio_Trasero)));
        componentesBeladorRedAxs.add(new BicicletaComponente(beladorRedAxs, datos.getComponente("SRAM RED AXS E1", TipoComponente.Desviador)));
        componentesBeladorRedAxs.add(new BicicletaComponente(beladorRedAxs, datos.getComponente("SRAM RED AXS E1 POWER METER", TipoComponente.Bielas)));
        componentesBeladorRedAxs.add(new BicicletaComponente(beladorRedAxs, datos.getComponente("CS XG 1290 E1 10-36", TipoComponente.Cassette)));
        componentesBeladorRedAxs.add(new BicicletaComponente(beladorRedAxs, datos.getComponente("SRAM RED AXS E1", TipoComponente.Frenos)));
        componentesBeladorRedAxs.add(new BicicletaComponente(beladorRedAxs, datos.getComponente("Ceramic Speed SRAM DUB T47 Bottom Bracket", TipoComponente.Pedalier)));
        bicicletaComponenteRepository.saveAll(componentesBeladorRedAxs);

// ALLROAD HPR ELITE APEX
        Bicicleta allroadHprEliteApex = datos.getBicicleta("ALLROAD HPR ELITE APEX", "Berria");
        List<BicicletaComponente> componentesAllroadHprEliteApex = new ArrayList<>();
        componentesAllroadHprEliteApex.add(new BicicletaComponente(allroadHprEliteApex, datos.getComponente("Allroad HPR", TipoComponente.Cuadro)));
        componentesAllroadHprEliteApex.add(new BicicletaComponente(allroadHprEliteApex, datos.getComponente("Allroad EVO", TipoComponente.Horquilla)));
        componentesAllroadHprEliteApex.add(new BicicletaComponente(allroadHprEliteApex, datos.getComponente("Avanforce 3 Gravel", TipoComponente.Manillar)));
        componentesAllroadHprEliteApex.add(new BicicletaComponente(allroadHprEliteApex, datos.getComponente("Avanforce AF3", TipoComponente.Tija_Sillin)));
        componentesAllroadHprEliteApex.add(new BicicletaComponente(allroadHprEliteApex, datos.getComponente("Selle Royal 2058HRN", TipoComponente.Sillin)));
        componentesAllroadHprEliteApex.add(new BicicletaComponente(allroadHprEliteApex, datos.getComponente("Mavic Allroad", TipoComponente.Ruedas)));
        componentesAllroadHprEliteApex.add(new BicicletaComponente(allroadHprEliteApex, datos.getComponente("Vittoria Terreno Dry", TipoComponente.Cubiertas)));
        componentesAllroadHprEliteApex.add(new BicicletaComponente(allroadHprEliteApex, datos.getComponente("SRAM APEX D1 Shift-Brake System", TipoComponente.Manetas_Cambio)));
        componentesAllroadHprEliteApex.add(new BicicletaComponente(allroadHprEliteApex, datos.getComponente("SRAM EAGLE APEX D1", TipoComponente.Cambio_Trasero)));
        componentesAllroadHprEliteApex.add(new BicicletaComponente(allroadHprEliteApex, datos.getComponente("SRAM APEX D1 AL DUB WIDE Crankset", TipoComponente.Bielas)));
        componentesAllroadHprEliteApex.add(new BicicletaComponente(allroadHprEliteApex, datos.getComponente("SRAM SX EAGLE 12S 118 LINKS", TipoComponente.Cadena)));
        componentesAllroadHprEliteApex.add(new BicicletaComponente(allroadHprEliteApex, datos.getComponente("SRAM EAGLE PG1210", TipoComponente.Cassette)));
        componentesAllroadHprEliteApex.add(new BicicletaComponente(allroadHprEliteApex, datos.getComponente("Sram DUB BB86 Press Fit Wide", TipoComponente.Bujes)));
        componentesAllroadHprEliteApex.add(new BicicletaComponente(allroadHprEliteApex, datos.getComponente("SRAM APEX D1 Hydraulic Shift-Brake System", TipoComponente.Frenos)));
        bicicletaComponenteRepository.saveAll(componentesAllroadHprEliteApex);


    }


}
