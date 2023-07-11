/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01colecciones;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author pilo
 */
public class Ejercicio01Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<String> perros = new ArrayList();
        String opcion;
        String raza;
        String borrar;
        int cantidadInicial;
        int cantidadFinal;
        do {            
            System.out.println("ingrese una raza de perros");
            raza = leer.nextLine();
            perros.add(raza);
            System.out.println("desea seguir igresando razas?");
            opcion = leer.nextLine();
        } while (opcion.equalsIgnoreCase("s"));
            System.out.println("las razas de perros ingresadas son:");
            System.out.println(perros);
            cantidadInicial = perros.size();
        System.out.println("ingrese una raza que desee borrar de la lista");
        borrar = leer.nextLine();
        
        Iterator<String> iterador = perros.iterator();
        while (iterador.hasNext()) {            
            if (iterador.next().equalsIgnoreCase(borrar)) {
                iterador.remove();
            }
        }
        cantidadFinal = perros.size();
        if (cantidadFinal == cantidadInicial) {
            System.out.println("no se ha eliminado ninguna raza");
        } else {
            System.out.println("se ha eliminado una raza, la nueva lista es:");
            System.out.println(perros);
        }
    }
}

/* Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList. */