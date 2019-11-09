/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.swing.JOptionPane;

/**
 *
 * @author deadbryam
 */
public class heredado extends persona{

    private int edad;

    public heredado() {
    }

    public heredado(int edad, String saludo, String nombre) {
        super(saludo, nombre);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override 
    public void saludar(){
        JOptionPane.showMessageDialog(null, getSaludo() + " "+ getNombre() +" su edad es: "+getEdad());
    }

}
