package controlador;

import javax.swing.JOptionPane;
import modelo.Bicicleta;

/**
 *
 * @author deadbryam
 */
public class BicicletaControlador {

    private Bicicleta almacen[] = new Bicicleta[10];
    private Bicicleta bici;
    private int index;

    public BicicletaControlador() {
        index = 0;
    }

    public void agregarBicicleta(int id, String color, String modelo, int anio) {
        if (index > almacen.length) {
            JOptionPane.showMessageDialog(null, "Almacen lleno");
        } else {
            bici = new Bicicleta(id, color, modelo, anio);
            almacen[index] = bici;
            JOptionPane.showMessageDialog(null, "Agredo correctamente");
            index++;
        }
    }
    
    public Bicicleta buscarPorId(int id){
        for (Bicicleta bicicleta : almacen) {
            if(bicicleta.getId() == id){
                return bicicleta;
            }
        }
        return null;
    }
    
    public Bicicleta[] buscarTodos(){
        return almacen;
    }
    
    public void eliminarBicicleta(int id){
        for (int i = 0; i < almacen.length; i++) {
            if(almacen[i] != null){
                if(almacen[i].getId() == id){
                    almacen[i] = null;
                }
            }
        }
    }
}
