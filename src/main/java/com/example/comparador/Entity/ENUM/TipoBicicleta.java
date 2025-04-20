package com.example.comparador.Entity.ENUM;

public enum TipoBicicleta {
    CARRETERA("Carretera"), MONTANA("Montaña"), GRAVEL("Gravel");

    private String tipo;

    TipoBicicleta(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return tipo;
    }
}
