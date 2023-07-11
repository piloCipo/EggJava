/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;
import java.util.Scanner;
/**
 *
 * @author pilo
 */
public class Lavadora extends Electrodomesticos {
    
    private double carga;

    public Lavadora(double carga) {
        this.carga = carga;
    }

    public Lavadora(double carga, double precio, String color, char consumo, int peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }
    
    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
    public void crearLavadora() { 
        crearElectrodomestico();
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la carga de la lavadora");
        double carga = leer.nextDouble();
    }
    
    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if (carga > 30) {
            precioFinal += 500;
        }
        return precioFinal;
    }
}
