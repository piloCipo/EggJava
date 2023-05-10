/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooclassserviceej02;
import Entidades.Cafetera;
import Servicios.CafeteraServicio;
import java.util.Scanner;
/**
 *
 * @author pilo
 */
public class POOClassServiceEj02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cafetera cafetera = new Cafetera(2000, 0);
        CafeteraServicio servicio = new CafeteraServicio();
        int opcion = 0;
        while (opcion != 5) {
            System.out.println("MENU PRINCIPAL");
            System.out.println("1 - llenar cafetera");
            System.out.println("2 - servir taza");
            System.out.println("3 - vaciar cafetera");
            System.out.println("4 - agregar cafe");
            System.out.println("5 - salir");
            System.out.println("ingrese una opcion:");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("ingrese la cantidad de cafe par llenar la cafetera");
                    int cantidadLlenado = leer.nextInt();
                    if (cantidadLlenado > cafetera.getCapacidadMaxima()) {
                        System.out.println("la cantidad supera el maxima permitido");
                    } else {
                        servicio.llenarCafetera(cafetera, cantidadLlenado);
                        System.out.println("la cafetera contiene " + cafetera.getCantidadActual() + " ml de cafe.");
                        break;
                    }
                case 2:
                    System.out.println("ingrese el tamano de la taza ");
                    int tamanoTaza = leer.nextInt();
                    servicio.servirTaza(cafetera, tamanoTaza);
                    break;
                case 3:
                    servicio.vaciarCafetera(cafetera);
                    System.out.println("cafetera vaciada");
                    break;
                case 4:
                    System.out.println("ingrese cantidad de cafe a agregar");
                    int cantidadCafe = leer.nextInt();
                    servicio.agregarCafe(cafetera, cantidadCafe);
                    System.out.println("cafe agregado a la cafetera");
                    break;
                case 5:
                    System.out.println("saliendo");
                    break;
                default:
                    System.out.println("opcion invalidad, intente de nuevo");
            }
            System.out.println();
        }
    }
    
}
