/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;
import java.util.Scanner;
/**
 *
 * @author pilo
 */
public class Cuenta {
    private double saldo = 50000;
    private String titular;

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public Cuenta() {
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public void retirar_dinero () {
       Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el nombre del titular");
        this.titular = leer.nextLine();
        String validacion = "si";
        while (validacion.equalsIgnoreCase("si")) {
            System.out.println("ingrese cuanto desea retirar");  
            double retiro = leer.nextDouble();
            if (retiro <= this.saldo) {
                this.saldo = this.saldo - retiro;
                System.out.println("le queda en la cuenta " + (this.saldo));
            } else {
                System.out.println("no puede retirar mas dinero del que tiene en la cuenta");
            }
            if (this.saldo>0) {
                System.out.println("desea retirar mas dinero? si/no");
                validacion = leer.next();                
            } else {
                System.out.println("saliendo");
                break;
            }   
        }
        System.out.println("transaccion finalizada");
    }
}
