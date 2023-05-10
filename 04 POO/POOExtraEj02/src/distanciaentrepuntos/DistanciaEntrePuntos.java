/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distanciaentrepuntos;
import entidades.Distancia;
/**
 *
 * @author pilo
 */
public class DistanciaEntrePuntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Distancia distanciaPuntos = new Distancia();
        distanciaPuntos.crearPuntos();
        double distancia = distanciaPuntos.distancia();
        System.out.println("la distancia entre ambos puntos es: " + distancia);
    }
    
}
