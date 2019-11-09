package bus;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author deadbryam
 */
public class Bus {

    private int izquierda[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private int derecha[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public Bus() {
    }

    public void mostrarAmbos() {
        String salida = "";
        JTextArea jt = new JTextArea();

        for (int i = 0; i < izquierda.length; i++) {
            salida += izquierda[i] + "\t";
        }
        salida += "\n\n";
        for (int i = 0; i < derecha.length; i++) {
            salida += derecha[i] + "\t";
        }

        salida = salida.replace("0", "vacio").replace("1", "Incompleto").replace("2", "Lleno");

        jt.setText(salida);

        mensaje(jt);
    }

    public void mostrarDerecha() {
        String salida = "";
        JTextArea jt = new JTextArea();

        for (int i = 0; i < derecha.length; i++) {
            salida += derecha[i] + "\t";
        }

        salida = salida.replace("0", "vacio").replace("1", "Incompleto").replace("2", "Lleno");

        jt.setText(salida);

        mensaje(jt);
    }

    public void mostrarIzquierda() {
        String salida = "";
        JTextArea jt = new JTextArea();

        for (int i = 0; i < izquierda.length; i++) {
            salida += izquierda[i] + "\t";
        }

        salida = salida.replace("0", "Vacio").replace("1", "Incompleto").replace("2", "Lleno");

        jt.setText(salida);

        mensaje(jt);
    }

    public void asignarAsiento(int asiento, int cantidad, boolean izquierda) {
        if (izquierda) {
            if (this.izquierda[asiento - 1] == 2) {
                mensaje("Asiento lleno.");
            } else if (this.izquierda[asiento - 1] == 1 && cantidad == 2) {
                mensaje("Cantidad de asientos insuficiente.");
            } else {
                this.izquierda[asiento - 1] += cantidad;
                mensaje("Asiento agregado correctamente");
            }
        } else {
            if (this.derecha[asiento - 1] == 2) {
                mensaje("Asiento lleno.");
            } else if (this.derecha[asiento - 1] == 1 && cantidad == 2) {
                mensaje("Cantidad de asientos insuficiente.");
            } else {
                this.derecha[asiento - 1] += cantidad;
                mensaje("Asiento agregado correctamente");
            }
        }
    }

    public void cambioAsiento(int posicion1, int posicion2, boolean lado1, boolean lado2) {
        if(lado1){
            if(this.izquierda[posicion1-1] == 0){
                mensaje("Asiento vacio, no se puede cambiar");
            }else{
                this.izquierda[posicion1 - 1] --;
                asignarAsiento(posicion2, 1, lado2);
            }
            
            
        }else{
            if(this.derecha[posicion1-1] == 0){
                mensaje("Asiento vacio, no se puede cambiar");
            }else{
                this.derecha[posicion1 - 1]--;
                asignarAsiento(posicion2, 1, lado2);
            }
        }
    }

    //metodos de clase
    private void mensaje(Object msj) {
        JOptionPane.showMessageDialog(null, msj);
    }
}
