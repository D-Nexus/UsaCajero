package tarea3.usacajero;

public class CuentaCorriente extends Cuenta{

    //Atributos
    private String TitularDeLaCuenta;
    //Constructor del padre
    public CuentaCorriente(int numeroCuenta, long saldo, long saldoDolares,String TitularDeLaCuenta) {
        super(numeroCuenta,saldo,saldoDolares);
        this.TitularDeLaCuenta = TitularDeLaCuenta;
    }
    //getter
    public String getTitularDeLaCuenta() {
        return TitularDeLaCuenta;
    }
    //setter
    public void setTitularDeLaCuenta(String TitularDeLaCuenta) {
        this.TitularDeLaCuenta = TitularDeLaCuenta;
    }
    
    //metodo
    public void emitirCheques (int numeroCuenta, String nombreBeneficiario, String fecha, long monto, String nombreBanco){
        //Retiramos el dinero destinado al cheque desde el saldo de la cuenta.
        
        //Verificación en caso de no existir el numero de cuenta ingresado
        boolean numeroDeCuentaExiste = false;
        
        //Recorrer el arreglo de objetos de tipo cuenta y buscar donde coincida el numero de cuenta y depositar
        for(Cuenta cuenta: UsaCajero.cuentas){
        
            //En caso de encontrar una posicion vacia sin cuenta con el valor por defecto Null
            if (cuenta == null) continue;
            
            //Comparar numeros de cuentas y depositar en la cuenta correspondiente
            if(cuenta.getNumeroCuenta() == numeroCuenta){
                System.out.println("Emitiendo Cheque con los siguientes datos: ");
                System.out.println("Nombre del beneficiario ["+nombreBeneficiario+"]");
                System.out.println("Fecha ["+fecha+"]");
                System.out.println("Monto ["+monto+"]");
                System.out.println("Nombre del banco ["+nombreBanco+"]");
                System.out.println("Nombre del emisor del cheque ["+getTitularDeLaCuenta()+"], Numero de cuenta ["+numeroCuenta+"]");
                System.out.println("");
                cuenta.giro(monto);
                numeroDeCuentaExiste = true;
                break;
            }  
        }
        //Error
        if (numeroDeCuentaExiste == false){
            System.out.println("Operacion invalida error: numero de cuenta no existe");
        }
          
    }
    
}

