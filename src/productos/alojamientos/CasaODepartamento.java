package productos.alojamientos;

public class CasaODepartamento extends Alojamiento {
    private int cantidadAmbientesPorCasa;
    private static final double PRECIO_AMBIENTE_1 = 15000;
    private static final double PRECIO_AMBIENTE_2_A_4 = 30000;
    private static final double PRECIO_AMBIENTE_MAYOR_4 = 50000;

    public CasaODepartamento(int cantidadAmbientes, String direccion) {
        super(0, direccion);
        this.cantidadAmbientesPorCasa = cantidadAmbientes;
        actualizarPrecio();
    }

    @Override
    public double calcularPrecioAlojamiento() {
        if (cantidadAmbientesPorCasa == 1) {
            return PRECIO_AMBIENTE_1;
        } else if (cantidadAmbientesPorCasa >= 2 && cantidadAmbientesPorCasa <= 4) {
            return PRECIO_AMBIENTE_2_A_4;
        } else {
            return PRECIO_AMBIENTE_MAYOR_4;
        }
    }

    private void actualizarPrecio() {
        super.precioAlojamientoTotal = calcularPrecioAlojamiento();;
}
}