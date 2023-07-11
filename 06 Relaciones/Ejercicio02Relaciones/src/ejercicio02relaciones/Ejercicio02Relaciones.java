/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02relaciones;

import java.util.ArrayList;
import Entidades.Jugador;
import Entidades.RevolverAgua;
import Entidades.Juego;
/**
 *
 * @author pilo
 */
public class Ejercicio02Relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Jugador> jugadores = new ArrayList<>();
        int numeroJugadores = 6;
        
        for (int i = 1; i <= numeroJugadores; i++) {
            jugadores.add(new Jugador(i));
        }
        
        RevolverAgua revolver = new RevolverAgua();
        revolver.llenarRevolver();
        
        Juego juego = new Juego();
        juego.llenarJuego(jugadores, revolver);
        juego.ronda();
        
    }
    
}
