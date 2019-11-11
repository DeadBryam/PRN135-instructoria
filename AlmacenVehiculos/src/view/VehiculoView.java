package view;

import controller.VehiculoController;
import javax.swing.JOptionPane;
import model.Vehiculo;

/**
 *
 * @author deadbryam
 */
public class VehiculoView {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VehiculoController controller = new VehiculoController();
        Vehiculo vehiculo;
        int opcion, id;
        boolean salir = false;

        while (!salir) {
            opcion = Integer.parseInt(controller.joptionInput("Que desea hacer?\n1. Agregar vehiculo\n2. Mostrar vehiculo\n3. Mostrar todos los vehiculos\n4. Editar vehiculos\n5. Eliminar vehiculo\notro salir."));
            switch (opcion) {
                case 1:
                    vehiculo = controller.crearEntidad();
                    controller.agregarVehiculo(vehiculo);
                    break;
                case 2:
                    id = Integer.parseInt(controller.joptionInput("Ingrese el id del vehiculo que desea ver"));
                    if (controller.findById(id) != null) {
                        JOptionPane.showMessageDialog(null, controller.findById(id).toString());
                    } else {
                        JOptionPane.showMessageDialog(null, "Vehiculo inexistente");
                    }

                    break;
                case 3:
                    String salida = "";
                    for (Vehiculo vh : controller.findAll()) {
                        salida += (vh != null) ? vh.toString() + "\n\n" : "";
                    }
                    JOptionPane.showMessageDialog(null, salida);
                    break;
                case 4:
                    id = Integer.parseInt(controller.joptionInput("Ingrese el id del vehiculo que desea editar"));
                    vehiculo = controller.editarEntidad(controller.findById(id));
                    controller.editarEntidad(vehiculo);
                    break;
                case 5:
                    id = Integer.parseInt(controller.joptionInput("Ingrese el id del vehiculo que desea eliminar"));
                    controller.eliminarVehiculo(id);
                    break;
                default:
                    salir = true;
                    break;
            }
        }
    }

}
