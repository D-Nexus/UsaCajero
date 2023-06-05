package tarea3.usacajero;

public class CuentaRut extends Cuenta {
    
    //constructor hacia el padre
    public CuentaRut (int numeroCuenta, long saldo, long saldoDolares) {
        super(numeroCuenta,saldo,saldoDolares);
       
    }
    @Override
    //Metodos de clase
    public void deposita(long monto){
        long saldoNuevo = getSaldo();
        saldoNuevo = saldoNuevo + monto;
        setSaldo(saldoNuevo);  
    }
    @Override
    public void giro(long monto){
        long saldoNuevo = getSaldo();
        saldoNuevo = saldoNuevo - monto;
        setSaldo(saldoNuevo);
        System.out.println("Esta es la cuenta rut con metodo modificado");
    }
}