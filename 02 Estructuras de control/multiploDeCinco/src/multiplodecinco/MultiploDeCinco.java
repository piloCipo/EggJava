/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplodecinco;
import java.util.Scanner;
/**
 *
 * @author pilo
 */
public class MultiploDeCinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer  = new Scanner(System.in);
        int numero = 1;
        int i = 0;
        int par=0;
        int impar=0; 
        while (numero%5!=0) {
        System.out.println("ingrese numeros enteros: ");
        numero = leer.nextInt();           
            if (numero%2==0) {
                par++;
            }else impar++;
            i++;    
        }
        System.out.println("cantidad de numeros ingresados: " + i);
        System.out.println("cantidad de numeros pares: " + par);
        System.out.println("cantidad de numeros impares: " + impar);
    }
    
}
