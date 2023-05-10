/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextraej01;
import entidades.Cancion;
/**
 *
 * @author pilo
 */
public class POOExtraEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion nuevaCancion = new Cancion();
        nuevaCancion.datos();
        String titulo = nuevaCancion.getTitulo();
        String autor = nuevaCancion.getAutor();
        System.out.println("el autor es: " + autor + ", la obra es: " + titulo);
    }
    
}
