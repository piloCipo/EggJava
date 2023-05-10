/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detectarvocal;
import java.util.Scanner;
/**
 *
 * @author pilo
 */
public class DetectarVocal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese vocales: ");
        String letra = leer.nextLine();
        if (letra.equalsIgnoreCase("a")){
            System.out.println("la letra es vocal");
        } else if (letra.equalsIgnoreCase("e")) {
            System.out.println("la letra es vocal");
        } else if (letra.equalsIgnoreCase("i")) {
            System.out.println("la letra es vocal");
        } else if (letra.equalsIgnoreCase("o")) {
            System.out.println("la letra es vocal");
        } else if (letra.equalsIgnoreCase("u")) {
            System.out.println("la letra es vocal");    
        } else 
            System.out.println("la letra no es vocal");
    }    
}
