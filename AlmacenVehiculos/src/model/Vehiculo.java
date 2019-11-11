package model;

/**
 *
 * @author deadbryam
 */
public class Vehiculo {

    private int id;
    private String color;
    private String marca;
    private int anio;

    //constructores
    public Vehiculo(int id, String color, String marca, int anio) {
        this.id = id;
        this.color = color;
        this.marca = marca;
        this.anio = anio;
    }

    public Vehiculo() {
    }

    //get y set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    //metodos
    public boolean equals(Vehiculo entidad) {
        return (getId() == entidad.getId());
    }

    public boolean equals(int id) {
        return (getId() == id);
    }
    
    public String toString(){
        return "Id: "+this.id+"\nColor: "+this.color+"\nMarca: "+this.marca+"\nAnio: "+this.anio;
    }
}
