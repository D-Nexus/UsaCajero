package tarea3.usacajero;

/**
 *
 * @author Sebastian - Alan - Michelle
 */
public interface Cajero {
    
    //Metodos a implementar
    public void deposita(int numeroCuenta, long monto);
    public void giro(int numeroCuenta, long monto);
    public long obtieneSaldo(int numeroCuenta);
}
