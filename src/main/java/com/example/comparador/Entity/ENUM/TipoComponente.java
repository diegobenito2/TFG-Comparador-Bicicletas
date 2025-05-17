package com.example.comparador.Entity.ENUM;

public enum TipoComponente {
    Cuadro("Cuadro"),
    Horquilla("Horquilla"),
    Amortiguador("Amortiguador"),
    Manillar("Manillar"),
    Desviador("Desviador"),
    Manetas_Cambio("Manetas Cambio"),
    Cambio_Trasero("Cambio Trasero"),
    Plato("Plato"),
    Bielas("Bielas"),
    Cassette("Cassette"),
    Cadena("Cadena"),
    Frenos("Frenos"),
    Disco("Disco"),
    Ruedas("Ruedas"),
    Cubiertas("Cubiertas"),
    Tija_Sillin("Tija Sillin"),
    Sillin("Sillin"),
    Bujes("Bujes"),
    Pedalier("Pedalier");

    private final String nombre;

    TipoComponente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}


