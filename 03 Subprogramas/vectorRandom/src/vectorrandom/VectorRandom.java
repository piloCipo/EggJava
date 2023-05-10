/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectorrandom;
import java.util.Scanner;
/**
 *
 * @author pilo
 */
public class VectorRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tamaño del vector: ");
        int tamaño = leer.nextInt();
        int vector[] = new int[tamaño];
        System.out.println("ingrese un numero del 0 al 9: ");
        int numero = leer.nextInt();
        int cont=0;
        for (int i = 0; i < tamaño; i++) {
            vector[i]=(int)Math.floor(Math.random()*10);
            if (vector[i]==numero) {
                System.out.println("el numero esta en la posicion " + i);
                cont++;  
            }
        }
         System.out.println("y aparece "+cont+" veces");
    }
    
}
