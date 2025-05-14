package com.example.comparador.Controller;

import com.example.comparador.Entity.Bicicleta;
import com.example.comparador.Entity.BicicletaComponente;

import java.util.List;
import java.util.stream.Collectors;

public class BicicletaComparadorDTO {
    public String modelo;
    public String tipo;
    public String familia;
    public String precio;
    public String imagenUrl;
    public String masInfoUrl;
    public List<ComponenteDTO> componentes;

    public BicicletaComparadorDTO(Bicicleta bici) {
        this.modelo = bici.getModelo();
        this.tipo = bici.getTipo().toString();
        this.familia = bici.getFamilia();
        this.precio = bici.getPrecio().toPlainString();
        this.imagenUrl = bici.getImagenUrl();
        this.masInfoUrl = bici.getMasInfoUrl();
        this.componentes = bici.getComponentes().stream()
                .map(ComponenteDTO::new)
                .collect(Collectors.toList());
    }

    public static class ComponenteDTO {
        public String tipo;
        public String nombre;

        public ComponenteDTO(BicicletaComponente bc) {
            this.tipo = bc.getComponente().getTipo().toString();
            this.nombre = bc.getComponente().getDescripcion();
        }
    }
}

