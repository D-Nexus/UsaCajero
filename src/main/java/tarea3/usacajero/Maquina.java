package tarea3.usacajero;

/**
 *
 * @author Sebastian - Alan - Michelle
 */
public class Maquina {
    //Atributos
    private String modelo;
    private long precio;
    
    //Constructor
    public Maquina(String modelo, long precio){
        this.modelo = modelo;
        this.precio = precio;
    }
    
    //Metodos get
    public String getModelo(){
        return modelo;
    }
    
    public long getPrecio(){
        return precio;
    }
    
    //Metodos set
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public void setPrecio(long precio){
        this.precio = precio;
    }
    
    @Override
    public String toString(){
        return "Modelo ["+modelo+"] - Precio ["+precio+"]";
    }
}
