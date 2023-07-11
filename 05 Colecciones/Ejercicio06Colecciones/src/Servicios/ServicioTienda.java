/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author pilo
 */
public class ServicioTienda {
    Scanner leer = new Scanner(System.in);
    Map<String, Double> inventario = new HashMap<>();
    
    public void introducirElemento(){
        System.out.println("ingrese un producto");
        String producto = leer.nextLine();
        System.out.println("ingrese el precio");
        double precio = leer.nextDouble();
        inventario.put(producto, precio);
        System.out.println("producto ingresado");
    }
    
    public void modificarPrecio(){
        if (inventario.isEmpty()) {
            System.out.println("el inventario esta vacio");
        }else{
            System.out.println("ingrese el producto que desea modificar");
            String producto = leer.nextLine();
            if (inventario.containsKey(producto)) {
                System.out.println("ingrese el nuevo precio");
                double precio = leer.nextDouble();
                inventario.put(producto, precio);
                System.out.println("precio modificado");
            }else{
             System.out.println("no se encuentra el producto");
            }
        }    
    }
    
    public void eliminarProducto(){
        if (inventario.isEmpty()) {
            System.out.println("------------------------");
            System.out.println("el inventario esta vacio");
            System.out.println("------------------------");
        }else{   
            System.out.println("ingrese el producto que desea eliminar");
            String producto = leer.nextLine();
            if (inventario.containsKey(producto)) {
                inventario.remove(producto);
                System.out.println("producto eliminado");
            }else{
                System.out.println("no se encuentra el producto");
            }
        }
    }
    
    public void mostrarProductos(){
        if (inventario.isEmpty()) {
            System.out.println("------------------------");
            System.out.println("el inventario esta vacio");
            System.out.println("------------------------");
        }else{
            System.out.println("--INVENTARIO--");
            for (Map.Entry<String, Double> entry : inventario.entrySet()) {
                String producto = entry.getKey();
                double precio = entry.getValue();
                System.out.println("-- producto: " + producto + " -- precio: $" + precio + " --");
            }
        }
    }
}
/*Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.*/