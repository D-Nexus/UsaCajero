package tarea3.usacajero;

public class CuentaAhorro extends Cuenta {
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
    public void setTasaInteres(double tasaInteresAnual) {
        if(tasaInteresAnual >= 0.005 && tasaInteresAnual <= 0.01){
            this.tasaInteresAnual = tasaInteresAnual;
        }
        else{ 
            System.out.println("Error: El interes debe estar entre 0.50% y 1%");
            System.out.println(""); //Saldo de linea
        }
        
    }
}