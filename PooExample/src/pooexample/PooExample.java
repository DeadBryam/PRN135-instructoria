/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooexample;

import ex1.estudiante;
import ex2.Automovil;
import ex2.Avion;
import test.heredado;
import test.persona;

/**
 *
 * @author deadbryam
 */
public class PooExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //mostar @override
        
//       persona p1 = new persona("Hola", "Luis");
//       heredado p2 = new heredado(10, "Hola", "Jose");
//       
//       p1.saludar();
//       p2.saludar();

        Automovil a1 = new Automovil("Rojo", "Nissan", 2020);
        a1.mostrarVehiculo();
        
        a1.encederVehiculo();
        a1.apagarVehiculo();
//        
        Avion a2 = new Avion("Verde", "Papaya", 2005);
        
        a2.mostrarVehiculo();
        a2.mostrarVehiculo("Avianca");
        
        a2.encederVehiculo();
        a2.apagarVehiculo();
        
        
        
        
        
        
        
        
        
        
    }
    
}
