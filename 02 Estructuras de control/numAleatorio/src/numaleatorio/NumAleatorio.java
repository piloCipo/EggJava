/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numaleatorio;
import java.util.Scanner;
/**
 *
 * @author pilo
 */
public class NumAleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1 = (int) (Math.random()*10);
        int num2 = (int) (Math.random()*10);
        int numero = num1*num2;
        System.out.println(num1);
        System.out.println(num2);           
        System.out.println("adivíne el número entre 0 y 100: ");
        int adivina = leer.nextInt();
        while (numero!=adivina) {
            System.out.println("número incorrecto, pruebe nuevamente con otro");
            adivina = leer.nextInt();
        }
        System.out.println("adivinó, el número es: " + adivina);
    }
}
