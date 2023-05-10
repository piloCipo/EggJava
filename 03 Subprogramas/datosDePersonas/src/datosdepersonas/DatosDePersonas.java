/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosdepersonas;
import java.io.PipedReader;
import java.util.Scanner;
/**
 *
 * @author pilo
 */
public class DatosDePersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String validar ="";
        while (!validar.equalsIgnoreCase("no")) {            
            System.out.println("ingrese nombre completo: ");
            String nom = leer.next();
            System.out.println("ingrese la edad: ");
            int edad = leer.nextInt();
            nombre(nom, edad);
            System.out.println("desea seguir ingresando datos?");
            validar = leer.next();
        }
        
        
    }
    public static void nombre (String nom, int edad){
        if (edad>=18) {
            System.out.println("la persona " + nom + " es mayor de edad!!");
        }else
            System.out.println("la persona " + nom + " es menor de edad!!");
        
    }
    
}

