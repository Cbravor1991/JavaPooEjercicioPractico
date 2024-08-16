import app.App;
import productos.alojamientos.*;
import usuarios.Usuario;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // Genero los productos que voy a utilizar
        Hotel hotel = new Hotel("Hotel Llao Llao", 5, "Bustillo 123");
        CasaODepartamento casa = new CasaODepartamento(3, "Paseo Colon 847");
        Cabania cabaña = new Cabania("Libertador 600", 2, 3);
        cabaña.agregarcasa(casa);

        //Genero los usuarios
        Usuario usuario1 = new Usuario("Christian", 100000, null);
        Usuario usuario2 = new Usuario("Martin", 50000,null);

        // Contrato productos
        usuario1.contratarProducto(hotel);
        usuario2.contratarProducto(casa);
        usuario1.contratarProducto(cabaña);

        //Analizo los productos contratados
        System.out.println("Productos usuario1: " + usuario1.obtenerCantidadProductosAdquiridos());
        System.out.println("Productos usuario2: " + usuario2.obtenerCantidadProductosAdquiridos());

        // Genero una lista de usuarios
        List<Usuario> usuarios = Arrays.asList(usuario1, usuario2);

        // Genero la "APP", para analizar si se puede adquirir el producto
        App app = new App(usuarios);
        app.analizarProductoSegunPresupuesto(hotel, usuario1);

        // Mostrar usuarios ordenados por presupuesto
        List<Usuario> usuariosOrdenados = app.obtenerUsuariosOrdenadosPorPresupuesto();
        System.out.println("Lista de usuarios por presupuesto:");
        for (Usuario usuario : usuariosOrdenados) {
            System.out.println(usuario.obtenerPresupuesto());
        }
     }
    }
