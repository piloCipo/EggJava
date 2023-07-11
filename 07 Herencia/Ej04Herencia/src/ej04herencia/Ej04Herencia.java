/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej04herencia;
import Entidades.Circulo;
import Entidades.Rectangulo;
import java.util.Scanner;
/**
 *
 * @author pilo
 */
public class Ej04Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el radio del circulo");
        double radio = leer.nextDouble();
        Circulo circulo = new Circulo(radio);
        System.out.println("ingrese los lados del rectangulo");
        System.out.println("lado 1");
        double lado1 = leer.nextDouble();
        System.out.println("lado 2");
        double lado2 = leer.nextDouble();
        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        
        double areaCirculo = circulo.calcularArea();
        double perimetroCirculo = circulo.calcularPerimetro();
        double areaRectangulo = rectangulo.calcularArea();
        double perimetroRectangulo = rectangulo.calcularPerimetro();
        
        System.out.println("el area del circulo es " + areaCirculo);
        System.out.println("el perimetro del circulo es " + perimetroCirculo);
        System.out.println("el area del rectangulo es " + areaRectangulo);
        System.out.println("el perimetro del rectangulo es " + perimetroRectangulo);
    }
    
}
