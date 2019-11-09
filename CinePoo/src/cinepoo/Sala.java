package cinepoo;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author deadbryam
 */
public class Sala {

    private boolean salaCine[][] = new boolean[9][5];
    private String bitacora;

    public Sala() {
        bitacora = "";
    }

    public void mostrarSala() {
        String salida = "";
        JTextArea jt = new JTextArea();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if (salaCine[j][i]) {
                    salida += "LLENO\t";
                } else {
                    salida += "VACIO\t";
                }
            }
            salida += "\n";
        }

        jt.setText(salida);
        JOptionPane.showMessageDialog(null, jt);
    }

    public void comprarAsiento(String[] asiento) {
        int asientos[];

        for (String s : asiento) {
            if (s.length() != 2) {
                mensaje("Formato incorrecto.");
            } else {
                asientos = convertirAsientos(s.toUpperCase());
                if (asientos[0] == -1 || asientos[1] == -1) {
                    mensaje("Asiento no valido.");
                } else {
                    if (valorAsiento(asientos)) {
                        mensaje("Asiento ocupado.");
                    } else {
                        cambiarEstado(asientos);
                        mensaje("Asiento comprado exitosamente.");
                        agregarABitacora("Se compro el asiento "+convertirAsientosAString(asientos));
                    }
                }
            }
        }
    }

    public void comprarAsiento(int cantidad) {
        int asientos[];
        String asiento;

        for (int i = 0; i < cantidad;) {
            asiento = JOptionPane.showInputDialog("Que asiento quiere?");

            if (asiento.length() != 2) {
                mensaje("Formato incorrecto.");
            } else {
                asientos = convertirAsientos(asiento.toUpperCase());
                if (asientos[0] == -1 || asientos[1] == -1) {
                    mensaje("Asiento no valido.");
                } else {
                    if (valorAsiento(asientos)) {
                        mensaje("Asiento ocupado.");
                    } else {
                        cambiarEstado(asientos);
                        mensaje("Asiento comprado exitosamente.");
                        agregarABitacora("Se compro el asiento (forma 2) "+convertirAsientosAString(asientos));
                        i++;
                    }
                }
            }
        }

    }

    public void devolverAsiento(String asiento) {
        int asientos[];

        if (asiento.length() != 2) {
            mensaje("Formato incorrecto.");
        } else {
            asientos = convertirAsientos(asiento);
            if (asientos[0] == -1 || asientos[1] == -1) {
                mensaje("Asiento no valido.");
            } else {
                if (!valorAsiento(asientos)) {
                    mensaje("Asiento vacio, no se puede devolver.");
                } else {
                    cambiarEstado(asientos);
                    mensaje("Asiento devuelto exitosamente.");
                    agregarABitacora("Se devolvio el asiento "+convertirAsientosAString(asientos));
                }
            }
        }
    }
    
    public void mostrarBitacora(){
        JTextArea jt = new JTextArea();
        jt.setText(bitacora+"\n");
        mensaje(jt);
    }

    //metodos de clase
    private int[] convertirAsientos(String asientos) {
        String letra;
        int pos1, pos2, resultado[] = new int[2];

        pos1 = convertirLetraNumero(asientos.charAt(0));
        pos2 = Integer.parseInt(String.valueOf(asientos.charAt(1)));

//        return new int[]{pos1,pos2};
        resultado[0] = pos1 - 1;
        resultado[1] = pos2 - 1;

        return resultado;
    }

    private int convertirLetraNumero(char letra) {
        int resultado;

        switch (letra) {
            case 'A':
                resultado = 1;
                break;
            case 'B':
                resultado = 2;
                break;
            case 'C':
                resultado = 3;
                break;
            case 'D':
                resultado = 4;
                break;
            case 'E':
                resultado = 5;
                break;
            default:
                resultado = 0;
                break;
        }

        return resultado;
    }
    
    
    private String convertirNumeroLetra(int numero) {
        String resultado;

        switch (numero) {
            case 0:
                resultado = "A";
                break;
            case 1:
                resultado = "B";
                break;
            case 2:
                resultado = "C";
                break;
            case 3:
                resultado = "D";
                break;
            case 4:
                resultado = "E";
                break;
            default:
                resultado = null;
                break;
        }

        return resultado;
    }
    
    private String convertirAsientosAString(int[] asiento){
        int pos2;
        String pos1;
        
        pos2 = asiento[1] + 1;
        pos1 = convertirNumeroLetra(asiento[0]);
        
        return pos1 + pos2;
    }

    private void cambiarEstado(int[] asientos) {
        salaCine[asientos[1]][asientos[0]] = !valorAsiento(asientos);
    }

    private boolean valorAsiento(int[] asientos) {
        return salaCine[asientos[1]][asientos[0]];
    }

    private void mensaje(Object msj) {
        JOptionPane.showMessageDialog(null, msj);
    }
    
    private void agregarABitacora(String texto){
        this.bitacora += texto;
    }
}
