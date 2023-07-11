/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04colecciones;
import Servicios.ServicioPelicula;
/**
 *
 * @author pilo
 */
public class Ejercicio04Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioPelicula servicios = new ServicioPelicula();
        servicios.crearPelicula();
        System.out.println("Peliculas que superan la hora de duracion: ");
        servicios.duracionMayor();
        System.out.println("peliculas ordenadas de mayor a menor duracion: ");
        servicios.mayorAMenor();
        System.out.println("peliculas ordenadas de menor a mayor duracion: ");
        servicios.menorAMayor();
        System.out.println("peliculas ordenadas por orden alfabetico del titulo: ");
        servicios.porTitulo();
        System.out.println("peliculas ordenadas por orden alfabetico del director: ");
        servicios.porDirector();
    }
    
}
