/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escaleranumeros;
import java.util.Scanner;
/**
 *
 * @author pilo
 */
public class EscaleraNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tamaño que desea darle a la escalera: ");
        int numero = leer.nextInt();
        int cont = 0;
        while (cont<numero) { 
            cont++;
            for (int i = 1; i < cont+1; i++) {
                System.out.print(i);      
            }
                System.out.println("");
        }            
    }
}
    

