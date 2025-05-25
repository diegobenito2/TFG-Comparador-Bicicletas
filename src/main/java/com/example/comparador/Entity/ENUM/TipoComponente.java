package com.example.comparador.Entity.ENUM;

public enum TipoComponente {
    Cuadro("Cuadro", "Parte principal del chasis de la bicicleta, a la que se conectan todos los componentes."),
    Horquilla("Horquilla", "Soporte frontal que sostiene la rueda delantera."),
    Amortiguador("Amortiguador", "Sistema que absorbe impactos y mejora la comodidad."),
    Manillar("Manillar", "Parte que permite dirigir la bicicleta."),
    Desviador("Desviador", "Mecanismo que mueve la cadena entre platos."),
    Manetas_Cambio("Manetas Cambio", "Controles para cambiar de marcha."),
    Cambio_Trasero("Cambio Trasero", "Mecanismo que mueve la cadena entre piñones traseros."),
    Plato("Plato", "Engranaje conectado a los pedales."),
    Bielas("Bielas", "Barras que unen los pedales con el eje del pedalier."),
    Cassette("Cassette", "Conjunto de piñones traseros."),
    Cadena("Cadena", "Transfiere el movimiento de los pedales a la rueda trasera."),
    Frenos("Frenos", "Sistema para detener o reducir la velocidad."),
    Disco("Disco", "Parte del freno en la rueda que permite detenerla."),
    Ruedas("Ruedas", "Conjunto de llanta, radios y neumático."),
    Cubiertas("Cubiertas", "Parte exterior de la rueda que tiene contacto con el suelo."),
    Tija_Sillin("Tija Sillin", "Tubo que conecta el sillín con el cuadro."),
    Sillin("Sillin", "Asiento de la bicicleta."),
    Bujes("Bujes", "Centro de la rueda, donde se alojan los rodamientos."),
    Pedalier("Pedalier", "Conjunto de rodamientos y eje que permite girar las bielas.");

    private final String nombre;
    private final String descripcion;

    TipoComponente(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public static String obtenerDescripcionPorNombre(String nombre) {
        for (TipoComponente tipo : values()) {
            if (tipo.getNombre().equalsIgnoreCase(nombre.trim())) {
                return tipo.getDescripcion();
            }
        }
        return "Sin descripción";
    }
}


