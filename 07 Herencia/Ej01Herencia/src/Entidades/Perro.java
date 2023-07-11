/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author pilo
 */
public class Perro extends Animal{
    
    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    @Override
        public void alimentarse(){
            System.out.println("el perro " + getNombre() + ", de raza " + getRaza() + " y edad " + getEdad() + " años, " + " se alimenta de " + getAlimento());
        }
    
}
