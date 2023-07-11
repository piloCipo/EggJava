/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author pilo
 */
public class Juego {
    private ArrayList<Jugador> jugadores;
    private RevolverAgua revolver;

    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverAgua r) {
        this.jugadores = jugadores;
        this.revolver = r;
    }
    
    public void ronda(){
        int jugadorActual = 0;
        boolean alguienMojado = false;
        
        while (!alguienMojado) {            
            Jugador jugador = jugadores.get(jugadorActual);
            alguienMojado = jugador.disparo(revolver);
            System.out.println(jugador);
            jugadorActual++;
            if (jugadorActual >= jugadores.size()) {
                jugadorActual = 0;
            }
        }
        System.out.println("Alguien se mojo");
    }
}
