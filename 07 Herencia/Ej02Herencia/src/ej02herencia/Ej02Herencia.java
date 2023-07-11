/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej02herencia;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.Scanner;
/**
 *
 * @author pilo
 */
public class Ej02Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String opcion;
        String o1 = "television";
        String o2 = "lavadora";
        do { 
            System.out.println("ingrese el electrodomestico que desea comprar: ");
            opcion = leer.nextLine();
            if (opcion.equalsIgnoreCase(o2)) {
                Lavadora lavadora = new Lavadora(0);
                lavadora.crearLavadora();
                System.out.println("el precio final de la lavadora es: " + lavadora.precioFinal());  
            } else if (opcion.equalsIgnoreCase(o1)) {
                Televisor televisor = new Televisor(0, true);
                televisor.crearTelevisor();
                System.out.println( televisor.precioFinal());  
            }
        } while (!opcion.equalsIgnoreCase("television") && !opcion.equalsIgnoreCase("lavadora"));

           
            

        
    }
    
}
