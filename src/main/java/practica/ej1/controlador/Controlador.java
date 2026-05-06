package practica.ej1.controlador;

import java.sql.Connection;
import java.util.ArrayList;
import practica.ej1.modelo.Articulo;
import practica.ej1.modelo.ArticuloDAO;
import practica.ej1.modelo.Conexion;

/**
 *
 * @author aidan
 */

public class Controlador {

    // PROPIEDADES
    private ArticuloDAO dao;
    private Connection cn;

    // COMPORTAMIENTOS
    public Controlador() {
        this.cn = Conexion.conectar();
        this.dao = new ArticuloDAO(this.cn);
    }

    // Recibe el objeto ya montado (mirar ArticuloDAO.insertarArticulo())
    public boolean insertarArticulo(Articulo a) {
        return dao.insertar(a);
    }

    // Recibe el objeto que se quiere eliminar
    public boolean eliminarArticulo(Articulo a) {
        return dao.eliminar(a);
    }

    // Devuelve el objeto o null
    public Articulo buscarArticulo(String codigo) {
        return dao.consultarArticulo(codigo);
    }

    // Devuelve la lista completa
    public ArrayList<Articulo> obtenerTodos() {
        return dao.listarArticulos();
    }

}
