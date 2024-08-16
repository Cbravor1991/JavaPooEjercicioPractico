package usuarios;
import productos.Producto;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private double presupuesto;
    private List<Producto> productos;

    public Usuario(String nombre, double presupuesto, List<Producto> productos) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.productos = productos;
    }

    public void contratarProducto(Producto producto) {
        if (producto.obtenerPrecio() > presupuesto) {
            System.out.println("El producto excede el presupuesto");
        } else {
            presupuesto -= producto.obtenerPrecio();
            productos.add(producto);
        }
    }

    public int obtenerCantidadProductosAdquiridos() {
        return productos.size();
    }

    public double obtenerPresupuesto() {
        return presupuesto;
    }
}
