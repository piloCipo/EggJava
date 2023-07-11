/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03relaciones;
import Entidades.Baraja;
import Entidades.Carta;
import java.util.List;
/**
 *
 * @author pilo
 */
public class Ejercicio03Relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        baraja.baraja();
        baraja.barajar();
        baraja.mostrarBaraja();
        
        System.out.println("cartas disponibles: " + baraja.cartasDisponibles());
        
        System.out.println("dar 5 cartas");
        List<Carta> mano = baraja.darCartas(5);
        if (mano != null) {
            for (Carta carta : mano) {
                System.out.println(carta);
            }
        }
        
        System.out.println("cartas disponibles: " + baraja.cartasDisponibles());
        
        baraja.cartasMonton();
        
        System.out.println("siguiente carta: " + baraja.siguienteCarta());
    }
    
}
