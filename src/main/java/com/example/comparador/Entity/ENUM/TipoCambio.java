package com.example.comparador.Entity.ENUM;

public enum TipoCambio {
    MECANICO("Mecánico"), ELECTRONICO("Electrónico");

    private String tipoCambio;

    TipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public String getTipoCambio() {
        return tipoCambio;
    }

    @Override
    public String toString() {
        return tipoCambio;
    }
}
