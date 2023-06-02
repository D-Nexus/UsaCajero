package tarea3.usacajero;

/**
 *
 * @author Sebastian - Alan - Michelle
 */
public class Cuenta {

    //Atributos
    private int numeroCuenta;
    private long saldo;
    private long saldoDolares;
    
    //Constructor
    public Cuenta(int numeroCuenta, long saldo, long saldoDolares){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.saldoDolares = saldoDolares;
    }
    
    //Metodos get
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getSaldo() {
        return saldo;
    }

    public long getSaldoDolares() {
        return saldoDolares;
    }
    
    //Metodos set
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public void setSaldoDolares(long saldoDolares) {
        this.saldoDolares = saldoDolares;
    }
    
    //Metodos de clase
    public void deposita(long monto){
        this.saldo = saldo + monto;
        
    }
    
    public void giro(long monto){
        this.saldo = saldo - monto;
    }
    
    public void depositaDolar(long monto){
       
    }
    
    public void giroDolar(long monto){
        
    }
    
    //En progreso(sin terminar) tieneNumeroDeCuenta
    public boolean tieneNumeroDeCuenta(int numero){
        //Si se cumple retornara True y si no False
        return numero > 0 && numero <= 999999999;
    }
    
    @Override
    public String toString(){
        return "NumeroCuenta ["+numeroCuenta+"] - Saldo ["+saldo+"] - SaldoDolares ["+saldoDolares+"]";
    }
    
    
}