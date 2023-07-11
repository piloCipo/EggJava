/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej01herencia;
import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;
/**
 *
 * @author pilo
 */
public class Ej01Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perro1 = new Perro("moca", "carne", 1, "shih tzu");
        perro1.alimentarse();
        
        Animal perro2 = new Perro("kika", "dogui", 4, "callejera");
        perro2.alimentarse();
        
        Animal gato = new Gato("gary", "gati", 7, "panterita");
        gato.alimentarse();
        
        Animal caballo = new Caballo("mirlo", "pasto", 4, "semental");
        caballo.alimentarse();
    }
    
}
/*Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:*/