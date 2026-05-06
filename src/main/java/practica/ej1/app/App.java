package practica.ej1.app;

import practica.ej1.controlador.Controlador;
import practica.ej1.vista.VentanaPrincipal;

/**
 *
 * @author aidan
 */

public class App {

    public static void main(String[] args) {

        Controlador control = new Controlador();

        VentanaPrincipal ventana = new VentanaPrincipal(control);

        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null); // Sale centrada
    }

}
