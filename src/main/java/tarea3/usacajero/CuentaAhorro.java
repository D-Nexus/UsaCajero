package tarea3.usacajero;

public class CuentaAhorro extends Cuenta {
    //atributo
    private String TitularDeLaCuenta;
    private float tasaInteres;
    //constructor hacia el padre
    public CuentaAhorro (int numeroCuenta, long saldo, long saldoDolares,String TitularDeLaCuenta) {
        super(numeroCuenta,saldo,saldoDolares);
       this.TitularDeLaCuenta=TitularDeLaCuenta;
    }
    //getter
    public String getTitularDeLaCuenta() {
        return TitularDeLaCuenta;
    }
    public float getTasaInteres() {
        return tasaInteres;
    }
    //setter
    public void setTitularDeLaCuenta(String TitularDeLaCuenta) {
        this.TitularDeLaCuenta = TitularDeLaCuenta;
    }
    public void setTasaInteres(float tasaInteres) {
        this.tasaInteres = tasaInteres;
    }
}