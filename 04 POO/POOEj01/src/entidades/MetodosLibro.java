/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;
import java.util.Scanner;


/**
 *
 * @author pilo
 */
    public class MetodosLibro {
        public static void metodosLibro(){
        Scanner leer = new Scanner(System.in);
        Libros libro = new Libros();
        System.out.println("ingrese autor");
        libro.setAutor(leer.next());
        System.out.println("ingrese titulo");
        libro.setTitulo(leer.next());
        System.out.println("ingrese numero de paginas");
        libro.setNumPag(leer.nextInt());
        System.out.println("ingrese ISBN");
        libro.setISBN(leer.nextInt());
 
        System.out.println("autor: " + libro.getAutor ());
        System.out.println("titulo: " + libro.getTitulo());
        System.out.println("numero de paginas: " + libro.getNumPag() );
        System.out.println("ISBN: " + libro.getISBN());
    }
    }