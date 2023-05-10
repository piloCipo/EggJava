/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooclassserviceej01;
import entidades.CuentaBancaria;
import servicio.CuentaBancariaServicio;
import java.util.Scanner;
/**
 *
 * @author pilo
 */
public class POOClassServiceEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CuentaBancariaServicio servicio = new CuentaBancariaServicio();
        System.out.println("bienvenido al programa de cuentas");
        System.out.println("ingrese su numero de cliente");
        int numeroCliente = leer.nextInt();
        System.out.println("ingrese numero DNI");
        long dniCliente = leer.nextLong();
        System.out.println("ingrese saldo inicial de la cuenta");
        double saldoInicial = leer.nextDouble();
        
        CuentaBancaria cuenta = new CuentaBancaria(numeroCliente, dniCliente, saldoInicial);
            int opcion = 0;
            while (opcion != 6) {            
                System.out.println();
                System.out.println("seleccione una opcion: ");
                System.out.println("1. Consultar saldo");
                System.out.println("2. Realizar deposito ");
                System.out.println("3. Realizar retiro. ");
                System.out.println("4. Realizar extraccion rapida ");
                System.out.println("5. Consultar estado de cuenta");
                System.out.println("6. Salir");
                opcion = leer.nextInt();
                switch (opcion){
                    case 1:
                        double saldoActual = servicio.consultarSaldo(cuenta);
                        System.out.println("su saldo es: " + saldoActual);
                        break;
                    case 2:
                        System.out.println("ingrese la cantidad a depositar");
                        double cantidadDeposito = leer.nextDouble();
                        servicio.ingresar(cuenta, cantidadDeposito);
                        System.out.println("el deposito se realizo correctamente");
                        break;
                    case 3:
                        System.out.println("ingrese la cantidad a retirar");
                        double cantidadRetiro = leer.nextDouble();
                        servicio.retirar(cuenta, cantidadRetiro);
                        System.out.println("el retiro se realizo correctamente");
                        break;
                    case 4:
                        if (cuenta.getSaldoActual() == 0) {
                            System.out.println("no se puede retirar dinero, el saldo es 0");
                        } else {
                            servicio.extraccionRapida(cuenta);
                            System.out.println("extraccion rapidad exitosa");
                        }
                        break;    
                    case 5:
                        servicio.consultarDatos(cuenta);
                        break;
                    case 6:
                        System.out.println("programa finalizado");
                        break;
                    default:
                        System.out.println("ingrese una opcion correcta");
                        break;
                }
        }
    }
    
}
