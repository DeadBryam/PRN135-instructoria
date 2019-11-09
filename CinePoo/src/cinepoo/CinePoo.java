package cinepoo;

import javax.swing.JOptionPane;

/**
 *
 * @author deadbryam
 */
public class CinePoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sala salaCine = new Sala();
        int opcion;
        String asiento;
        boolean salir = false;
        int cantidad;
        
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Que quiere hacer?\n1. Ver sala.\n2. Comprar asiento"
                    + "\n3. Devolver asiento.\n4.Comprar asiento (forma 2).\n5.Mostrar bitacora.\nOtro salir"));
            switch (opcion) {
                case 1:
                    salaCine.mostrarSala();
                    break;
                case 2:
                    String asientos[];
                    do {
                        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuantos asientos quiere? Entre 1 y 3"));
                    } while (cantidad < 0 || cantidad > 3);
                    asientos = new String[cantidad];
                    for (int i = 0; i < cantidad; i++) {
                        asientos[i] = JOptionPane.showInputDialog("Que asiento quiere comprar?");
                    }
                    
                    salaCine.comprarAsiento(asientos);
                    break;
                case 3:
                    asiento = JOptionPane.showInputDialog("Que asiento quiere devolver?");
                    salaCine.devolverAsiento(asiento.toUpperCase());
                    break;
                case 4:
                    do {
                        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuantos asientos quiere? Entre 1 y 3"));
                    } while (cantidad < 0 || cantidad > 3);
                    salaCine.comprarAsiento(cantidad);
                    break;
                case 5:
                    salaCine.mostrarBitacora();
                    break;
                default:
                    salir = true;
                    break;
                
            }
        } while (!salir);
        
    }
    
}
