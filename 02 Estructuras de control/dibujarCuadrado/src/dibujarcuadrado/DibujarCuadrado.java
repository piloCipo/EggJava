/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujarcuadrado;
import java.util.Scanner;
/**
 *
 * @author pilo
 */
public class DibujarCuadrado {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de asteriscos que desea que tenga el cuadrado por lado:");
        int numero = leer.nextInt();
            for (int i = 0; i < numero; i++) {
                System.out.print("*");
            }
            System.out.println();
            for (int i = 0; i < numero-2; i++) {
                System.out.print("*");
                for (int j = 0; j < numero-2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            for (int i = 0; i < numero; i++) {
                System.out.print("*");
        }
              
            
        
    }
    
}
