/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farenheit;
import java.util.Scanner;
/**
 *
 * @author pilo
 */
public class Farenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una temperatura en grados centigrados: ");
        double temp = leer.nextDouble();
        double faren = 32+(9*temp/5);
        System.out.println("la temperatura en farenheit es: " + faren);
    }
    
}
