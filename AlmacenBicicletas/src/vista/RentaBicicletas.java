package vista;

import controlador.BicicletaControlador;
import java.util.Arrays;
import modelo.Bicicleta;

/**
 *
 * @author deadbryam
 */
public class RentaBicicletas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BicicletaControlador controlador = new BicicletaControlador();
    
        controlador.agregarBicicleta(2, "Rojo", "Urbana", 2014);
        controlador.agregarBicicleta(1, "Azul", "Urbana", 2015);
        
        for (Bicicleta buscar : controlador.buscarTodos()) {
            System.out.println(buscar);
        }
        
        controlador.eliminarBicicleta(1);
        
        for (Bicicleta buscar : controlador.buscarTodos()) {
            System.out.println(buscar);
        }
    }
    
}
