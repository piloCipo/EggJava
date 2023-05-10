/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upper.lowercase;
import java.util.Scanner;
/**
 *
 * @author pilo
 */
public class UpperLowerCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una frase: ");
        String frase = leer.nextLine();
        System.out.println("la frase en mayusculas es: " + frase.toUpperCase());
        System.out.println("la frase en minusculas es: " + frase.toLowerCase());
        
    }
    
}
