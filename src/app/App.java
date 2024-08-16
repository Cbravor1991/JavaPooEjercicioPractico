package app;

import productos.Producto;
import usuarios.Usuario;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {
    private List<Usuario> usuarios;

    public App(List<Usuario> usuarios) {
        this.usuarios = usuarios != null ? usuarios : new ArrayList<>();
    }

    public List<Usuario> obtenerUsuariosOrdenadosPorPresupuesto() {
        usuarios.sort(Comparator.comparingDouble(Usuario::obtenerPresupuesto).reversed());
        return usuarios;
    }

    public void analizarProductoSegunPresupuesto(Producto producto, Usuario usuario) {
        if (producto.obtenerPrecio() <= usuario.obtenerPresupuesto()) {
            System.out.println("Puede obtener producto");
        } else {
            System.out.println("Su presupuesto no alcanza");
        }
    }
}
