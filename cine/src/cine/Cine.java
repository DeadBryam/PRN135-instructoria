package cine;

import java.util.Arrays;

/**
 *
 * @author deadbryam
 */
public class Cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sala sala = new Sala();
        
        sala.comprarAsiento("A2");
        sala.comprarAsiento("F2");
        sala.mostrarSala();
        
    }
    
}
