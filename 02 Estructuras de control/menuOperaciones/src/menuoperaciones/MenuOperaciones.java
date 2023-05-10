/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuoperaciones;
import java.util.Scanner;
/**
 *
 * @author pilo
 */
public class MenuOperaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String si = "s";
        String no = "n";
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese 2 numeros enteros: ");
        System.out.println("primer numero");
        float num1 = leer.nextInt();
        System.out.println("segundo numero");
        float num2 = leer.nextInt();
        float div = num1/num2;
        int opcion = 1;
        while (opcion > 0 && opcion <= 5) {
            System.out.println("elija la operacion que desea realizar: ");
            System.out.println("1: Sumar");
            System.out.println("2: Restar");
            System.out.println("3: Multiplicar");
            System.out.println("4: dividir");
            System.out.println("5: Salir");
                opcion = leer.nextInt();     
                if (opcion > 0 && opcion <= 5) {
                    switch (opcion) {
                    case 1:System.out.println("la suma es: " + (num1+num2));break;
                    case 2:System.out.println("la resta es: " + (num1-num2));break;
                    case 3:System.out.println("la multiplicacion es: " + (num1*num2));break;
                    case 4:System.out.println("la division es: " + (div));break;
                    case 5:System.out.println("seguro desea salir? si(s)/no(n)");
                    String letra = leer.next();
                        if (letra.equalsIgnoreCase(si)) {
                            System.out.println("programa finalizado");
                            opcion = 0;break;}
                        else if (letra.equalsIgnoreCase(no)) {
                            opcion = 1;break;}
                        else System.out.println("ingrese bien la opcion");                   
                    }
                } else System.out.println("ingrese bien la opcion");
            }
            
        }          
    }


