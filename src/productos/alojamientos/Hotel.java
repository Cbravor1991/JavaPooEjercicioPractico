package productos.alojamientos;

public class Hotel extends Alojamiento {
    private String nombre;
    private int cantidadEstrella;
    private static double PRECIO_FIJO_NOCHE = 10000;

    public Hotel(String nombre, int cantidadEstrella, String direccion){
        super(0, direccion);
        this.nombre = nombre;
        this.cantidadEstrella = cantidadEstrella;
        actualizarPrecio();
    }

    private void actualizarPrecio() {
        super.precioAlojamientoTotal = calcularPrecioAlojamiento();
    }


    @Override
    public double calcularPrecioAlojamiento(){
        return PRECIO_FIJO_NOCHE *cantidadEstrella;
    }

    public String obtenerNombre(){
        return nombre;
    }
}
