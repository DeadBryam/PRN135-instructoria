package buspoo;

import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author deadbryam
 */
public class Administracion {

    private final Object bus[][];
    private double caja;
    private String bitacora;

    public Administracion() {
        caja = 0.0;
        bus = new Object[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
        bitacora = "";
    }

    public void comprarAsiento(int asiento, int cantidad, int lado, boolean compra) {
        if (cantidad > 2) {
            JOptionPane.showMessageDialog(null, "'no se puede comprar mas de 2 asientos");
        }

        if ((int) this.bus[lado][asiento] == 2) {
            mensaje("Asiento lleno.");
        } else if ((int) this.bus[lado][asiento] == 1 && cantidad == 2) {
            mensaje("Cantidad de asientos insuficiente.");
        } else {
            this.bus[lado][asiento] = (int) this.bus[lado][asiento] + cantidad;
            if (compra) {
                caja += 25 * cantidad;
                mensaje("Asiento comprado correctamente");
                agregarABitacora("Se compro asiento  $"+25 * cantidad+" a caja\n");
            } else {
                this.caja += 1;
                mensaje("Cambio realizado correctamente");
                agregarABitacora("Se realizo un cambio de asiento $1 a caja\n");
            }
        }
    }

    public void mostrarBus() {
        String salida = "";
        JTextArea jt = new JTextArea();
        for (Object[] lado : bus) {
            for (Object asiento : lado) {
                salida += asiento + "\t";
            }
            salida += "\n\n";
        }
        jt.setText(salida.replace("0", "Vacio").replace("1", "Incompleto").replace("2", "Completo"));

        JOptionPane.showMessageDialog(null, jt);
    }

    public void cambioAsiento(int asiento1, int asiento2, int lado1, int lado2) {
        if ((int) this.bus[lado1][asiento1] == 0) {
            mensaje("Asiento vacio, no se puede cambiar");
        } else {
            if ((int) this.bus[lado2][asiento2] == 2) {
                mensaje("Asiento lleno");
            } else {
                this.bus[lado1][asiento1] = (int) this.bus[lado1][asiento1] - 1;
                comprarAsiento(asiento2, 1, lado2, false);
            }
        }
    }

    public void devolverAsiento(int asiento, int lado) {
        if ((int) this.bus[lado][asiento] == 0) {
            mensaje("Asiento vacio, no se puede devolver");
        } else {
            this.bus[lado][asiento] = (int) this.bus[lado][asiento] - 1;
            this.caja -= 22.5;
            mensaje("Asiento devuelto correctamente, se le regresara $22.50");
            agregarABitacora("Se devolvio un asiento, se regresa $22.50 de caja\n");
        }
    }
    
    public void mostrarCuenta(){
        JTextArea jt = new JTextArea();
        
        jt.setText(bitacora + "Total: "+this.caja);
        mensaje(jt);
    }
    
    private void agregarABitacora(String asunto){
        this.bitacora += asunto;
    }

    private void mensaje(Object msj) {
        JOptionPane.showMessageDialog(null, msj);
    }

}
