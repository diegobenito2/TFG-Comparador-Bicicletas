package com.example.comparador.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "bicicleta_componente")
public class Bicicleta_Componente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "bicicleta_id")
    private Bicicleta bicicleta;

    @ManyToOne
    @JoinColumn(name = "componente_id")
    private Componente componente;

    public Bicicleta_Componente() {
    }

    public Bicicleta_Componente(Long id, Bicicleta bicicleta, Componente componente) {
        this.id = id;
        this.bicicleta = bicicleta;
        this.componente = componente;
    }

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

