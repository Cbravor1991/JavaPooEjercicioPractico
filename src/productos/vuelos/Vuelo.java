package productos.vuelos;

import productos.Producto;

import java.util.Date;

public class Vuelo extends Producto {
    private double precioEstablecido;
    private Date fechaIda;
    private Date fechaVuelta;

    public Vuelo (double precioEstablecido, Date fechaIda, Date fechaVuelta){
        this.precioEstablecido = precioEstablecido;
        this.fechaIda = fechaIda;
        this.fechaVuelta = fechaVuelta;
    }

    public Vuelo(double precioEstablecido, Date fechaIda){
        this(precioEstablecido, fechaIda, null);
    }

    public Date obtenerFechaIda() {
        return fechaIda;
    }

    @Override
    public double obtenerPrecio() {
        return precioEstablecido;
    }
}
