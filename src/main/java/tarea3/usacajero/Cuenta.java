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
        long saldoNuevo = getSaldo();
        saldoNuevo = saldoNuevo + monto;
        setSaldo(saldoNuevo);
        System.out.println("Metodo de cuenta sin modificar");
    }
    
    public void giro(long monto){
        if(getSaldo() == 0 || (getSaldo() - monto) < 0){
            System.out.println("Saldo insuficiente");
        }
        else{
            long saldoNuevo = getSaldo();
            saldoNuevo = saldoNuevo - monto;
            setSaldo(saldoNuevo);
        }
        
    }
    
    public void depositaDolar(long monto){
       long saldoNuevoDolares = getSaldoDolares();
       saldoNuevoDolares = saldoNuevoDolares + (monto / 800);
       setSaldoDolares(saldoNuevoDolares);
    }
    
    public void giroDolar(long monto){
        if(getSaldoDolares() == 0 || (getSaldoDolares() - monto) < 0){
            System.out.println("Saldo insuficiente");
        }
        else{
            long saldoNuevoDolares = getSaldoDolares();
            saldoNuevoDolares = saldoNuevoDolares - (monto / 800);
            setSaldoDolares(saldoNuevoDolares);
        }
       
    }
    
    //En progreso(sin terminar) tieneNumeroDeCuenta
    public boolean tieneNumeroDeCuenta(int numero){
        for (Cuenta cuenta : UsaCajero.cuentas) {
            if (cuenta != null && cuenta.getNumeroCuenta() == numero) {
                return true; // El número de cuenta existe
        }
    }
        return false; // El número de cuenta no existe
    
    }
      
    
    @Override
    public String toString(){
        return "NumeroCuenta ["+numeroCuenta+"] - Saldo ["+saldo+"] - SaldoDolares ["+saldoDolares+"]";
    }
    
    
}