/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;
import java.util.Scanner;
/**
 *
 * @author pilo
 */
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el primer numero: ");
        int num1 = leer.nextInt();
        System.out.println("ingrese el segundo numero: ");
        int num2 = leer.nextInt();
        int suma = num1+num2;
        System.out.println("la suma de los dos numeros es: " + suma);
        
    }
    
}
