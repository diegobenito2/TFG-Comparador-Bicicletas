package com.example.comparador.Controller;

import com.example.comparador.Entity.Bicicleta;
import com.example.comparador.Entity.BicicletaComponente;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class BicicletaComparadorDTO {
    public Long id;
    public String modelo;
    public String tipo;
    public String familia;
    public String precio;
    public String imagenUrl;
    public String masInfoUrl;
    public String nombreCompleto;
    public List<ComponenteDTO> componentes;

    public BicicletaComparadorDTO(Bicicleta bici) {
        this.id = bici.getId();
        this.modelo = bici.getModelo();
        this.tipo = bici.getTipo().toString();
        this.familia = bici.getFamilia();
        BigDecimal precio = bici.getPrecio();
        this.precio = precio.scale() > 0 && precio.stripTrailingZeros().scale() > 0
                ? String.format("%,.2f", precio).replace('.', '#').replace(',', '.').replace('#', ',')
                : String.format("%,.0f", precio).replace('.', '.');

        this.imagenUrl = bici.getImagenUrl();
        this.masInfoUrl = bici.getMasInfoUrl();
        this.nombreCompleto = bici.getNombreCompleto();
        this.componentes = bici.getComponentes().stream()
                .map(ComponenteDTO::new)
                .collect(Collectors.toList());
    }

    public static class ComponenteDTO {
        public String tipo;
        public String descripcion;

        public ComponenteDTO(BicicletaComponente bc) {
            this.tipo = bc.getComponente().getTipo().getNombre();
            this.descripcion = bc.getComponente().getDescripcion();
        }
    }
}

