package com.example.comparador.Entity.ENUM;

public enum MaterialCuadro {
    ALUMINIO("Aluminio"), CARBONO("Carbono");
    private String materialCuadro;

    MaterialCuadro(String materialCuadro) {
        this.materialCuadro = materialCuadro;
    }

    public String getMaterialCuadro() {
        return materialCuadro;
    }

    @Override
    public String toString() {
        return materialCuadro;
    }
}
