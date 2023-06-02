package tarea3.usacajero;

/**
 *
 * @author Sebastian - Alan - Michelle
 */
public class CajeroMaquina extends Maquina implements Cajero{
    
    //Variable para guardar la cuenta actual temporalmente
    static Cuenta cuentaActual;
    
    //Constructor llamando a los atributos de la clase padre
    public CajeroMaquina(String modelo, int precio) {
        super(modelo,precio);
    }
    
    /*Al implementar una interfaz en una clase, es necesario proporcionar una implementación para todos los métodos 
    declarados en la interfaz. De lo contrario, se generará un error de compilación.*/
    
    //Override significa que sobreescribe un metodo de otra clase padre o interface
    @Override
    public void deposita(int numeroCuenta, long monto) {
        //Verificación en caso de no existir el numero de cuenta ingresado
        boolean numeroDeCuentaExiste = false;
        
        //Recorrer el arreglo de objetos de tipo cuenta y buscar donde coincida el numero de cuenta y depositar
        for(Cuenta cuenta: UsaCajero.cuentas){
        
            //En caso de encontrar una posicion vacia sin cuenta con el valor por defecto Null
            if (cuenta == null) continue;
            
            //Comparar numeros de cuentas y depositar en la cuenta correspondiente
            if(cuenta.getNumeroCuenta() == numeroCuenta){
                cuenta.deposita(monto);
                numeroDeCuentaExiste = true;
                break;
            }  
        }
        //Error
        if (numeroDeCuentaExiste == false){
            System.out.println("Operacion invalida error: numero de cuenta no existe");
        }
    }

    @Override
    public void giro(int numeroCuenta, long monto) {
        //Verificación en caso de no existir el numero de cuenta ingresado
        boolean numeroDeCuentaExiste = false;
        
        //Recorrer el arreglo de objetos de tipo cuenta y buscar donde coincida el numero de cuenta y depositar
        for(Cuenta cuenta: UsaCajero.cuentas){
        
            //En caso de encontrar una posicion vacia sin cuenta con el valor por defecto Null
            if (cuenta == null) continue;
            
            //Comparar numeros de cuentas y depositar en la cuenta correspondiente
            if(cuenta.getNumeroCuenta() == numeroCuenta){
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

    @Override
    public long obtieneSaldo(int numeroCuenta) {
        //Verificación en caso de no existir el numero de cuenta ingresado
        boolean numeroDeCuentaExiste = false;
        
        //Recorrer el arreglo de objetos de tipo cuenta y buscar donde coincida el numero de cuenta y depositar
        for(Cuenta cuenta: UsaCajero.cuentas){
        
            //En caso de encontrar una posicion vacia sin cuenta con el valor por defecto Null
            if (cuenta == null) continue;
            
            //Comparar numeros de cuentas y depositar en la cuenta correspondiente
            if(cuenta.getNumeroCuenta() == numeroCuenta){
                numeroDeCuentaExiste = true;
                cuentaActual = cuenta;
            }
        }
        //Error
        if (numeroDeCuentaExiste == false){
            System.out.println("Operacion invalida error: numero de cuenta no existe");
            return -1;
        }
        
        //Retornamos el saldo de la cuenta actual
        return cuentaActual.getSaldo();
    }
    
}
