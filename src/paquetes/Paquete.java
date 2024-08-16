package paquetes;
import productos.Producto;

import java.util.ArrayList;
import java.util.List;

public class Paquete extends Producto {
    private double precioTotal;
    private List<Producto> productos;

    public Paquete(){
        this.precioTotal = 0;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public void calcularPrecio() {
        if (!productos.isEmpty()) {
            for (Producto producto : productos) {
                precioTotal += producto.obtenerPrecio();
            }
        }
    }

    @Override
    public double obtenerPrecio() {
        calcularPrecio();
        return precioTotal;
    }


}
