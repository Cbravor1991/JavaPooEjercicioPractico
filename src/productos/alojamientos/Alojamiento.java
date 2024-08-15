package productos.alojamientos;
import productos.Producto;

public abstract class Alojamiento extends Producto {
    protected double precioAlojamientoTotal;
    private String direccion;

    public Alojamiento (double precioAlojamientoTotal, String direccion){
        this.direccion = direccion;
        this.precioAlojamientoTotal = calcularPrecioAlojamiento();
    }

    public abstract double calcularPrecioAlojamiento();

    public String obtenerDireccion() {
        return this.direccion;
    }

    @Override
    public double obtenerPrecio() {
        return this.precioAlojamientoTotal;
    }
}
