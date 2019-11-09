package bus;

import javax.swing.JOptionPane;

/**
 *
 * @author deadbryam
 */
public class Admin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bus bus = new Bus();
        boolean salir=false;
        int opcion;
        
        while (!salir) {            
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Que quiere hacer?\n1.Mostrar todos"
                    + "\n2.Mostrar izquierda\n3.Mostrar derecha\n4.Agregar asiento"
                    + "\n5.Cambio asiento"));
        
            switch(opcion){
                case 1:
                    bus.mostrarAmbos();
                    break;
                case 2:
                    bus.mostrarIzquierda();
                    break;
                case 3:
                    bus.mostrarDerecha();
                    break;
                case 4:
                    int posicion;
                    int cantidad;
                    int temporal;
                    boolean izquierda;
                    
                    do {                        
                        posicion = Integer.parseInt(JOptionPane.showInputDialog("Cual asiento quiere?"));
                    } while (posicion<0 || posicion>10);
                    do {                        
                        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuantos asientos quiere?"));
                    } while (cantidad<1 || cantidad>2);
                    do {          
                        temporal = Integer.parseInt(JOptionPane.showInputDialog("1. Izquierda"
                                + "\n2. Derecha"));
                    } while (temporal < 1 || temporal>2);
                    
                    if(temporal == 1){
                        izquierda = true;
                    }else{
                        izquierda = false;
                    }
                    
                    bus.asignarAsiento(posicion, cantidad, izquierda);
                    break;
                case 5:
                    int posicion1,posicion2;
                    boolean lado1,lado2;
                    
                    do {                        
                        posicion1 = Integer.parseInt(JOptionPane.showInputDialog("En cual asiento se encuentra?."));
                    } while (posicion1<0 || posicion1>10);
                    
                    do {          
                        temporal = Integer.parseInt(JOptionPane.showInputDialog("1. Izquierda"
                                + "\n2. Derecha"));
                    } while (temporal < 1 || temporal>2);
                    
                    if(temporal == 1){
                        lado1 = true;
                    }else{
                        lado1 = false;
                    }
                    
                    do {                        
                        posicion2 = Integer.parseInt(JOptionPane.showInputDialog("Cual asiento nuevo desea?."));
                    } while (posicion1<0 || posicion1>10);
                    
                    do {          
                        temporal = Integer.parseInt(JOptionPane.showInputDialog("1. Izquierda"
                                + "\n2. Derecha"));
                    } while (temporal < 1 || temporal>2);
                    
                    if(temporal == 1){
                        lado2 = true;
                    }else{
                        lado2 = false;
                    }
                    
                    bus.cambioAsiento(posicion1, posicion2, lado1, lado2);
                    break;
                    default:
                        salir = true;
                        break;
            }
        }
        
        /*
        mostrar asientos
        comprar asiento
        cambiar asiento
        eliminar asiento
        precio asiento
        usuarios
        */
    }
    
}
