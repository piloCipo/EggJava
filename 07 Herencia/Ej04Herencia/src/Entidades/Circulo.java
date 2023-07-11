/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author pilo
 */
public class Circulo implements calculosFormas {
    
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    public double calcularArea() {
        return PI * radio * radio;
    }
    
    public double calcularPerimetro() {
        return 2 * PI * radio;
    }
    
}
