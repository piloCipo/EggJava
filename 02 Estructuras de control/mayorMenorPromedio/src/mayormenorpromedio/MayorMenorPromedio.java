/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayormenorpromedio;
import java.util.Scanner;
/**
 *
 * @author pilo
 */
public class MayorMenorPromedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de numeros que va a ingresar: ");
        int cantidad = leer.nextInt();
        int i = 0;
        int menor=999999999;
        int mayor=1;
        double suma=0;          
            while (i<cantidad) { 
                System.out.println("ingrese los numeros: ");
                int n = leer.nextInt();
                    if (n<menor) {
                        menor=n;
                    }if (n>mayor) {
                        mayor=n;
                    }
                    suma = suma+n;
                    i++;
            }
        System.out.println("el numero mayor es: " + mayor);
        System.out.println("el numero menor es: " + menor);
        System.out.println("el promedio de los numeros es: " + (suma/cantidad));
    }
    
}
