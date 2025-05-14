package com.example.comparador.Entity;
import jakarta.persistence.*;

@Entity
public class BicicletaComponente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "bicicletaid")
    private Bicicleta bicicleta;

    @ManyToOne
    @JoinColumn(name = "componenteid")
    private Componente componente;

    // Constructor vacío

    public BicicletaComponente(Bicicleta bicicleta, Componente componente) {
        this.bicicleta = bicicleta;
        this.componente = componente;
    }

    public BicicletaComponente() {

    }

    // Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Bicicleta getBicicleta() {
        return bicicleta;
    }

    public void setBicicleta(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }

    public Componente getComponente() {
        return componente;
    }

    public void setComponente(Componente componente) {
        this.componente = componente;
    }
}


