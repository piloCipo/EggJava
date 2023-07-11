/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01relaciones;
import Entidades.Perro;
import Entidades.Persona;
/**
 *
 * @author pilo
 */
public class Ejercicio01Relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro perro1 = new Perro();
        perro1.setNombre("mocka");
        perro1.setEdad(1);
        perro1.setRaza("shihtzu");
        perro1.setTamaño("pequeño");
        
        Perro perro2 = new Perro();
        perro2.setNombre("kika");
        perro2.setEdad(4);
        perro2.setRaza("callejera");
        perro2.setTamaño("mediano");
        
        Persona persona1 = new Persona();
        persona1.setNombre("rodrigo");
        persona1.setApellido("romero");
        persona1.setDni(35178792);
        persona1.setEdad(33);
        persona1.setPerro(perro1);
        
        Persona persona2 = new Persona();
        persona2.setNombre("valentina");
        persona2.setApellido("romero");
        persona2.setDni(45265874);
        persona2.setEdad(18);
        persona2.setPerro(perro2);
        System.out.println("---------------------");
        System.out.println("persona 1");
        System.out.println("- nombre: " + persona1.getNombre());
        System.out.println("- apellido: " + persona1.getApellido());
        System.out.println("- dni: " + persona1.getDni());
        System.out.println("- edad: " + persona1.getEdad());
        System.out.println("informacion del perro que adopta: ");
        System.out.println("- nombre: " + persona1.getPerro().getNombre());
        System.out.println("- raza: " + persona1.getPerro().getRaza());
        System.out.println("- edad: " + persona1.getPerro().getEdad());
        System.out.println("- tamaño: " + persona1.getPerro().getTamaño());
        System.out.println("----------------------");
        System.out.println("persona 2");
        System.out.println("- nombre: " + persona2.getNombre());
        System.out.println("- apellido: " + persona2.getApellido());
        System.out.println("- dni: " + persona2.getDni());
        System.out.println("- edad: " + persona2.getEdad());
        System.out.println("informacion del perro que adopta: ");
        System.out.println("- nombre: " + persona2.getPerro().getNombre());
        System.out.println("- raza: " + persona2.getPerro().getRaza());
        System.out.println("- edad: " + persona2.getPerro().getEdad());
        System.out.println("- tamaño: " + persona2.getPerro().getTamaño());
    }
    
}
/*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.*/