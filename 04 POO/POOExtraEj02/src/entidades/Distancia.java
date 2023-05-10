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
public class Distancia {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Distancia(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Distancia() {
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
    
    public void crearPuntos() {
        Scanner leer = new  Scanner(System.in);
        System.out.println("ingrese las coordenadas de los 2 puntos: ");
        System.out.println("x1: ");
        this.x1 = leer.nextDouble();
        System.out.println("y1: ");
        this.y1 = leer.nextDouble();
        System.out.println("x2: ");
        this.x2 = leer.nextDouble();
        System.out.println("y2: ");
        this.y2 = leer.nextDouble();      
    }
    public double distancia() {
        return Math.sqrt(Math.pow(this.x2-this.x1, 2) + Math.pow(this.y2-this.y1, 2));
    }  
    
}
