/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerletra;
import java.util.Scanner;

/**
 *
 * @author pilo
 */
public class PrimerLetra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una frase o palabra: ");
        String frase = leer.nextLine();
        if (frase.substring(0, 1).equals("A")) {
            System.out.println("CORRECTO la palabra o frase comienza con 'A'!!");          
        }else
            System.out.println("INCORRECTO la palabra o frase no comienza con 'A'!!");
    }
    
}
