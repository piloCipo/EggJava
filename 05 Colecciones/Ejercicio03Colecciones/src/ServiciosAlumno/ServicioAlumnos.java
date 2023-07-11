/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiciosAlumno;
import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author pilo
 */
public class ServicioAlumnos {
    ArrayList<Alumno> ListaAlumnos = new ArrayList<>();
    public void CrearAlumno (){
    Scanner leer = new Scanner(System.in);
    String opcion;
            do {                
                System.out.println("ingrese el nombre del alumno:");
                String nombre = leer.next();
                ArrayList<Integer> notas = new ArrayList<>();
                for (int i = 1; i <= 3; i++) {
                    System.out.println("ingrese las notas:");
                    System.out.println("nota " + i + ":");
                    notas.add(leer.nextInt()); 
                } 
                ListaAlumnos.add(new Alumno(nombre, notas));
                System.out.println("desea ingresar otro alumno? s/n");          
                opcion = leer.next();
            } while (!opcion.equalsIgnoreCase("n"));
            System.out.println(ListaAlumnos);
    }
    
    public double notaFinal(String nombreBuscado) { 
        double promedio = 0;
        double suma = 0;
        for (Alumno alumno : ListaAlumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombreBuscado)) {
                ArrayList<Integer> notas = alumno.getNotas();
                for (double nota : notas) {
                    suma += nota;
                    promedio = suma / notas.size();
                }
                return promedio;
            }
        }
        return -1;
    }   
}

/*Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
*/