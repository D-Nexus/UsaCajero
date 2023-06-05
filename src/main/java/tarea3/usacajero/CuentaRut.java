package tarea3.usacajero;

public class CuentaRut extends Cuenta {
    // Atributos
    private long limiteSaldo = 5000000; // Límite de saldo en pesos
    private long limiteGiro = 200000; // Límite de giro en pesos
    
    // Constructor
    public CuentaRut(int numeroCuenta, long saldo, long saldoDolares) {
        super(numeroCuenta, saldo, saldoDolares);
    }
    
    // Método para realizar un giro
    @Override
    public void giro(long monto) {
        if (monto <= getSaldo() && monto < limiteGiro) {
            // Realizar el giro
            long nuevoSaldo = getSaldo() - monto;
            setSaldo(nuevoSaldo);
            
            // Restar el monto del giro al límite de giro
            limiteGiro -= monto;
            
            System.out.println("Se ha realizado el giro de $" + monto);
        } else if(monto>getSaldo()){System.out.println("El monto del giro excede el monto disponible.");}
        
        else {
            System.out.println("El monto del giro excede el límite de giro.");
        }
    }
    
    // Método para realizar un depósito
    @Override
    public void deposita(long monto) {
        if (monto + getSaldo() <= limiteSaldo) {
            // Realizar el depósito
            long nuevoSaldo = getSaldo() + monto;
            setSaldo(nuevoSaldo);
            
            System.out.println("Se ha realizado el depósito de $" + monto);
        } else {
            System.out.println("El monto del depósito excede el límite de saldo.");
        }
    }
    
    // Getters y Setters
    public long getLimiteSaldo() {
        return limiteSaldo;
    }
    
    public void setLimiteSaldo(long limiteSaldo) {
        this.limiteSaldo = limiteSaldo;
    }
    
    public long getLimiteGiro() {
        return limiteGiro;
    }
    
    public void setLimiteGiro(long limiteGiro) {
        this.limiteGiro = limiteGiro;
    }
}

