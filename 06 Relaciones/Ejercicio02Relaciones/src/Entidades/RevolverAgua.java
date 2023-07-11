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
public class RevolverAgua {
    private int posicionActual;
    private int posicionAgua;
    
    public void llenarRevolver(){
        Random random = new Random();
        posicionActual = random.nextInt(6) + 1;
        posicionAgua = random.nextInt(6) + 1;
    }
    
    public boolean mojar(){
        return (posicionActual == posicionAgua);
    }
    
    public void siguienteChorro(){
        if (posicionActual == 6) {
            posicionActual = 1;
        } else {
              posicionActual++;
          }
    }
    
    public String toString(){
        return "posicion actual: " + posicionActual + ", posicion del agua: " + posicionAgua;
    }
}
