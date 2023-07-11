/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author pilo
 */
public class Baraja {
        private ArrayList<Carta> cartas;
        private ArrayList<Carta> monton;
      
    public void baraja(){
        cartas = new ArrayList<>();
        monton = new ArrayList<>();
        String[] palos = {"Espada", "Copa", "Basto", "Oro"};
        int [] numeros = {1,2,3,4,5,6,7,10,11,12};
        
        for (String palo : palos) {
            for (int numero : numeros) {
                Carta carta = new Carta(numero, palo);
                cartas.add(carta);
            }
        }  
    }
    
    public void barajar() {
        Collections.shuffle(cartas);
    }
    
    public Carta siguienteCarta() {
        if (cartas.isEmpty()) {
            System.out.println("no hay mas cartas en la baraja");
            return null;
        } else {
            Carta carta = cartas.remove(0);
            monton.add(carta);
            return carta;
        }
    }
    
    public int cartasDisponibles() {
        return cartas.size();
    }
    
    public List<Carta> darCartas(int cantidad) {
        if (cantidad > cartas.size()) {
            System.out.println("No hay esa cantidad de cartas en el maso");
            return null;
        }
        List<Carta> mano = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            Carta carta = siguienteCarta();
            mano.add(carta);
        }
        return mano;
    }
    
    public void cartasMonton() {
        if (monton.isEmpty()) {
            System.out.println("no hay cartas en el monton");
            return;
        } 
        for (Carta carta : monton) {
            System.out.println(carta);
        }
    }
    
    public void mostrarBaraja() {
        if (cartas.isEmpty()) {
            System.out.println("no quedan cartas para mostrar");
            return;
        }
        System.out.println("cartas en la baraja");
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }
}
