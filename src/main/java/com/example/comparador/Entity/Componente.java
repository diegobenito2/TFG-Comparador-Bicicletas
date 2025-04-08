package com.example.comparador.Entity;


import com.example.comparador.Entity.ENUM.TipoComponente;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Componente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;
    private TipoComponente tipo;

    // Relación inversa con la tabla intermedia (opcional)
    @OneToMany(mappedBy = "componente")
    private List<BicicletaComponente> bicicletaComponentes;

    public Componente() {
    }

    public Componente(String descripcion, TipoComponente tipo) {
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoComponente getTipo() {
        return tipo;
    }

    public void setTipo(TipoComponente tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }



    public List<BicicletaComponente> getBicicletaComponentes() {
        return bicicletaComponentes;
    }

    public void setBicicletaComponentes(List<BicicletaComponente> bicicletaComponentes) {
        this.bicicletaComponentes = bicicletaComponentes;
    }
}



