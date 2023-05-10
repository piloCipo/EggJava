/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerolmite;
import java.util.Scanner;
/**
 *
 * @author pilo
 */
public class NumeroLmite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el numero limite: ");
        int limite = leer.nextInt();
        System.out.println("ingrese el primer numero a sumar: ");
        int suma = leer.nextInt();
        while (suma < limite) {
            System.out.println("la suma no supera al limite!");
            System.out.println("ingrese el proximo numero a sumar: ");
            int numero = leer.nextInt();
            suma += numero;
            
        }
        System.out.println("la suma supera al limite y el total es: " + suma);
    }
    
}
