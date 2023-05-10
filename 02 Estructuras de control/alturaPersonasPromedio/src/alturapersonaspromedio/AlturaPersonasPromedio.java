/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alturapersonaspromedio;
import java.util.Scanner;
/**
 *
 * @author pilo
 */
public class AlturaPersonasPromedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de personas: ");
        int menores = 0;
        double alturaMenores = 0;
        double alturaTotal = 0;
        int personas = leer.nextInt();
        for (int i = 0; i < personas; i++) {
            System.out.println("ingrese la altura de las personas en centimetros: ");
            double altura = leer.nextDouble();
            alturaTotal = alturaTotal+altura;
                if (altura < 160) {
                    menores++;
                    alturaMenores = alturaMenores+altura;     
                }    
        }
        if (menores != 0) {
            System.out.println("la cantidad de personas que miden menos de 160cm es : " + menores + " y su promedio de altura es: " + (alturaMenores/menores) + "cm.");           
        } else { System.out.println("no hay personas menores a 160cm");}
        System.out.println("el promedio de altura de todas las personas es: " + (alturaTotal/personas) + "cm.");
    }
    
}
