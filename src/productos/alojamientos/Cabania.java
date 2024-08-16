package productos.alojamientos;

import java.util.ArrayList;
import java.util.List;

public class Cabania extends CasaODepartamento {
    private int cantidadCasasAlquilar;
    private List<CasaODepartamento> casaCompenenCabanias;

    public Cabania (String direccion, int cantidadCasasAlquilar, int cantidadAmbientes){
        super(cantidadAmbientes, direccion);
        this.cantidadCasasAlquilar = cantidadCasasAlquilar;
        this.casaCompenenCabanias = new ArrayList<>();
    }

    public void agregarcasa(CasaODepartamento casa){
        this.casaCompenenCabanias.add(casa);
    }

    @Override
    public double calcularPrecioAlojamiento() {
        double precioTotal = 0;
        int descuentoPorcentaje = Math.min(50, 10*cantidadCasasAlquilar);

        for(int i = 0; i< this.cantidadCasasAlquilar && i< this.casaCompenenCabanias.size(); i++){
            double precioCasa = casaCompenenCabanias.get(i).calcularPrecioAlojamiento();
            precioCasa -= (precioCasa * descuentoPorcentaje) / 100;
            precioTotal +=precioCasa;

        }
        return precioTotal;

    }
}
