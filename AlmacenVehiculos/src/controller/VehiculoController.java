package controller;

import javax.swing.JOptionPane;
import model.Vehiculo;

/**
 *
 * @author deadbryam
 */
public class VehiculoController {

    private Vehiculo almancenVehiculos[] = new Vehiculo[10];
    private int index;

    public VehiculoController() {
        index = 0;
    }

    //metdos
    public void agregarVehiculo(Vehiculo entidad) {
        if (index > almancenVehiculos.length) {
            mensaje("Almacen lleno");
        } else {
            almancenVehiculos[index] = entidad;
            mensaje("Vehiculo agregado correctamente");
            index++;
        }
    }

    public void editarVehiculo(Vehiculo entidad) {
        for (int i = 0; i < almancenVehiculos.length; i++) {
            if (almancenVehiculos[i] != null) {
                if (almancenVehiculos[i].equals(entidad)) {
                    almancenVehiculos[i] = entidad;
                    mensaje("Vehiculo editado correctamente");
                    return;
                }
            }
        }
        mensaje("Vehiculo inexistente");
    }

    public void eliminarVehiculo(int id) {
        for (int i = 0; i < almancenVehiculos.length; i++) {
            if (almancenVehiculos[i] != null) {
                if (almancenVehiculos[i].equals(id)) {
                    almancenVehiculos[i] = new Vehiculo();
                    mensaje("Vehiculo eliminado correctamente");
                    return;
                }
            }
        }
        mensaje("Vehiculo inexistente");
    }

    public Vehiculo findById(int id) {
        for (int i = 0; i < almancenVehiculos.length; i++) {
            if (almancenVehiculos[i] != null) {
                if (almancenVehiculos[i].equals(id)) {
                    return almancenVehiculos[i];
                }
            }
        }

        return null;
    }

    public Vehiculo[] findAll() {
        return this.almancenVehiculos;
    }

    public Vehiculo crearEntidad() {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setId(Integer.parseInt(joptionInput("Ingrese id")));
        vehiculo.setColor(joptionInput("Ingrese color"));
        vehiculo.setMarca(joptionInput("Ingrese marca"));
        vehiculo.setAnio(Integer.parseInt(joptionInput("Ingrese anio")));

        return vehiculo;
    }

    public Vehiculo editarEntidad(Vehiculo entidad) {
        entidad.setId(Integer.parseInt(joptionInput("Ingrese el nuevo id")));
        entidad.setColor(joptionInput("Ingrese el nuevo color"));
        entidad.setMarca(joptionInput("Ingrese el nuevo marca"));
        entidad.setAnio(Integer.parseInt(joptionInput("Ingrese el nuevo anio")));

        return entidad;
    }

    public String joptionInput(String msj) {
        return JOptionPane.showInputDialog(msj);
    }

    public void mensaje(String msj) {
        JOptionPane.showMessageDialog(null, msj);
    }

}
