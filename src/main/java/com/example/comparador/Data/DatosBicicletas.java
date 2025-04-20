//package com.example.comparador.Data;
//
//import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.List;
//
//import com.example.comparador.Entity.*;
//import com.example.comparador.Entity.ENUM.*;
//
//public class DatosBicicletas {
//
//    public static void main(String[] args) {
//        Datos datos = new Datos();
//        // CANYON GRAVEL BIKES
//        // Grizl 5
//        Bicicleta grizl5;
//
//
//
//
//
//        // Grail CF SLX 8 AXS
//        Bicicleta grailCfSlx8 =
//
//        // Datos Grail CF SLX 8
//        Componente cuadroGrailCFSLX = ;
//        Componente manillarCP07 = ;
//
//        List<BicicletaComponente> componentesGrailCfSlx8 = new ArrayList<>();
//        componentesGrailCfSlx8.add(new BicicletaComponente(grailCfSlx8, cuadroGrailCFSLX));
//        componentesGrailCfSlx8.add(new BicicletaComponente(grailCfSlx8, manillarCP07));
//        componentesGrailCfSlx8.add(new BicicletaComponente(grailCfSlx8, sramForceAXS));
//        componentesGrailCfSlx8.add(new BicicletaComponente(grailCfSlx8, sramForce));
//        grailCfSlx8.setComponentes(componentesGrailCfSlx8);
//
//        // ORBEA MOUNTAIN BIKES
//        // Alma H20
//        Bicicleta almaH20 = ;
//
//        // Datos Alma H20
//        Componente cuadroAlmaHydro = ;
//
//        List<BicicletaComponente> componentesAlmaH20 = new ArrayList<>();
//        componentesAlmaH20.add(new BicicletaComponente(almaH20, cuadroAlmaHydro));
//        componentesAlmaH20.add(new BicicletaComponente(almaH20, rockShoxJudySilver));
//        componentesAlmaH20.add(new BicicletaComponente(almaH20, shimanoDeoreM6100));
//        componentesAlmaH20.add(new BicicletaComponente(almaH20, shimanoSLX));
//        almaH20.setComponentes(componentesAlmaH20);
//
//        // Alma M50
//        Bicicleta almaM50 = ;
//
//        // Datos Alma M50
//        Componente cuadroAlmaCarbon = ;
//
//        List<BicicletaComponente> componentesAlmaM50 = new ArrayList<>();
//        componentesAlmaM50.add(new BicicletaComponente(almaM50, cuadroAlmaCarbon));
//        componentesAlmaM50.add(new BicicletaComponente(almaM50, fox32FloatSC));
//        componentesAlmaM50.add(new BicicletaComponente(almaM50, shimanoSLXM7100));
//        componentesAlmaM50.add(new BicicletaComponente(almaM50, shimanoSLX));
//        almaM50.setComponentes(componentesAlmaM50);
//
//        // Alma M LTD
//        Bicicleta almaMLtd = ;
//
//        // Datos Alma M LTD
//        Componente cuadroAlmaCarbonOMX = ;
//
//        List<BicicletaComponente> componentesAlmaMLtd = new ArrayList<>();
//        componentesAlmaMLtd.add(new BicicletaComponente(almaMLtd, cuadroAlmaCarbonOMX));
//        componentesAlmaMLtd.add(new BicicletaComponente(almaMLtd, fox32FloatSCFactory));
//        componentesAlmaMLtd.add(new BicicletaComponente(almaMLtd, sramXX1AXS));
//        componentesAlmaMLtd.add(new BicicletaComponente(almaMLtd, sramLevel));
//        almaMLtd.setComponentes(componentesAlmaMLtd);
//
//        // ORBEA ROAD BIKES
//        //Orbea Orca M30
//        // Create Datos
//        Componente cuadroM30 = ;
//        Componente horquillaM30 = ;
//        Componente sillinM30 = ;
//        Componente manillarM30 = ;
//        Componente cambioM30 = ;
//        Componente frenosM30 = ;
//        Componente ruedasM30 = ;
//        Componente bielasM30 = ;
//        Componente cassetteM30 = ;
//
//// Create Bicicleta
//        Bicicleta orcaM30 = ;
//
//// Create BicicletaComponente relationships
//        List<BicicletaComponente> componentesM30 = new ArrayList<>();
//        componentesM30.add(new BicicletaComponente(orcaM30, cuadroM30));
//        componentesM30.add(new BicicletaComponente(orcaM30, horquillaM30));
//        componentesM30.add(new BicicletaComponente(orcaM30, sillinM30));
//        componentesM30.add(new BicicletaComponente(orcaM30, manillarM30));
//        componentesM30.add(new BicicletaComponente(orcaM30, cambioM30));
//        componentesM30.add(new BicicletaComponente(orcaM30, frenosM30));
//        componentesM30.add(new BicicletaComponente(orcaM30, ruedasM30));
//        componentesM30.add(new BicicletaComponente(orcaM30, bielasM30));
//        componentesM30.add(new BicicletaComponente(orcaM30, cassetteM30));
//
//        orcaM30.setComponentes(componentesM30);
//        //Orbea Orca M20i Team Replica
//        // Create Datos
//
//        Componente horquillaM20i = new Componente("Orca OMR Carbon fork", TipoComponente.Horquilla);
//        Componente sillinM20i = ;
//        Componente manillarM20i = ;
//        Componente cambioM20i = ;
//        Componente frenosM20i = ;
//        Componente ruedasM20i = ;
//        Componente bielasM20i = ;
//        Componente cassetteM20i = ;
//
//// Create Bicicleta
//        Bicicleta orcaM20i = ;
//
//// Create BicicletaComponente relationships
//        List<BicicletaComponente> componentesM20i = new ArrayList<>();
//        componentesM20i.add(new BicicletaComponente(orcaM20i, cuadroM20i));
//        componentesM20i.add(new BicicletaComponente(orcaM20i, horquillaM20i));
//        componentesM20i.add(new BicicletaComponente(orcaM20i, sillinM20i));
//        componentesM20i.add(new BicicletaComponente(orcaM20i, manillarM20i));
//        componentesM20i.add(new BicicletaComponente(orcaM20i, cambioM20i));
//        componentesM20i.add(new BicicletaComponente(orcaM20i, frenosM20i));
//        componentesM20i.add(new BicicletaComponente(orcaM20i, ruedasM20i));
//        componentesM20i.add(new BicicletaComponente(orcaM20i, bielasM20i));
//        componentesM20i.add(new BicicletaComponente(orcaM20i, cassetteM20i));
//
//        orcaM20i.setComponentes(componentesM20i);
//        //Orbea Orca M11eLTD PWR
//        // Create Datos
//        Componente cuadroM11e = ;
//        Componente horquillaM11e = ;
//        Componente sillinM11e = ;
//        Componente manillarM11e = ;
//        Componente cambioM11e = ;
//        Componente frenosM11e = ;
//        Componente ruedasM11e = ;
//        Componente bielasM11e = ;
//        Componente cassetteM11e = ;
//
//// Create Bicicleta
//        Bicicleta orcaM11e = ;
//
//// Create BicicletaComponente relationships
//        List<BicicletaComponente> componentesM11e = new ArrayList<>();
//        componentesM11e.add(new BicicletaComponente(orcaM11e, cuadroM11e));
//        componentesM11e.add(new BicicletaComponente(orcaM11e, horquillaM11e));
//        componentesM11e.add(new BicicletaComponente(orcaM11e, sillinM11e));
//        componentesM11e.add(new BicicletaComponente(orcaM11e, manillarM11e));
//        componentesM11e.add(new BicicletaComponente(orcaM11e, cambioM11e));
//        componentesM11e.add(new BicicletaComponente(orcaM11e, frenosM11e));
//        componentesM11e.add(new BicicletaComponente(orcaM11e, ruedasM11e));
//        componentesM11e.add(new BicicletaComponente(orcaM11e, bielasM11e));
//        componentesM11e.add(new BicicletaComponente(orcaM11e, cassetteM11e));
//
//        orcaM11e.setComponentes(componentesM11e);
//        // Orca M20i Team
//        Bicicleta orcaM20iTeam = ;
//
//        // Datos Orca M20i Team
//        Componente cuadroOrcaOMR = new Componente("Orbea Orca OMR", TipoComponente.Cuadro);
//        Componente horquillaOrcaOMR = new Componente("Orca OMR Carbon", TipoComponente.Horquilla);
//
//        List<BicicletaComponente> componentesOrcaM20iTeam = new ArrayList<>();
//        componentesOrcaM20iTeam.add(new BicicletaComponente(orcaM20iTeam, cuadroOrcaOMR));
//        componentesOrcaM20iTeam.add(new BicicletaComponente(orcaM20iTeam, horquillaOrcaOMR));
//        componentesOrcaM20iTeam.add(new BicicletaComponente(orcaM20iTeam, shimanoUltegraDi2));
//        componentesOrcaM20iTeam.add(new BicicletaComponente(orcaM20iTeam, shimanoUltegra));
//        orcaM20iTeam.setComponentes(componentesOrcaM20iTeam);
//
//        // Orca M20i Réplica
//        Bicicleta orcaM20iReplica =;
//
//        // Datos Orca M20i Réplica
//        List<BicicletaComponente> componentesOrcaM20iReplica = new ArrayList<>();
//        componentesOrcaM20iReplica.add(new BicicletaComponente(orcaM20iReplica, cuadroOrcaOMR));
//        componentesOrcaM20iReplica.add(new BicicletaComponente(orcaM20iReplica, horquillaOrcaOMR));
//        componentesOrcaM20iReplica.add(new BicicletaComponente(orcaM20iReplica, shimanoUltegraDi2));
//        componentesOrcaM20iReplica.add(new BicicletaComponente(orcaM20iReplica, shimanoUltegra));
//        orcaM20iReplica.setComponentes(componentesOrcaM20iReplica);
//
//        // Orca M11e LTD PWR
//        Bicicleta orcaM11eLTDPWR = ;
//
//        // Datos para Orca M11e LTD PWR
//        Componente cuadroOrcaOMX = ;
//        Componente horquillaOrcaOMX = ;
//
//        List<BicicletaComponente> componentesOrcaM11eLTDPWR = new ArrayList<>();
//        componentesOrcaM11eLTDPWR.add(new BicicletaComponente(orcaM11eLTDPWR, cuadroOrcaOMX));
//        componentesOrcaM11eLTDPWR.add(new BicicletaComponente(orcaM11eLTDPWR, horquillaOrcaOMX));
//        componentesOrcaM11eLTDPWR.add(new BicicletaComponente(orcaM11eLTDPWR, shimanoDuraAceDi2));
//        componentesOrcaM11eLTDPWR.add(new BicicletaComponente(orcaM11eLTDPWR, shimanoDuraAce));
//        orcaM11eLTDPWR.setComponentes(componentesOrcaM11eLTDPWR);
//
//        // ORBEA OIZ MODELS
//        // Oiz M LTD
//        Bicicleta oizMLtd = ;
//
//        // Datos Oiz M LTD
//        Componente cuadroOizOMX = ;
//
//        List<BicicletaComponente> componentesOizMLtd = new ArrayList<>();
//        componentesOizMLtd.add(new BicicletaComponente(oizMLtd, cuadroOizOMX));
//        componentesOizMLtd.add(new BicicletaComponente(oizMLtd, fox32FloatSCFactory));
//        componentesOizMLtd.add(new BicicletaComponente(oizMLtd, foxFloatDPSFactory));
//        componentesOizMLtd.add(new BicicletaComponente(oizMLtd, sramXX1AXS));
//        oizMLtd.setComponentes(componentesOizMLtd);
//
//        // Oiz M PRO
//        Bicicleta oizMPro = ;
//
//        // Datos Oiz M PRO
//        Componente cuadroOizOMR = ;
//
//        List<BicicletaComponente> componentesOizMPro = new ArrayList<>();
//        componentesOizMPro.add(new BicicletaComponente(oizMPro, cuadroOizOMR));
//        componentesOizMPro.add(new BicicletaComponente(oizMPro, fox32FloatSC));
//        componentesOizMPro.add(new BicicletaComponente(oizMPro, foxFloatDPSPerformance));
//        componentesOizMPro.add(new BicicletaComponente(oizMPro, sramX01));
//        oizMPro.setComponentes(componentesOizMPro);
//
//        // Oiz M21
//        Bicicleta oizM21 = ;
//
//        // Datos Oiz M21
//        List<BicicletaComponente> componentesOizM21 = new ArrayList<>();
//        componentesOizM21.add(new BicicletaComponente(oizM21, cuadroOizOMR));
//        componentesOizM21.add(new BicicletaComponente(oizM21, fox32FloatSC));
//        componentesOizM21.add(new BicicletaComponente(oizM21, foxFloatDPSPerformance));
//        componentesOizM21.add(new BicicletaComponente(oizM21, shimanoXTM8100));
//        oizM21.setComponentes(componentesOizM21);
//
//        // TREK BIKES
//        // Trek Madone SLR 9 AXS
//        Bicicleta madoneSLR9 = ;
//
//        // Datos para Madone SLR 9
//        Componente cuadroMadoneSLR = ;
//        Componente horquillaMadoneSLR = ;
//
//        List<BicicletaComponente> componentesMadoneSLR9 = new ArrayList<>();
//        componentesMadoneSLR9.add(new BicicletaComponente(madoneSLR9, cuadroMadoneSLR));
//        componentesMadoneSLR9.add(new BicicletaComponente(madoneSLR9, horquillaMadoneSLR));
//        componentesMadoneSLR9.add(new BicicletaComponente(madoneSLR9, sramRedAXS));
//        componentesMadoneSLR9.add(new BicicletaComponente(madoneSLR9, sramRed));
//        madoneSLR9.setComponentes(componentesMadoneSLR9);
//        //Trek Supercaliber9_9
//        // Crear componentes
//
//
//        // Crear bicicleta
//        Bicicleta trek99 = ;
//
//        // Asociar componentes a la bicicleta
//        List<BicicletaComponente> componentesList = new ArrayList<>();
//        componentesList.add(new BicicletaComponente(trek99, cuadroSupercaliber9_9));
//        componentesList.add(new BicicletaComponente(trek99, horquillaSupercaliber9_9));
//        componentesList.add(new BicicletaComponente(trek99, cambioTraseroSupercaliber9_9));
//        componentesList.add(new BicicletaComponente(trek99, bielasSupercaliber9_9));
//        componentesList.add(new BicicletaComponente(trek99, ruedasSupercaliber9_9));
//        componentesList.add(new BicicletaComponente(trek99, frenosSupercaliber9_9));
//        componentesList.add(new BicicletaComponente(trek99, manillarSupercaliber9_9));
//
//        trek99.setComponentes(componentesList);
//
//        System.out.println("Creada bicicleta: " + trek99.getModelo());
//
//        //Trek Supercaliber 9.8
//        // Crear componentes
//        Componente cuadroSupercaliber9_8 = ;
//        Componente horquillaSupercaliber9_8 = ;
//        Componente cambioTraseroSupercaliber9_8 = ;
//        Componente bielasSupercaliber9_8 = ;
//        Componente ruedasSupercaliber9_8 = ;
//        Componente frenosSupercaliber9_8 = ;
//        Componente manillarSupercaliber9_8 = ;
//
//        // Crear bicicleta
//        Bicicleta trek98 = ;
//
//        // Asociar componentes a la bicicleta
//        List<BicicletaComponente> componentesListSupercaliber9_8 = new ArrayList<>();
//        componentesList.add(new BicicletaComponente(trek98, cuadroSupercaliber9_8));
//        componentesList.add(new BicicletaComponente(trek98, horquillaSupercaliber9_8));
//        componentesList.add(new BicicletaComponente(trek98, cambioTraseroSupercaliber9_8));
//        componentesList.add(new BicicletaComponente(trek98, bielasSupercaliber9_8));
//        componentesList.add(new BicicletaComponente(trek98, ruedasSupercaliber9_8));
//        componentesList.add(new BicicletaComponente(trek98, frenosSupercaliber9_8));
//        componentesList.add(new BicicletaComponente(trek98, manillarSupercaliber9_8));
//
//        trek98.setComponentes(componentesListSupercaliber9_8);
//
//        System.out.println("Creada bicicleta: " + trek98.getModelo());
//
//        //Scott Spark RC SL
//        // Crear componentes
//
//
//        // Crear bicicleta
//        Bicicleta scottSparkRCSL =;
//
//        // Asociar componentes a la bicicleta
//        List<BicicletaComponente> componentesListSparkRCSL = new ArrayList<>();
//        componentesList.add(new BicicletaComponente(scottSparkRCSL, cuadroSparkRCSL));
//        componentesList.add(new BicicletaComponente(scottSparkRCSL, horquillaSparkRCSL));
//        componentesList.add(new BicicletaComponente(scottSparkRCSL, amortiguadorSparkRCSL));
//        componentesList.add(new BicicletaComponente(scottSparkRCSL, cambioTraseroSparkRCSL));
//        componentesList.add(new BicicletaComponente(scottSparkRCSL, ruedasSparkRCSL));
//        componentesList.add(new BicicletaComponente(scottSparkRCSL, frenosSparkRCSL));
//        componentesList.add(new BicicletaComponente(scottSparkRCSL, bielasSparkRCSL));
//
//        scottSparkRCSL.setComponentes(componentesListSparkRCSL);
//
//        System.out.println("Creada bicicleta: " + scottSparkRCSL.getModelo());
//
//        //Scott Scale 940 Black
//// Crear componentes
//
//
//// Crear bicicleta
//        Bicicleta scottScale940 = ;
//
//// Asociar componentes a la bicicleta
//        List<BicicletaComponente> componentesListScale940 = new ArrayList<>();
//        componentesListScale940.add(new BicicletaComponente(scottScale940, cuadroScale940));
//        componentesListScale940.add(new BicicletaComponente(scottScale940, horquillaScale940));
//        componentesListScale940.add(new BicicletaComponente(scottScale940, cambioTraseroScale940));
//        componentesListScale940.add(new BicicletaComponente(scottScale940, manetasScale940));
//        componentesListScale940.add(new BicicletaComponente(scottScale940, ruedasScale940));
//        componentesListScale940.add(new BicicletaComponente(scottScale940, frenosScale940));
//        componentesListScale940.add(new BicicletaComponente(scottScale940, bielasScale940));
//
//        scottScale940.setComponentes(componentesListScale940);
//
////Scott Scale RC Team
//// Crear componentes
//
//
//// Crear bicicleta
//        Bicicleta scottScaleRCTeam = ;
//
//// Asociar componentes a la bicicleta
//        List<BicicletaComponente> componentesListScaleRCTeam = new ArrayList<>();
//        componentesListScaleRCTeam.add(new BicicletaComponente(scottScaleRCTeam, cuadroScaleRCTeam));
//        componentesListScaleRCTeam.add(new BicicletaComponente(scottScaleRCTeam, horquillaScaleRCTeam));
//        componentesListScaleRCTeam.add(new BicicletaComponente(scottScaleRCTeam, cambioTraseroScaleRCTeam));
//        componentesListScaleRCTeam.add(new BicicletaComponente(scottScaleRCTeam, manetasScaleRCTeam));
//        componentesListScaleRCTeam.add(new BicicletaComponente(scottScaleRCTeam, ruedasScaleRCTeam));
//        componentesListScaleRCTeam.add(new BicicletaComponente(scottScaleRCTeam, frenosScaleRCTeam));
//        componentesListScaleRCTeam.add(new BicicletaComponente(scottScaleRCTeam, bielasScaleRCTeam));
//
//        scottScaleRCTeam.setComponentes(componentesListScaleRCTeam);
//
////Scott Spark RC Team
//// Crear componentes
//  ;
//
//
//// Crear bicicleta
//        Bicicleta scottSparkRCTeam =;
//
//// Asociar componentes a la bicicleta
//        List<BicicletaComponente> componentesListSparkRCTeam = new ArrayList<>();
//        componentesListSparkRCTeam.add(new BicicletaComponente(scottSparkRCTeam, cuadroSparkRCTeam));
//        componentesListSparkRCTeam.add(new BicicletaComponente(scottSparkRCTeam, horquillaSparkRCTeam));
//        componentesListSparkRCTeam.add(new BicicletaComponente(scottSparkRCTeam, amortiguadorSparkRCTeam));
//        componentesListSparkRCTeam.add(new BicicletaComponente(scottSparkRCTeam, cambioTraseroSparkRCTeam));
//        componentesListSparkRCTeam.add(new BicicletaComponente(scottSparkRCTeam, ruedasSparkRCTeam));
//        componentesListSparkRCTeam.add(new BicicletaComponente(scottSparkRCTeam, frenosSparkRCTeam));
//        componentesListSparkRCTeam.add(new BicicletaComponente(scottSparkRCTeam, bielasSparkRCTeam));
//
//        scottSparkRCTeam.setComponentes(componentesListSparkRCTeam);
//
////Scott Addict Gravel RC
//// Crear componentes
//
//
//// Crear bicicleta
//        Bicicleta scottAddictRC1 = ;
//
//// Asociar componentes a la bicicleta
//        List<BicicletaComponente> componentesListAddictRC1 = new ArrayList<>();
//        componentesListAddictRC1.add(new BicicletaComponente(scottAddictRC1, cuadroAddictGravelRC));
//        componentesListAddictRC1.add(new BicicletaComponente(scottAddictRC1, horquillaAddictGravelRC));
//        componentesListAddictRC1.add(new BicicletaComponente(scottAddictRC1, cambioTraseroAddictGravelRC));
//        componentesListAddictRC1.add(new BicicletaComponente(scottAddictRC1, desviadorAddictGravelRC));
//        componentesListAddictRC1.add(new BicicletaComponente(scottAddictRC1, ruedasAddictGravelRC));
//        componentesListAddictRC1.add(new BicicletaComponente(scottAddictRC1, frenosAddictGravelRC));
//        componentesListAddictRC1.add(new BicicletaComponente(scottAddictRC1, bielasAddictGravelRC));
//
//        scottAddictRC1.setComponentes(componentesListAddictRC1);
//
////Scott Addict Gravel RC 2
//// Crear componentes
//
//
//// Crear bicicleta
//        Bicicleta scottAddictRC2 = ;
//
//// Asociar componentes a la bicicleta
//        List<BicicletaComponente> componentesListAddictRC2 = new ArrayList<>();
//        componentesListAddictRC2.add(new BicicletaComponente(scottAddictRC2, cuadroAddictGravelRC2));
//        componentesListAddictRC2.add(new BicicletaComponente(scottAddictRC2, horquillaAddictGravelRC2));
//        componentesListAddictRC2.add(new BicicletaComponente(scottAddictRC2, cambioTraseroAddictGravelRC2));
//        componentesListAddictRC2.add(new BicicletaComponente(scottAddictRC2, desviadorAddictGravelRC2));
//        componentesListAddictRC2.add(new BicicletaComponente(scottAddictRC2, ruedasAddictGravelRC2));
//        componentesListAddictRC2.add(new BicicletaComponente(scottAddictRC2, frenosAddictGravelRC2));
//        componentesListAddictRC2.add(new BicicletaComponente(scottAddictRC2, bielasAddictGravelRC2));
//
//        scottAddictRC2.setComponentes(componentesListAddictRC2);
//
////Orbea Orca M30
//// Crear componentes
//
//
//// Crear bicicleta
//        Bicicleta orbeaOrcaM30 =;
//
//// Asociar componentes a la bicicleta
//        List<BicicletaComponente> componentesListOrcaM30 = new ArrayList<>();
//        componentesListOrcaM30.add(new BicicletaComponente(orbeaOrcaM30, cuadroOrcaM30));
//        componentesListOrcaM30.add(new BicicletaComponente(orbeaOrcaM30, horquillaOrcaM30));
//        componentesListOrcaM30.add(new BicicletaComponente(orbeaOrcaM30, cambioTraseroOrcaM30));
//        componentesListOrcaM30.add(new BicicletaComponente(orbeaOrcaM30, desviadorOrcaM30));
//        componentesListOrcaM30.add(new BicicletaComponente(orbeaOrcaM30, ruedasOrcaM30));
//        componentesListOrcaM30.add(new BicicletaComponente(orbeaOrcaM30, frenosOrcaM30));
//        componentesListOrcaM30.add(new BicicletaComponente(orbeaOrcaM30, bielasOrcaM30));
//
//        orbeaOrcaM30.setComponentes(componentesListOrcaM30);
//        // Specialized Tarmac SL7 Comp
//// Crear componentes
//
//
//// Crear bicicleta
//        Bicicleta specializedTarmac =;
//
//// Asociar componentes a la bicicleta
//        List<BicicletaComponente> componentesListTarmac = new ArrayList<>();
//        componentesListTarmac.add(new BicicletaComponente(specializedTarmac, cuadroTarmac));
//        componentesListTarmac.add(new BicicletaComponente(specializedTarmac, horquillaTarmac));
//        componentesListTarmac.add(new BicicletaComponente(specializedTarmac, cambioTraseroTarmac));
//        componentesListTarmac.add(new BicicletaComponente(specializedTarmac, desviadorTarmac));
//        componentesListTarmac.add(new BicicletaComponente(specializedTarmac, ruedasTarmac));
//        componentesListTarmac.add(new BicicletaComponente(specializedTarmac, frenosTarmac));
//        componentesListTarmac.add(new BicicletaComponente(specializedTarmac, bielasTarmac));
//        componentesListTarmac.add(new BicicletaComponente(specializedTarmac, manillarTarmac));
//        componentesListTarmac.add(new BicicletaComponente(specializedTarmac, sillinTarmac));
//
//        specializedTarmac.setComponentes(componentesListTarmac);
//
//// Trek Fuel EX 8
//// Crear componentes
//
//
//// Crear bicicleta
//        Bicicleta trekFuelEX = ;
//
//// Asociar componentes a la bicicleta
//        List<BicicletaComponente> componentesListFuelEX = new ArrayList<>();
//        componentesListFuelEX.add(new BicicletaComponente(trekFuelEX, cuadroFuelEX));
//        componentesListFuelEX.add(new BicicletaComponente(trekFuelEX, horquillaFuelEX));
//        componentesListFuelEX.add(new BicicletaComponente(trekFuelEX, amortiguadorFuelEX));
//        componentesListFuelEX.add(new BicicletaComponente(trekFuelEX, cambioTraseroFuelEX));
//        componentesListFuelEX.add(new BicicletaComponente(trekFuelEX, manetasCambioFuelEX));
//        componentesListFuelEX.add(new BicicletaComponente(trekFuelEX, ruedasFuelEX));
//        componentesListFuelEX.add(new BicicletaComponente(trekFuelEX, frenosFuelEX));
//        componentesListFuelEX.add(new BicicletaComponente(trekFuelEX, bielasFuelEX));
//        componentesListFuelEX.add(new BicicletaComponente(trekFuelEX, casseteFuelEX));
//        componentesListFuelEX.add(new BicicletaComponente(trekFuelEX, manillarFuelEX));
//        componentesListFuelEX.add(new BicicletaComponente(trekFuelEX, tijaSillinFuelEX));
//
//        trekFuelEX.setComponentes(componentesListFuelEX);
//
//// Giant Revolt Advanced 2
//// Crear componentes
//
//
//// Crear bicicleta
//        Bicicleta giantRevolt =;
//
//// Asociar componentes a la bicicleta
//        List<BicicletaComponente> componentesListRevolt = new ArrayList<>();
//        componentesListRevolt.add(new BicicletaComponente(giantRevolt, cuadroRevolt));
//        componentesListRevolt.add(new BicicletaComponente(giantRevolt, horquillaRevolt));
//        componentesListRevolt.add(new BicicletaComponente(giantRevolt, cambioTraseroRevolt));
//        componentesListRevolt.add(new BicicletaComponente(giantRevolt, desviadorRevolt));
//        componentesListRevolt.add(new BicicletaComponente(giantRevolt, manetasCambioRevolt));
//        componentesListRevolt.add(new BicicletaComponente(giantRevolt, ruedasRevolt));
//        componentesListRevolt.add(new BicicletaComponente(giantRevolt, cubiertasRevolt));
//        componentesListRevolt.add(new BicicletaComponente(giantRevolt, frenosRevolt));
//        componentesListRevolt.add(new BicicletaComponente(giantRevolt, bielasRevolt));
//        componentesListRevolt.add(new BicicletaComponente(giantRevolt, casseteRevolt));
//        componentesListRevolt.add(new BicicletaComponente(giantRevolt, manillarRevolt));
//        componentesListRevolt.add(new BicicletaComponente(giantRevolt, tijaSillinRevolt));
//
//        giantRevolt.setComponentes(componentesListRevolt);
//
//// Cannondale Synapse Carbon 4
//// Crear componentes
//
//
//// Crear bicicleta
//        Bicicleta cannondaleSynapse = ;
//
//// Asociar componentes a la bicicleta
//        List<BicicletaComponente> componentesListSynapse = new ArrayList<>();
//        componentesListSynapse.add(new BicicletaComponente(cannondaleSynapse, cuadroSynapse));
//        componentesListSynapse.add(new BicicletaComponente(cannondaleSynapse, horquillaSynapse));
//        componentesListSynapse.add(new BicicletaComponente(cannondaleSynapse, cambioTraseroSynapse));
//        componentesListSynapse.add(new BicicletaComponente(cannondaleSynapse, desviadorSynapse));
//        componentesListSynapse.add(new BicicletaComponente(cannondaleSynapse, manetasCambioSynapse));
//        componentesListSynapse.add(new BicicletaComponente(cannondaleSynapse, ruedasSynapse));
//        componentesListSynapse.add(new BicicletaComponente(cannondaleSynapse, cubiertasSynapse));
//        componentesListSynapse.add(new BicicletaComponente(cannondaleSynapse, frenosSynapse));
//        componentesListSynapse.add(new BicicletaComponente(cannondaleSynapse, bielasSynapse));
//        componentesListSynapse.add(new BicicletaComponente(cannondaleSynapse, casseteSynapse));
//        componentesListSynapse.add(new BicicletaComponente(cannondaleSynapse, manillarSynapse));
//        componentesListSynapse.add(new BicicletaComponente(cannondaleSynapse, sillinSynapse));
//
//        cannondaleSynapse.setComponentes(componentesListSynapse);
//
//        // Belador BR RED AXS PWM
//// Crear componentes
//
//
//// Crear bicicleta
//        Bicicleta beladorBRRedAXS = ;
//
//// Asociar componentes a la bicicleta
//        List<BicicletaComponente> componentesListBelador = new ArrayList<>();
//        componentesListBelador.add(new BicicletaComponente(beladorBRRedAXS, cuadroBeladorBRREDAXS));
//        componentesListBelador.add(new BicicletaComponente(beladorBRRedAXS, horquillaBeladorBRREDAXS));
//        componentesListBelador.add(new BicicletaComponente(beladorBRRedAXS, manillarBeladorBRREDAXS));
//        componentesListBelador.add(new BicicletaComponente(beladorBRRedAXS, tijaSillinBeladorBRREDAXS));
//        componentesListBelador.add(new BicicletaComponente(beladorBRRedAXS, sillinBeladorBRREDAXS));
//        componentesListBelador.add(new BicicletaComponente(beladorBRRedAXS, ruedasBeladorBRREDAXS));
//        componentesListBelador.add(new BicicletaComponente(beladorBRRedAXS, cubiertasBeladorBRREDAXS));
//        componentesListBelador.add(new BicicletaComponente(beladorBRRedAXS, manetasBeladorBRREDAXS));
//        componentesListBelador.add(new BicicletaComponente(beladorBRRedAXS, cambiotraseroBeladorBRREDAXS));
//        componentesListBelador.add(new BicicletaComponente(beladorBRRedAXS, desviadorBeladorBRREDAXS));
//        componentesListBelador.add(new BicicletaComponente(beladorBRRedAXS, bielasBeladorBRREDAXS));
//        componentesListBelador.add(new BicicletaComponente(beladorBRRedAXS, cadenaBeladorBRREDAXS));
//        componentesListBelador.add(new BicicletaComponente(beladorBRRedAXS, cassetteBeladorBRREDAXS));
//        componentesListBelador.add(new BicicletaComponente(beladorBRRedAXS, frenosBeladorBRREDAXS));
//        componentesListBelador.add(new BicicletaComponente(beladorBRRedAXS, pedalierBeladorBRREDAXS));
//
//        beladorBRRedAXS.setComponentes(componentesListBelador);
//
//        // Ultimate CFR Di2 Aero
//// Crear componentes
//
//
//// Crear bicicleta
//        Bicicleta ultimateCFRDi2 = ;
//
//// Asociar componentes a la bicicleta
//        List<BicicletaComponente> componentesListUltimate = new ArrayList<>();
//        componentesListUltimate.add(new BicicletaComponente(ultimateCFRDi2, cuadroUltimateCFR));
//        componentesListUltimate.add(new BicicletaComponente(ultimateCFRDi2, horquillaUltimateCFR));
//        componentesListUltimate.add(new BicicletaComponente(ultimateCFRDi2, manillarUltimateCFR));
//        componentesListUltimate.add(new BicicletaComponente(ultimateCFRDi2, tijasillinUltimateCFR));
//        componentesListUltimate.add(new BicicletaComponente(ultimateCFRDi2, sillinUltimateCFR));
//        componentesListUltimate.add(new BicicletaComponente(ultimateCFRDi2, ruedasUltimateCFR));
//        componentesListUltimate.add(new BicicletaComponente(ultimateCFRDi2, cubiertasUltimateCFR));
//        componentesListUltimate.add(new BicicletaComponente(ultimateCFRDi2, manetascambioUltimateCFR));
//        componentesListUltimate.add(new BicicletaComponente(ultimateCFRDi2, cambiotraseroUltimateCFR));
//        componentesListUltimate.add(new BicicletaComponente(ultimateCFRDi2, desviadorUltimateCFR));
//        componentesListUltimate.add(new BicicletaComponente(ultimateCFRDi2, bielasUltimateCFR));
//        componentesListUltimate.add(new BicicletaComponente(ultimateCFRDi2, cadenaUltimateCFR));
//        componentesListUltimate.add(new BicicletaComponente(ultimateCFRDi2, casetteUltimateCFR));
//        componentesListUltimate.add(new BicicletaComponente(ultimateCFRDi2, frenosUltimateCFR));
//        componentesListUltimate.add(new BicicletaComponente(ultimateCFRDi2, pedalierUltimateCFR));
//
//        ultimateCFRDi2.setComponentes(componentesListUltimate);
//        // Grand Canyon 7
//// Crear componentes
//
//
//// Crear bicicleta
//        Bicicleta grandCanyon7 = ;
//
//// Asociar componentes a la bicicleta
//        List<BicicletaComponente> componentesListGrandCanyon = new ArrayList<>();
//        componentesListGrandCanyon.add(new BicicletaComponente(grandCanyon7, cuadroGrandCanyon7));
//        componentesListGrandCanyon.add(new BicicletaComponente(grandCanyon7, horquillaGrandCanyon7));
//        componentesListGrandCanyon.add(new BicicletaComponente(grandCanyon7, cambioTraseroGrandCanyon7));
//        componentesListGrandCanyon.add(new BicicletaComponente(grandCanyon7, manetasGrandCanyon7));
//        componentesListGrandCanyon.add(new BicicletaComponente(grandCanyon7, cassetteGrandCanyon7));
//        componentesListGrandCanyon.add(new BicicletaComponente(grandCanyon7, bielasGrandCanyon7));
//        componentesListGrandCanyon.add(new BicicletaComponente(grandCanyon7, bujesGrandCanyon7));
//        componentesListGrandCanyon.add(new BicicletaComponente(grandCanyon7, cadenaGrandCanyon7));
//        componentesListGrandCanyon.add(new BicicletaComponente(grandCanyon7, frenosGrandCanyon7));
//        componentesListGrandCanyon.add(new BicicletaComponente(grandCanyon7, discoFrenoTraseroGrandCanyon7));
//        componentesListGrandCanyon.add(new BicicletaComponente(grandCanyon7, discoFrenoDelanteroGrandCanyon7));
//        componentesListGrandCanyon.add(new BicicletaComponente(grandCanyon7, ruedaTraseraGrandCanyon7));
//        componentesListGrandCanyon.add(new BicicletaComponente(grandCanyon7, ruedaDelanteraGrandCanyon7));
//        componentesListGrandCanyon.add(new BicicletaComponente(grandCanyon7, cubiertasGrandCanyon7));
//        componentesListGrandCanyon.add(new BicicletaComponente(grandCanyon7, manillarGrandCanyon7));
//        componentesListGrandCanyon.add(new BicicletaComponente(grandCanyon7, sillinGrandCanyon7));
//        componentesListGrandCanyon.add(new BicicletaComponente(grandCanyon7, tijaGrandCanyon7));
//
//        grandCanyon7.setComponentes(componentesListGrandCanyon);
//
//        // Lux World Cup CFR AXS
//// Crear componentes
//
//// Crear bicicleta
//        Bicicleta luxWorldCup = ;
//
//// Asociar componentes a la bicicleta
//        List<BicicletaComponente> componentesListLuxWorldCup = new ArrayList<>();
//        componentesListLuxWorldCup.add(new BicicletaComponente(luxWorldCup, cuadroLuxWorldCup));
//        componentesListLuxWorldCup.add(new BicicletaComponente(luxWorldCup, amortiguadorLuxWorldCup));
//        componentesListLuxWorldCup.add(new BicicletaComponente(luxWorldCup, horquillaLuxWorldCup));
//        componentesListLuxWorldCup.add(new BicicletaComponente(luxWorldCup, cambioTraseroLuxWorldCup));
//        componentesListLuxWorldCup.add(new BicicletaComponente(luxWorldCup, manetasLuxWorldCup));
//        componentesListLuxWorldCup.add(new BicicletaComponente(luxWorldCup, cassetteLuxWorldCup));
//        componentesListLuxWorldCup.add(new BicicletaComponente(luxWorldCup, bielasLuxWorldCup));
//        componentesListLuxWorldCup.add(new BicicletaComponente(luxWorldCup, bujesLuxWorldCup));
//        componentesListLuxWorldCup.add(new BicicletaComponente(luxWorldCup, cadenaLuxWorldCup));
//        componentesListLuxWorldCup.add(new BicicletaComponente(luxWorldCup, cierreCadenaLuxWorldCup));
//        componentesListLuxWorldCup.add(new BicicletaComponente(luxWorldCup, frenosLuxWorldCup));
//        componentesListLuxWorldCup.add(new BicicletaComponente(luxWorldCup, discoTraseroLuxWorldCup));
//        componentesListLuxWorldCup.add(new BicicletaComponente(luxWorldCup, discoDelanteroLuxWorldCup));
//        componentesListLuxWorldCup.add(new BicicletaComponente(luxWorldCup, ruedaTraseraLuxWorldCup));
//        componentesListLuxWorldCup.add(new BicicletaComponente(luxWorldCup, ruedaDelanteraLuxWorldCup));
//        componentesListLuxWorldCup.add(new BicicletaComponente(luxWorldCup, cubiertaTraseraLuxWorldCup));
//        componentesListLuxWorldCup.add(new BicicletaComponente(luxWorldCup, cubiertaDelanteraLuxWorldCup));
//        componentesListLuxWorldCup.add(new BicicletaComponente(luxWorldCup, manillarLuxWorldCup));
//        componentesListLuxWorldCup.add(new BicicletaComponente(luxWorldCup, sillinLuxWorldCup));
//        componentesListLuxWorldCup.add(new BicicletaComponente(luxWorldCup, tijaLuxWorldCup));
//
//        luxWorldCup.setComponentes(componentesListLuxWorldCup);
//
//        // Allroad HPR Elite Apex
//// Crear componentes
//
//// Crear bicicleta
//        Bicicleta allroadHPR = ;
//
//// Asociar componentes a la bicicleta
//        List<BicicletaComponente> componentesListAllroadHPR = new ArrayList<>();
//        componentesListAllroadHPR.add(new BicicletaComponente(allroadHPR, cuadroAllroadHPR));
//        componentesListAllroadHPR.add(new BicicletaComponente(allroadHPR, horquillaAllroadHPR));
//        componentesListAllroadHPR.add(new BicicletaComponente(allroadHPR, manillarAllroadHPR));
//        componentesListAllroadHPR.add(new BicicletaComponente(allroadHPR, tijaSillinAllroadHPR));
//        componentesListAllroadHPR.add(new BicicletaComponente(allroadHPR, sillinAllroadHPR));
//        componentesListAllroadHPR.add(new BicicletaComponente(allroadHPR, ruedasAllroadHPR));
//        componentesListAllroadHPR.add(new BicicletaComponente(allroadHPR, cubiertasAllroadHPR));
//        componentesListAllroadHPR.add(new BicicletaComponente(allroadHPR, mandosAllroadHPR));
//        componentesListAllroadHPR.add(new BicicletaComponente(allroadHPR, cambioAllroadHPR));
//        componentesListAllroadHPR.add(new BicicletaComponente(allroadHPR, bielasAllroadHPR));
//        componentesListAllroadHPR.add(new BicicletaComponente(allroadHPR, cadenaAllroadHPR));
//        componentesListAllroadHPR.add(new BicicletaComponente(allroadHPR, cassetteAllroadHPR));
//        componentesListAllroadHPR.add(new BicicletaComponente(allroadHPR, bujesAllroadHPR));
//        componentesListAllroadHPR.add(new BicicletaComponente(allroadHPR, frenosAllroadHPR));
//
//        allroadHPR.setComponentes(componentesListAllroadHPR);
//
//    }
//
//
//}