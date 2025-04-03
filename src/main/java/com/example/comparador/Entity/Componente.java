package com.example.comparador.Entity;


import com.example.comparador.Entity.ENUM.TipoComponente;
import jakarta.persistence.*;

@Entity
@Table(name = "componente")
public class Componente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String descripcion;

    @Enumerated(EnumType.STRING)
    private TipoComponente tipo;

    public Componente(String descripcion, TipoComponente tipo) {
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    public Componente() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoComponente getTipo() {
        return tipo;
    }

    public void setTipo(TipoComponente tipo) {
        this.tipo = tipo;
    }
}

