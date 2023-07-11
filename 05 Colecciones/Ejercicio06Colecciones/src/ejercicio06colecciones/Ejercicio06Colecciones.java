/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06colecciones;
import java.util.Scanner;
import Servicios.ServicioTienda;
/**
 *
 * @author pilo
 */
public class Ejercicio06Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioTienda tienda = new ServicioTienda();
        Scanner leer = new Scanner(System.in);
        int opcion;
        do {            
            System.out.println("------MENU------ ");
            System.out.println("1: introducir producto");
            System.out.println("2: modificar precio");
            System.out.println("3: eliminar producto");
            System.out.println("4: mostrar productos y precios");
            System.out.println("5: salir");
            System.out.println("ingrese una opcion:");
            opcion = leer.nextInt();
        
            switch (opcion) {
                case 1:
                    tienda.introducirElemento();
                    break;
                case 2:
                    tienda.modificarPrecio();
                    break;
                case 3:
                    tienda.eliminarProducto();
                    break;
                case 4:
                    tienda.mostrarProductos();
                    break;
                case 5:
                    System.out.println("--Hasta luego--");
                    break;
                default:
                    System.out.println("ingrese una opcion valida");
            }
            System.out.println();
        } while (opcion != 5);
    }
    
}
/*Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.*/