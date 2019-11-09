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
public class persona {
    private String saludo;
    private String nombre;

    public persona() {
    }

    public persona(String saludo) {
        this.saludo = saludo;
    }

    public persona(String saludo, String nombre) {
        this.saludo = saludo;
        this.nombre = nombre;
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void saludar(){
        JOptionPane.showMessageDialog(null, saludo + " "+nombre);
    }
    
}
