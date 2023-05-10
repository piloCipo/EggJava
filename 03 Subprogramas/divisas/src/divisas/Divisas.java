/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisas;
import java.util.Scanner;
/**
 *
 * @author pilo
 */
public class Divisas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantida de euros y a que divisa desea cambiar");
        System.out.println("euros: ");
        int euros = leer.nextInt();
        System.out.println("a que divisa desea cambiar: (libras/dolares/yenes)");
        String divisa = leer.next();
        cambio (divisa, euros);
    }
    public static void cambio (String divisa, int euros) {
        if (divisa.equalsIgnoreCase("libras")) {
            double libras = euros*0.86;
            System.out.println("su cambio es: " + libras + " libras.");
        }
        if (divisa.equalsIgnoreCase("dolares")) {
            double dolares = euros*1.28611;
            System.out.println("su cambio es: " + dolares + " dolares.");
        }
        if (divisa.equalsIgnoreCase("yenes")) {
            double yenes = euros*129.852;
            System.out.println("su cambio es: " + yenes + " yenes.");
        }
        else {
            System.out.println("ingrese bien la divisa.");
        }
    }
}
