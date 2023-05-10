/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej02;
import entidades.Circunferencia;
/**
 *
 * @author pilo
 */
public class POOEj02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia c1 = new Circunferencia(); 
        c1.pedirRadio();
        double radio = c1.getRadio();
        System.out.println("el radio es: " + radio);
        double area = c1.Area();
        System.out.println("el area es: " + area);
        double perimetro = c1.Perimetro();
        System.out.println("el perimetro es: " + perimetro);
        
    }

}
