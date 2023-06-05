package tarea3.usacajero;

public class CuentaAhorro extends Cuenta {
    //variables
    static int girosPermitidosAño = 9;
    //atributo
    private String TitularDeLaCuenta;
    private double tasaInteresAnual;
    
    //constructor hacia el padre
    public CuentaAhorro (int numeroCuenta, long saldo, long saldoDolares,String TitularDeLaCuenta, double tasaInteresAnual) {
        super(numeroCuenta,saldo,saldoDolares);
        this.TitularDeLaCuenta=TitularDeLaCuenta;
    }
    
    //getter
    public String getTitularDeLaCuenta() {
        return TitularDeLaCuenta;
    }
    
    public double getTasaInteres() {
        return getSaldo() * tasaInteresAnual;
    }
    
    //setter
    public void setTitularDeLaCuenta(String TitularDeLaCuenta) {
        this.TitularDeLaCuenta = TitularDeLaCuenta;
    }
    
    //metodo
    public void setTasaInteres(double tasaInteresAnual) {
        if(tasaInteresAnual >= 0.005 && tasaInteresAnual <= 0.01){
            this.tasaInteresAnual = tasaInteresAnual;
        }
        else{ 
            System.out.println("Error: El interes debe estar entre 0.50% y 1%");
            System.out.println(""); //Saldo de linea
        }
        
    }
        
    @Override
    public void giro(long monto){
        if(girosPermitidosAño != 0 ){
            if(getSaldo() == 0 || (getSaldo() - monto) < 0){
                System.out.println("Saldo insuficiente");
            }
            else{
                if(monto >= 1 && monto <=1000000){
                    long saldoNuevo = getSaldo();
                    saldoNuevo = saldoNuevo - monto;
                    setSaldo(saldoNuevo);
                    girosPermitidosAño = girosPermitidosAño - 1;
                }
                else{
                    System.out.println("Error: El monto maximo de giro es de 200.000 pesos");
                    System.out.println("");
                }
            }
        }
        else { 
            System.out.println("Error: Ya no tiene giros disponibles por este año"); 
            System.out.println(""); 
        } 
    }
}