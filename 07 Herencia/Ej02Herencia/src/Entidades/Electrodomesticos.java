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
public class Electrodomesticos {
    private double precio;
    private String color;
    private char consumo;
    private int peso;

    public Electrodomesticos() {
        this.color = "blanco";
        this.consumo = 'F';
        this.peso = 1;
        this.precio = 1000;
    }

    public Electrodomesticos(double precio, String color, char consumo, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    private void comprobarConsumo(char letra) {
        if (letra >= 'A' && letra <= 'F') {
            consumo = letra;
        } else {
            consumo = 'F';
        }
    }
    
    private void comprobarColor(String color) {
        if (color.toLowerCase().equals("blanco") || color.toLowerCase().equals("negro") || 
            color.toLowerCase().equals("rojo") || color.toLowerCase().equals("azul") || color.toLowerCase().equals("gris")){
            this.color = color;
        } else {
            this.color = "blanco";
        }
    }
    
    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el precio");
        double precio = leer.nextDouble();
        leer.nextLine();
        System.out.println("ingrese el color");
        String color = leer.nextLine();
        comprobarColor(color);
        System.out.println("ingrese el consumo (ABCDEF)");
        char consumo = leer.nextLine().toUpperCase().charAt(0);
        comprobarConsumo(consumo);
        System.out.println("ingrese el peso");
        int peso = leer.nextInt();
    }
    
    public double precioFinal() {
        double precioFinal = precio;
        switch (consumo) {
            case 'A':
                precioFinal += 1000;
                break;
            case 'B':
                precioFinal += 800;
                break;
            case 'C':
                precioFinal += 600;
                break;
            case 'D':
                precioFinal += 500;
                break;
            case 'E':
                precioFinal += 300;
                break;
            case 'F':
                precioFinal += 100;
                break;
        }
        
        if (peso >= 1 && peso <= 19) {
            precioFinal += 100;
        } else if (peso >= 20 && peso <= 49) {
            precioFinal += 500;
        } else if (peso >= 50 && peso <= 79) {
            precioFinal += 800;
        } else if (peso >= 80) {
                precioFinal += 1000;
        }
        return precioFinal;
    }
}
