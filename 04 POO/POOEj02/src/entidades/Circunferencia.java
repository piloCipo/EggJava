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
public class Circunferencia {
    private double radio;

    public Circunferencia(double radio) {
        this.radio = 0;
    }

    public Circunferencia() {
    }
    

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void pedirRadio() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el radio");
        this.radio = leer.nextDouble();
        
    }    
    
    public double Area() {
        return  Math.PI * Math.pow(this.radio, 2);
    }
    public double Perimetro() {
        return 2 * Math.PI * this.radio;
    }
}
