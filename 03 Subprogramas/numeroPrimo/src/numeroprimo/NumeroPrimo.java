/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroprimo;
import java.util.Scanner;
/**
 *
 * @author pilo
 */
public class NumeroPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero entero, el programa le dira si es primo o no");
        int numero = leer.nextInt();
        primo (numero);
    }
    public static void primo(int numero){
        int cont = 1;
        for (int i = 2; i < numero; i++) {
            int div = numero%i;
            if (div==0) {
                cont++;
            }
        }
        System.out.println(cont==1);
    }
}
