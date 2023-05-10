/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesmatematicas;
import java.util.Scanner;
/**
 *
 * @author pilo
 */
public class OperacionesMatematicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese 2 numeros: ");
        System.out.println("numero 1: "); 
        int num1 = leer.nextInt();
        System.out.println("numero 2: ");
        int num2 = leer.nextInt();
        System.out.println("que operacion desea realizar? ");
        System.out.println("1: sumar, 2: restar, 3: multiplicar, 4: dividir.");
        int opcion = leer.nextInt();
        switch (opcion) {
            case 1: int suma = suma(num1, num2);
                System.out.println("la suma es: " + suma);break;
            case 2: int resta = resta(num1, num2);
                System.out.println("la resta es: " + resta);break;
            case 3: int mult = mult(num1, num2);
                System.out.println("la multiplicacion es: " + mult);break;
            case 4: double div = div(num1, num2);
                System.out.println("ladivision es: " + div);break;
            default: System.out.println("ingrese bien la opcion");
        }
    }
    public static int suma (int num1, int num2) {
        int suma = num1+num2;
        return suma;
    }
    public static int resta (int num1, int num2) {
        int resta = num1-num2;
        return resta;
    }
    public static int mult (int num1, int num2) {
        int mult = num1*num2;
        return mult;
    }
    public static double div (double num1, double num2) {
        double div = num1/num2;
        return div;
    }
}