/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabraigual;
import java.util.Scanner;
/**
 *
 * @author pilo
 */
public class PalabraIgual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una palabra: ");
        String palabra = leer.nextLine();
        String eureka = "eureka";
        if (palabra.equals(eureka)) {
            System.out.println("Correcto!!");
        }else 
            System.out.println("Incorrecto!!");
    }
    
}
