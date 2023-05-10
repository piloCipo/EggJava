/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej04;
import entidades.rectangulos;
/**
 *
 * @author pilo
 */
public class POOEj04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        rectangulos rectangulo = new rectangulos();
        rectangulo.datos();
        double sup = rectangulo.superficie();
        System.out.println("la superficie del rectangulo es: " + sup + " u2");
        double per = rectangulo.perimetro();
        System.out.println("el perimetro del rectangulo es: " + per + " u");
        rectangulo.figura();
    }
    
}
