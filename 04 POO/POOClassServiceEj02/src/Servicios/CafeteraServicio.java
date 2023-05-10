/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import Entidades.Cafetera;
import java.util.Scanner;
/**
 *
 * @author pilo
 */
public class CafeteraServicio {
    Scanner leer = new Scanner(System.in);
    
    public void llenarCafetera(Cafetera cafetera, int cantidadLlenado){
        int capacidadMaxima = cafetera.getCapacidadMaxima();
        int cantidadActual = cafetera.getCantidadActual();
        if (cantidadLlenado > capacidadMaxima) {
            System.out.println("la cantidad sobrepasa el maximo de la cafetera");
            return;
        }    
        if ((cantidadLlenado + cantidadActual) > capacidadMaxima) {
            System.out.println("la cantidad sobrepasa el maximo de la cafetera");
            return;
        }    
        cafetera.setCantidadActual(cantidadActual + cantidadLlenado);
    }
    public void servirTaza(Cafetera cafetera, int tamanoTaza){
        if (cafetera.getCantidadActual() >= tamanoTaza) {
            cafetera.setCantidadActual(cafetera.getCantidadActual() - tamanoTaza);
            System.out.println("se ha servido la taza de" + tamanoTaza + " ml");
        } else {
            System.out.println("no se completo el llenado de la taza, se ha servido " + cafetera.getCantidadActual() + " ml");
            cafetera.setCantidadActual(0);
        }
    }
    public void vaciarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(0);
    }
    public void agregarCafe(Cafetera cafetera, int cantidadCafe){
        System.out.println("ingrese la cantidad de cafe a agregar ");
        int cantidad = leer.nextInt();
        if (cafetera.getCantidadActual() + cantidad <= cafetera.getCapacidadMaxima()) {
            cafetera.setCantidadActual(cafetera.getCantidadActual() + cantidad);
            System.out.println("se han agregado " + cantidad + " ml de cafe.");
        } else {
            int cantidadMaxima = cafetera.getCapacidadMaxima() - cafetera.getCantidadActual();
            cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
            System.out.println("se ha llenado la cafetera con " + cantidadMaxima + " ml, no se pudo agregar " + (cantidad - cantidadMaxima) + " ml de cafe.");
        }       
    }
}
