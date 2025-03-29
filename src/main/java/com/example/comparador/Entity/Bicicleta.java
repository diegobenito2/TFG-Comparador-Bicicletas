package com.example.comparador.Entity;

import com.example.comparador.Entity.ENUM.MaterialCuadro;
import com.example.comparador.Entity.ENUM.TipoBicicleta;
import com.example.comparador.Entity.ENUM.TipoCambio;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "bicicleta")
public class Bicicleta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String modelo;

    private BigDecimal precio;

    @Enumerated(EnumType.STRING)
    private TipoBicicleta tipo;

    @Enumerated(EnumType.STRING)
    private MaterialCuadro materialCuadro;
    @Enumerated(EnumType.STRING)
    private TipoCambio tipoCambio;

    private BigDecimal peso;

    private String imagenUrl;

    private String masInfoUrl;

    private String marcaNombre;

    public Bicicleta(String modelo, BigDecimal precio, TipoBicicleta tipo, MaterialCuadro materialCuadro, TipoCambio tipoCambio, BigDecimal peso, String imagenUrl, String masInfoUrl, String marcaNombre) {
        this.modelo = modelo;
        this.precio = precio;
        this.tipo = tipo;
        this.materialCuadro = materialCuadro;
        this.tipoCambio = tipoCambio;
        this.peso = peso;
        this.imagenUrl = imagenUrl;
        this.masInfoUrl = masInfoUrl;
        this.marcaNombre = marcaNombre;
    }


    public Bicicleta() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public TipoBicicleta getTipo() {
        return tipo;
    }

    public void setTipo(TipoBicicleta tipo) {
        this.tipo = tipo;
    }

    public MaterialCuadro getMaterialCuadro() {
        return materialCuadro;
    }

    public void setMaterialCuadro(MaterialCuadro materialCuadro) {
        this.materialCuadro = materialCuadro;
    }

    public TipoCambio getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(TipoCambio tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

    public String getMasInfoUrl() {
        return masInfoUrl;
    }

    public void setMasInfoUrl(String masInfoUrl) {
        this.masInfoUrl = masInfoUrl;
    }

    public String getMarcaNombre() {
        return marcaNombre;
    }

    public void setMarcaNombre(String marcaNombre) {
        this.marcaNombre = marcaNombre;
    }
}

