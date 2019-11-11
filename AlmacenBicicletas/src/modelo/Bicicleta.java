package modelo;

/**
 *
 * @author deadbryam
 */
public class Bicicleta {

    private int id;
    private String color;
    private String modelo;
    private int anio;

    public Bicicleta() {

    }

    public Bicicleta(int id, String color, String modelo, int anio) {
        this.id = id;
        this.color = color;
        this.modelo = modelo;
        this.anio = anio;
    }

    //get y set
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return this.id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public String toString(){
        return "Id: "+this.id+" Color: "+this.color+" Modelo: "+this.modelo+" Anio: "+this.anio;
    }
}

