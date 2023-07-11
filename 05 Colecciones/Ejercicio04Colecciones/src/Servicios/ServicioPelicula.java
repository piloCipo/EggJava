/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;
import Entidades.Pelicula;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author pilo
 */
public class ServicioPelicula {
    ArrayList<Pelicula> pelis = new ArrayList<>();
    public void crearPelicula(){
        Scanner leer = new Scanner(System.in);
        String opcion;
        do {            
            System.out.println("ingrese los datos de la pelicula:");
            System.out.println("Titulo:");
            String titulo = leer.nextLine();
            System.out.println("Director:");
            String director = leer.nextLine();
            System.out.println("Duracion");
            double duracion = Double.parseDouble(leer.nextLine());
            pelis.add(new Pelicula(titulo, director, duracion));
            System.out.println("desea cargar otra pelicula? s/n");
            opcion = leer.nextLine();
        } while (!opcion.equalsIgnoreCase("n"));
        
        System.out.println("la lista de peliculas ingresadas es: " + pelis);
    }
    
    public void duracionMayor () {
        for (Pelicula pelicula : pelis) {
            if (pelicula.getDuracion() > 1) {
                System.out.println("Titulo: " + pelicula.getPelicula());
                System.out.println("Director: " + pelicula.getDirector());
                System.out.println("Duracion: " + pelicula.getDuracion() + " horas.");
                System.out.println("-----------------------------------------");
            }
        }
    }
    
    public void mayorAMenor(){
        Collections.sort(pelis, new Comparator<Pelicula>(){
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return Double.compare(p2.getDuracion(), p1.getDuracion());
            }
        });
        mostrarPeliculas();
    }
    
    public void menorAMayor(){
        Collections.sort(pelis, new Comparator<Pelicula>(){
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return Double.compare(p1.getDuracion(), p2.getDuracion());
            }
        });
        mostrarPeliculas();
    }
    
    public void porTitulo(){
        Collections.sort(pelis, new Comparator<Pelicula>(){
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return p1.getPelicula().compareToIgnoreCase(p2.getPelicula());
            }
        });
        mostrarPeliculas();
    }
    
    public void porDirector(){
        Collections.sort(pelis, new Comparator<Pelicula>(){
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return p1.getDirector().compareToIgnoreCase(p2.getDirector());
            }
        });
        mostrarPeliculas();
    }
    
    public void mostrarPeliculas(){
        for (Pelicula pelicula : pelis) {
            System.out.println("Titulo: " + pelicula.getPelicula());
            System.out.println("Director: " + pelicula.getDirector());
            System.out.println("Duracion: " + pelicula.getDuracion() + " horas.");
            System.out.println("-----------------------------------------");
        }
    }
}
