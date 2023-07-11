/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author pilo
 */
public class Rectangulo implements calculosFormas {
    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    @Override
    public double calcularArea() {
        return lado1 * lado2;
    }
    
    @Override
    public double calcularPerimetro() {
        return 2 * (lado1 + lado2);
    }
}
