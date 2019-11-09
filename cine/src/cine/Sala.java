package cine;

import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author deadbryam
 */
public class Sala {

    private boolean sala[][] = new boolean[10][5];

    public Sala() {
    }
    
    
    public void mostrarSala(){
        JTextArea jt = new JTextArea();
        String salida = Arrays.deepToString(sala).replace("true", "OCUPADO").replace("false", "VACIO").replace("], ", "]\n")
                .replace("[","").replace("]", "").replace(", ", "\t");
        
        jt.setText(salida);
        mensaje(jt);
    }
    
    public void comprarAsiento(String asiento) {
        int asientos[];
        
        if(convertirAsiento(asiento) == null){
            return;
        }
        
        asientos = convertirAsiento(asiento);
        
        if(verEstadoAsiento(asientos)){
            mensaje("Asiento ya ocupado");
        }else{
            mensaje("Asiento comprado correctamente");
            cambiarEstadoAsiento(asientos);
        }
    }
    
    public void reembolsarAsiento(String asiento){
        int asientos[];
        
        if(convertirAsiento(asiento) == null){
            return;
        }
        
        asientos =  convertirAsiento(asiento);
        
        if(verEstadoAsiento(asientos)){
            mensaje("Asiento reembolsado correctamente");
            cambiarEstadoAsiento(asientos);
        }else{
            mensaje("Asiento vacio, no se puede reembolsar");
        }
    }

    
    
    public void mensaje(Object mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    //metodos privados, solo se pueden usar en esta clase
    
    private boolean verEstadoAsiento(int asientos[]){
        return sala[asientos[0]][asientos[1]];
    }
    
    private void cambiarEstadoAsiento(int asientos[]){
        sala[asientos[0]][asientos[1]] = !verEstadoAsiento(asientos);
    }
    
    private int[] convertirAsiento(String asiento) {
        char letra;
        int pos1, pos2;
        int asientos[];
        letra = asiento.charAt(0);
        pos2 = Integer.parseInt(String.valueOf(asiento.charAt(1)));
        
        if(asiento.length() != 2){
            return null;
        }

        switch (String.valueOf(letra).toUpperCase()) {
            case "A":
                pos1 = 0;
                break;
            case "B":
                pos1 = 1;
                break;
            case "C":
                pos1 = 2;
                break;
            case "D":
                pos1 = 3;
                break;
            case "E":
                pos1 = 4;
                break;
            default:
                mensaje("Valor incorrecto");
                return null;
        }
        
        asientos = new int[]{pos1, pos2};
        return asientos;
    }

}
