/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05colecciones;
import Servicios.ServicioPais;
/**
 *
 * @author pilo
 */
public class Ejercicio05Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioPais paises = new ServicioPais();
        paises.añadirPais();
        paises.ordenados();
        paises.eliminarPais();
    }
    
}
