/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author pilo
 */
public class ServicioPais {
    Set<String> paises = new HashSet<>();
    Scanner leer = new Scanner(System.in);
    int paisesAntes;
    int paisesDespues;
    public void añadirPais(){
        String opcion;
        do {            
            System.out.println("ingrese un pais");
            paises.add(leer.nextLine());
            System.out.println("desea ingresar otro pais? s/n");
            opcion = leer.nextLine();
        } while (opcion.equalsIgnoreCase("s"));
        paisesAntes = paises.size();
        System.out.println("paises ingresados: ");
        for (String pais : paises) {
            System.out.println(pais);
        }
    }
    
    public void eliminarPais(){
        Iterator iterador = paises.iterator();
        System.out.println("ingrese el pais que desea eliminar de la lista");
        String eliminar = leer.nextLine();
        while (iterador.hasNext()) {            
            if (iterador.next().equals(eliminar)) {
                iterador.remove();
            }
        }
        paisesDespues = paises.size();
        if (paisesAntes == paisesDespues) {
            System.out.println(eliminar + "no se encuentra en la lista, no se ha eliminado ningun pais");
        }else{
            System.out.println("se ha eliminado " + eliminar + " la nueva lista es: ");
            for (String pais : paises) {
            System.out.println(pais);
        }
        }
    }
    
    public void ordenados(){
        List<String> paisesOrdenados = new ArrayList<>(paises);
            Collections.sort(paisesOrdenados);
            System.out.println("Paises ordenados alfabéticamente: ");
            for (String pais : paisesOrdenados) {
                System.out.println(pais);
            }
}
}
    