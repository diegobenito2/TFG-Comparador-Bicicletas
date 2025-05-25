package com.example.comparador.Entity;

import com.example.comparador.Entity.ENUM.MaterialCuadro;
import com.example.comparador.Entity.ENUM.TipoBicicleta;
import com.example.comparador.Entity.ENUM.TipoCambio;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "bicicleta")
public class Bicicleta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marcaNombre;

    private String modelo;

    private String nombreCompleto;

    private BigDecimal precio;

    private String familia;

    @Enumerated(EnumType.STRING)
    private TipoBicicleta tipo;

    @Enumerated(EnumType.STRING)
    private MaterialCuadro materialCuadro;

    @Enumerated(EnumType.STRING)
    private TipoCambio tipoCambio;

    private BigDecimal peso;
    private String imagenUrl;
    private String masInfoUrl;

    private int calificacion;


    @OneToMany(mappedBy = "bicicleta", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<BicicletaComponente> componentes = new ArrayList<>();

    // Constructores, getters y setters

    public Bicicleta(String modelo, BigDecimal precio, TipoBicicleta tipo, MaterialCuadro materialCuadro, TipoCambio tipoCambio, BigDecimal peso, String imagenUrl, String masInfoUrl, String marcaNombre, int calificacion, List<BicicletaComponente> componentes) {
        this.modelo = modelo;
        this.precio = precio;
        this.tipo = tipo;
        this.materialCuadro = materialCuadro;
        this.tipoCambio = tipoCambio;
        this.peso = peso;
        this.imagenUrl = imagenUrl;
        this.masInfoUrl = masInfoUrl;
        this.marcaNombre = marcaNombre;
        this.componentes = componentes;
        this.nombreCompleto = getMarcaNombre() + " " + getModelo();
        obtenerFamilia();
        this.calificacion = calificacion;
    }

    public Bicicleta(String modelo, BigDecimal precio, TipoBicicleta tipo, MaterialCuadro materialCuadro, TipoCambio tipoCambio, BigDecimal peso, String imagenUrl, String masInfoUrl, String marcaNombre, int calificacion) {
        this.modelo = modelo;
        this.precio = precio;
        this.tipo = tipo;
        this.materialCuadro = materialCuadro;
        this.tipoCambio = tipoCambio;
        this.peso = peso;
        this.imagenUrl = imagenUrl;
        this.masInfoUrl = masInfoUrl;
        this.marcaNombre = marcaNombre;
        this.nombreCompleto = getMarcaNombre() + " " + getModelo();
        obtenerFamilia();
        this.calificacion = calificacion;
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

    public List<BicicletaComponente> getComponentes() {
        return componentes;
    }

    public void setComponentes(List<BicicletaComponente> componentes) {
        this.componentes = componentes;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    private void obtenerFamilia() {
        int indiceEspacio = getModelo().indexOf(' '); // Coge el índice del primer espacio
        if (indiceEspacio != -1) { // Comprueba que la cadena no está vacía.
            this.familia = getModelo().substring(0, indiceEspacio); // Coge el texto de antes del primer espacio.
        } else {
            this.familia = getModelo();
        }
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}


