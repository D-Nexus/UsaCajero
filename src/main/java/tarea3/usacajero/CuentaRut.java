package tarea3.usacajero;

public class CuentaRut extends Cuenta {
    // Atributos
    private long limiteSaldoDiario = 5000000; // Límite de saldo en pesos
    private long limiteGiroDiario = 200000; // Límite de giro en pesos
    
    // Constructor
    public CuentaRut(int numeroCuenta, long saldo, long saldoDolares) {
        super(numeroCuenta, saldo, saldoDolares);
    }
    
    // Método para realizar un giro
    @Override
    public void giro(long monto) {
        if (monto <= getSaldo() && monto < limiteGiroDiario) {
            // Realizar el giro
            long nuevoSaldo = getSaldo() - monto;
            setSaldo(nuevoSaldo);
            
            // Restar el monto del giro al límite de giro
            limiteGiroDiario -= monto;
            
            System.out.println("Tarea completada");
        } else if(monto>getSaldo()){System.out.println("El monto del giro excede el monto disponible.");}
        
        else {
            System.out.println("El monto del giro excede el límite de giro.");
        }
    }
    
    // Método para realizar un depósito
    @Override
    public void deposita(long monto) {
        if (monto + getSaldo() <= limiteSaldoDiario) {
            // Realizar el depósito
            long nuevoSaldo = getSaldo() + monto;
            setSaldo(nuevoSaldo);      
            System.out.println("Tarea completada");
        } else {
            System.out.println("El monto del depósito excede el límite de saldo.");
        }
    }
    
    // Getters y Setters
    public long getLimiteSaldo() {
        return limiteSaldoDiario;
    }
    
    public void setLimiteSaldo(long limiteSaldo) {
        this.limiteSaldoDiario = limiteSaldo;
    }
    
    public long getLimiteGiro() {
        return limiteGiroDiario;
    }
    
    public void setLimiteGiro(long limiteGiro) {
        this.limiteGiroDiario = limiteGiro;
    }
}

