/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author pilo
 */
public class Jugador {
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador " + id;
        this.mojado = false;
    }
        
    public boolean disparo(RevolverAgua r){
        r.siguienteChorro();
        if (r.mojar()) {
            mojado = true;
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return nombre + " - " + (mojado ? "Mojado" : "Seco");
    }
    
    
}
