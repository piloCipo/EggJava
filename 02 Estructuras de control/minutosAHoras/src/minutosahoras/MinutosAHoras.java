/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minutosahoras;
import java.util.Scanner;
/**
 *
 * @author pilo
 */
public class MinutosAHoras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una cantidad de minutos: ");
        int minutos = leer.nextInt();
        int dias = minutos/1440;
        int sobras = minutos%1440;
        int horas = sobras/60;
        System.out.println("la cantidad de minutos ingresados equivale a: " + dias + " dias y " + horas + " horas. ");
        
    }
    
}
