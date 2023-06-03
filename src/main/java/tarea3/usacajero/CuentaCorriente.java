package tarea3.usacajero;

public class CuentaCorriente extends Cuenta{
    //atributo
       private int cheques;
    //Constructor del padre
    public CuentaCorriente(int numeroCuenta, long saldo, long saldoDolares,int cheques) {
        super(numeroCuenta,saldo,saldoDolares);
        this.cheques =cheques;
    }
    //getter

    public int getCheques() {
        return cheques;
    }
    //setter
    public void setCheques(int cheques) {
        this.cheques = cheques;
    }
        
    //metodo
    public void emitirCheques (){
       }
    
}

