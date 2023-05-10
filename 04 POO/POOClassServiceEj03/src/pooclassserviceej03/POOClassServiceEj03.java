/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooclassserviceej03;
import Entidades.Persona;
import Servicios.PersonaServicio;
import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakableNode;
/**
 *
 * @author pilo
 */
public class POOClassServiceEj03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PersonaServicio servicio = new PersonaServicio();
        for (int i = 1; i < 4; i++) {
            System.out.println("ingresando datos de persona " + i);
            System.out.println("ingrese nombre");
            String nombre = leer.nextLine();
            System.out.println("ingrese la edad");
            int edad = leer.nextInt();
            System.out.println("ingrese el sexo: hombre(H)/mujer(M)/otro(O)");
            char sexo = leer.next().charAt(0);
                while (sexo != 'h' && sexo != 'm' && sexo != 'o') {            
                System.out.println("ingrese una opcion correcta");
                sexo = leer.next().charAt(0);
                }
            System.out.println("ingrese la altura en metros");
            double altura = leer.nextDouble();
            System.out.println("ingrese el peso en kg");
            double peso = leer.nextDouble();
            Persona persona = new Persona(nombre, sexo, edad, altura, peso);
            
            int imc = servicio.calcularIMC(persona);
            double IMC = persona.getPeso() / Math.pow(persona.getAltura(), 2);
            System.out.println("IMC de la persona: " + IMC);
            
            switch (imc) {
                case -1:
                    if (!persona.esMayorDeEdad()) {
                        System.out.println(nombre + " es menor de edad y esta por debajo de su peso ideal.");
                    } else {
                        System.out.println(nombre + " es mayor de edad y esta por debajo de su peso ideal.");
                    }
                    break;
                case 0:
                    if (!persona.esMayorDeEdad()) {
                        System.out.println(nombre + " es menor de edad y esta en su peso ideal.");
                    } else {
                        System.out.println(nombre + " es mayor de edad y esta en su peso ideal.");
                    }
                    break;
                case 1:
                    if (!persona.esMayorDeEdad()) {
                        System.out.println(nombre + " es menor de edad y esta en sobrepeso");
                    } else {
                        System.out.println(nombre + " es mayor de edad y esta en sobrepeso");
                    }
                    break;
            }
        }
    }
    
}
