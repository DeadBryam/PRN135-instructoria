package buspoo;

import javax.swing.JOptionPane;

/**
 *
 * @author deadbryam
 */
public class Buspoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Administracion admin = new Administracion();
        boolean salir = false;
        int opcion;
        int asiento;
        int cantidad;
        int lado;

        while (!salir) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Que quiere hacer?\n1.Mostrar bus"
                    + "\n2.Comprar asiento\n3.Cambio asiento\n4.Devoler asiento\n5.Mostrar caja\nOtro salir"));

            switch (opcion) {
                case 1:
                    admin.mostrarBus();
                    break;
                case 2:
                    do {
                        asiento = Integer.parseInt(JOptionPane.showInputDialog("Cual asiento quiere?"));
                    } while (asiento < 0 || asiento > 10);
                    do {
                        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuantos asientos quiere?"));
                    } while (cantidad < 1 || cantidad > 2);
                    do {
                        lado = Integer.parseInt(JOptionPane.showInputDialog("1. Izquierda\n2. Derecha"));
                    } while (lado < 1 || lado > 2);

                    admin.comprarAsiento(asiento - 1, cantidad, lado - 1, true);
                    break;
                case 3:
                    int asiento1,
                     asiento2;
                    int lado1,
                     lado2;

                    do {
                        asiento1 = Integer.parseInt(JOptionPane.showInputDialog("En cual asiento se encuentra?."));
                    } while (asiento1 < 0 || asiento1 > 10);

                    do {
                        lado1 = Integer.parseInt(JOptionPane.showInputDialog("1. Izquierda\n2. Derecha"));
                    } while (lado1 < 1 || lado1 > 2);

                    do {
                        asiento2 = Integer.parseInt(JOptionPane.showInputDialog("Cual asiento nuevo desea?."));
                    } while (asiento1 < 0 || asiento1 > 10);

                    do {
                        lado2 = Integer.parseInt(JOptionPane.showInputDialog("1. Izquierda\n2. Derecha"));
                    } while (lado2 < 1 || lado2 > 2);

                    admin.cambioAsiento(asiento1 - 1, asiento2 - 1, lado1 - 1, lado2 - 1);
                    break;
                case 4:
                    do {
                        asiento = Integer.parseInt(JOptionPane.showInputDialog("Cual asiento quiere devolver?"));
                    } while (asiento < 0 || asiento > 10);
                    do {
                        lado = Integer.parseInt(JOptionPane.showInputDialog("1. Izquierda\n2. Derecha"));
                    } while (lado < 1 || lado > 2);

                    admin.devolverAsiento(asiento - 1, lado - 1);
                    break;
                case 5:
                    admin.mostrarCuenta();
                    break;
                default:
                    salir = true;
                    break;
            }
        }
    }

}
