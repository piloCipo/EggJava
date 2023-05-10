/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segunletra;
import java.util.Scanner;
/**
 *
 * @author pilo
 */
public class SegunLetra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese su clase de socio:");
        String clase = leer.nextLine();
        System.out.println("ingrese el costo del tratamiento:");
        double costo = leer.nextDouble();
        switch (clase){
            case "a": case "A": System.out.println("el costo de su tratamiento es: " + (costo*0.5) + "$");break;
            case "b": case "B": System.out.println("el costo de su tratamiento es: " + (costo*0.65) + "$");break;
            case "c": case "C": System.out.println("el costo de su tratamiento es: " + costo + "$");break;
            default: System.out.println("ingrese bien la clase");break;
        }
    }
    
}
