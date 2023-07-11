/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Random;

/**
 *
 * @author pilo
 */
public class Cine {
    private Pelicula pelicula;
    private char[][] sala;
    private double precio;

    public Cine(Pelicula pelicula, double precio) {
        this.pelicula = pelicula;
        this.sala = new char[8][6];
        this.precio = precio;
        iniciarSala();
    }

    public Cine() {
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public char[][] getSala() {
        return sala;
    }

    public void setSala(char[][] sala) {
        this.sala = sala;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    private void iniciarSala(){
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                sala[i][j] = ' ';
            }
        }
    }
    
    public void mostrarSala() {
        System.out.println("tabla de asientos");
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                System.out.print((8 - i) + " " + (char)('A' + j) + " " + sala[i][j] + " | ");
            }
            System.out.println();
        }
    }
    
    public boolean asientoDisponible() {
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                if (sala[i][j] == ' ') {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean ubicarEspectador(Espectador espectador) { 
        Random random = new Random();
        while (asientoDisponible()) {            
            int fila = random.nextInt(sala.length);
            int columna = random.nextInt(sala[0].length);
            if (sala[fila][columna] == ' ') {
                if (espectador.getEdad() >= pelicula.getEdadMinima() && espectador.getDinero() >= precio) {
                    sala[fila][columna] = 'X';
                    return true;
                } else if (espectador.getEdad() < pelicula.getEdadMinima()) {
                    System.out.println("el cliente no puede ingresar a esta funcion por su edad");
                    break;
                } else if (espectador.getDinero() < precio) {
                    System.out.println("saldo insuficiente");
                    break;
                }
            }
        }
        return false;
    }
    
    
}
/*De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada*/