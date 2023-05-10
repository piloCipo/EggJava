/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import Entidades.Persona;
import java.util.Scanner;
/**
 *
 * @author pilo
 */
public class PersonaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public boolean esMayorDeEdad(Persona persona){
        return persona.getEdad() >= 18;
    }
    public Persona crearPersona(){
        System.out.println("ingrese el nombre");
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
        
        return new Persona(nombre, sexo, edad, altura, peso);
    }
    public int calcularIMC(Persona persona){
        double imc = persona.getPeso() / Math.pow(persona.getAltura(), 2);
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }
}
