package tarea3.usacajero;

/**
 *
 * @author Sebastian - Alan - Michelle
 */
public class Persona {
    //Atributos
    private int rut;
    private String nombre;
    
    //Constructor
    public Persona(int rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
    }
    
    //Metodos get
    public int getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }
    
    //Metodos set
    public void setRut(int rut) {
        this.rut = rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return "Nombre ["+nombre+"] - Rut ["+rut+"]";
    }
}
