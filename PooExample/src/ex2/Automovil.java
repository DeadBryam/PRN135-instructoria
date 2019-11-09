/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import javax.swing.JOptionPane;

/**
 *
 * @author deadbryam
 */
public class Automovil {

    private String color;
    private String marca;
    private int anio;

    public Automovil() {
    }

    public Automovil(String marca) {
        this.marca = marca;
    }
    
    public Automovil(String color, String marca, int anio) {
        this.color = color;
        this.marca = marca;
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void mostrarVehiculo() {
        JOptionPane.showMessageDialog(null, "Marca: " + this.marca + "\nColor: " + color
                + "\nAnio: " + getAnio());
    }

    public void mostrarVehiculo(String propietario) {
        JOptionPane.showMessageDialog(null, "Propietario: " + propietario + "\nMarca: " + this.marca +
                 "\nColor: " + color
                + "\nAnio: " + getAnio());
    }

    public void encederVehiculo() {
        System.out.println("Vehiculo encendido.");
    }

    public void apagarVehiculo() {
        System.out.println("Vehiculo apagado");
    }

}
