/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author pilo
 */
public class Gato extends Animal{
    
    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    @Override
        public void alimentarse() {
            System.out.println("el gato " + getNombre() + ", de raza " + getRaza() + " y edad " + getEdad() + " años, "  + " se alimenta de " + getAlimento());
        }
}
