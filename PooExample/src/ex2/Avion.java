/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author deadbryam
 */
public class Avion extends Automovil{

    public Avion(){
        super();
    }
    
    public Avion(String color, String marca, int anio) {
        super(color, marca, anio);
    }
    
   @Override
   public void encederVehiculo() {
        System.out.println("Avion encendido.");
    }

   @Override
    public void apagarVehiculo() {
        System.out.println("Avion apagado");
    }
}
