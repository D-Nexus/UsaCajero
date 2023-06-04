package tarea3.usacajero;
import java.util.Scanner; //Libreria para entrada desde teclado
/**
 *
 * @author Sebastian - Alan - Michelle
 */
public class UsaCajero {
    
    //Variable global del arreglo de objetos
    static Cuenta [] cuentas = new Cuenta[10];
    static long saldo = 0;
    
    public static void main(String[] args) {
        
        //Variables
        int opcion = 0;
        int numeroDeCuenta = 0;
        long monto = 0;
        String limite;
        
        //Entrada por teclado
        Scanner entrada = new Scanner(System.in);
        
        //Cuentas
        cuentas[0] = new CuentaRut(123456789,10000,20000);
        cuentas[1] = new CuentaCorriente(222222222,5000,10000,2);
        cuentas[2] = new CuentaAhorro(333333333,2000,4000,"Alan");
        
        //Usar las funcionalidades de los cajeros(Humano,Maquina)
        
        //CajeroHumano
        CajeroHumano cajero1 = new CajeroHumano(198361216, "Alan");
        //CajeroMaquina
        CajeroMaquina cajero2 = new CajeroMaquina("F-456",1500000);
        
        //Comprobación metodo tieneNumeroDeCuenta
        //System.out.println(cuentas[0].tieneNumeroDeCuenta(cuentas[0].getNumeroCuenta()));
        
        while (opcion != 3) {
            
            //Menu Principal
            System.out.println("############# TIPO DE CAJERO ############");
            System.out.println("=========================================");
            System.out.println("1. Cajero Humano");
            System.out.println("2. Cajero Maquina");
            System.out.println("3. Salir");
            opcion = Integer.parseInt(entrada.nextLine());
            //Error
            if (opcion != 1 && opcion != 2 && opcion != 3){
                System.out.println("Error: Opcion invalida");
            }
            System.out.println("=========================================");
            System.out.println("");
            
            if( opcion == 1){
                //Menu Cajero Humano
                while (opcion != 4) {
                    System.out.println("############# CAJERO HUMANO #############");
                    System.out.println("=========================================");
                    System.out.println("1. Depositar dinero");
                    System.out.println("2. Girar dinero");
                    System.out.println("3. Obtener saldo");
                    System.out.println("4. Salir");
                    opcion = Integer.parseInt(entrada.nextLine());
                    System.out.println("=========================================");
                    System.out.println("");

                    //Funcionalidades
                    switch(opcion){
                        case 1 -> {
                            System.out.println("OPCION DEPOSITAR ");
                            System.out.println("Ingrese el numero de cuenta: ");
                            //Verificación de no exeder el valor maximo de int
                            limite = entrada.nextLine();
                            if(limite.length() <= 9){ 
                                numeroDeCuenta = Integer.parseInt(limite); 
                                System.out.println("Ingrese el monto: ");
                                monto = Long.parseLong(entrada.nextLine());
                                cajero1.deposita(numeroDeCuenta ,monto);
                                System.out.println("");
                            }
                            else { 
                                System.out.println("ERROR: Maximo 9 digitos en el numero de cuenta" ); 
                                System.out.println("");
                            } 
                            
                        }
                        case 2 -> {
                            System.out.println("OPCION GIRAR ");
                            System.out.println("Ingrese el numero de cuenta: ");
                            //Verificación de no exeder el valor maximo de int
                            limite = entrada.nextLine();
                            if(limite.length() <= 9){ 
                                numeroDeCuenta = Integer.parseInt(limite); 
                                System.out.println("Ingrese el monto: ");
                                monto = Long.parseLong(entrada.nextLine());
                                cajero1.giro(numeroDeCuenta ,monto);
                                System.out.println("");
                            }
                            else { 
                                System.out.println("ERROR: Maximo 9 digitos en el numero de cuenta" ); 
                                System.out.println("");
                            } 
                        }
                        case 3 -> {
                            System.out.println("OPCION OBTENER SALDO ");
                            System.out.println("Ingrese el numero de cuenta: ");
                            //Verificación de no exeder el valor maximo de int
                            limite = entrada.nextLine();
                            if(limite.length() <= 9){ 
                                numeroDeCuenta = Integer.parseInt(limite);
                                saldo = cajero1.obtieneSaldo(numeroDeCuenta);
                                if (saldo > -1){
                                System.out.println("El saldo de la cuenta ["+numeroDeCuenta+"] es ["+saldo+"]");
                                System.out.println("");
                                }
                            }
                            else { 
                                System.out.println("ERROR: Maximo 9 digitos en el numero de cuenta" ); 
                                System.out.println("");
                            } 
                            
                        }
                        case 4 -> {}
                        default -> { System.out.println("Error: Opcion invalida"); }
                    }
                }
            }
            
            if( opcion == 2){
                //Menu Cajero Maquina
                while (opcion != 4) {
                    System.out.println("############ CAJERO MAQUINA #############");
                    System.out.println("=========================================");
                    System.out.println("1. Depositar dinero");
                    System.out.println("2. Girar dinero");
                    System.out.println("3. Obtener saldo");
                    System.out.println("4. Salir");
                    opcion = Integer.parseInt(entrada.nextLine());
                    System.out.println("=========================================");
                    System.out.println("");

                    //Funcionalidades
                    switch(opcion){
                        case 1 -> {
                            System.out.println("OPCION DEPOSITAR ");
                            System.out.println("Ingrese el numero de cuenta: ");
                            //Verificación de no exeder el valor maximo de int
                            limite = entrada.nextLine();
                            if(limite.length() <= 9){ 
                                numeroDeCuenta = Integer.parseInt(limite); 
                                System.out.println("Ingrese el monto: ");
                                monto = Long.parseLong(entrada.nextLine());
                                cajero2.deposita(numeroDeCuenta ,monto);
                                System.out.println("");
                            }
                            else { 
                                System.out.println("ERROR: Maximo 9 digitos en el numero de cuenta" ); 
                                System.out.println("");
                            }
                        }
                        case 2 -> {
                            System.out.println("OPCION GIRAR ");
                            System.out.println("Ingrese el numero de cuenta: ");
                            //Verificación de no exeder el valor maximo de int
                            limite = entrada.nextLine();
                            if(limite.length() <= 9){ 
                                numeroDeCuenta = Integer.parseInt(limite); 
                                System.out.println("Ingrese el monto: ");
                                monto = Long.parseLong(entrada.nextLine());
                                cajero2.giro(numeroDeCuenta ,monto);
                                System.out.println("");
                            }
                            else { 
                                System.out.println("ERROR: Maximo 9 digitos en el numero de cuenta" ); 
                                System.out.println("");
                            } 
                        }
                        case 3 -> {
                            System.out.println("OPCION OBTENER SALDO ");
                            System.out.println("Ingrese el numero de cuenta: ");
                            //Verificación de no exeder el valor maximo de int
                            limite = entrada.nextLine();
                            if(limite.length() <= 9){ 
                                numeroDeCuenta = Integer.parseInt(limite);
                                saldo = cajero2.obtieneSaldo(numeroDeCuenta);
                                if (saldo > -1){
                                System.out.println("El saldo de la cuenta ["+numeroDeCuenta+"] es ["+saldo+"]");
                                System.out.println("");
                                }
                            }
                            else { 
                                System.out.println("ERROR: Maximo 9 digitos en el numero de cuenta" ); 
                                System.out.println("");
                            }
                            
                        }
                        case 4 -> {}
                        default -> { System.out.println("Error: Opcion invalida"); }
                    }
                }
            } 
        }
    }
}
