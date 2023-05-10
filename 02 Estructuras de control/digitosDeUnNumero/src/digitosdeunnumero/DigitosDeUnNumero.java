/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitosdeunnumero;
import java.util.Scanner;
/**
 *
 * @author pilo
 */
public class DigitosDeUnNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero entero:");
        int numero = leer.nextInt();
        int digitos = 1;
        while (numero>=10) {            
            numero=numero/10;
            digitos++;
        }
        System.out.println("el numero tiene " + digitos + " digitos.");
    }
    
}
