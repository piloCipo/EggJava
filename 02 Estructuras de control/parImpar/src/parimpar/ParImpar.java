/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parimpar;
import java.util.Scanner;
/**
 *
 * @author pilo
 */
public class ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero entero: ");
        int numero = leer.nextInt();
        if (numero % 2 == 0) {
            System.out.println("el numero ingresado es par!! "); 
        }else 
            System.out.println("el numero ingresado es impar!! ");
    }
    
}
