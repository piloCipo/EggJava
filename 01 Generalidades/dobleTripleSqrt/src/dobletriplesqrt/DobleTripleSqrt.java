/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dobletriplesqrt;
import java.util.Scanner;
/**
 *
 * @author pilo
 */
public class DobleTripleSqrt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero entero: ");
        int numero = leer.nextInt();
        int doble = numero*2;
        int triple = numero * 3;
        double raiz = Math.sqrt(numero);
        System.out.println("el doble del numero es: " + doble);
        System.out.println("el triple del numero es: " + triple);
        System.out.println("la raiz cuadrada del numero es: " + raiz);
        
    }
    
}
