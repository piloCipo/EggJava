/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisionporrestas;
import java.util.Scanner;
/**
 *
 * @author pilo
 */
public class DivisionPorRestas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el dividendo: ");        
        int numero1 = leer.nextInt();
        System.out.println("ingrese el divisor: ");
        int numero2 = leer.nextInt();
        int entero = 0;
        while (numero1>=numero2) {
            numero1=numero1-numero2;
            entero++;
        }
        System.out.println("el resultado de la division es: " + entero + " el residuo es: " + numero1);
    }
    
}
