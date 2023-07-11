/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author pilo
 */
public class Pelicula {
    private String pelicula;
    private String director;
    private double duracion;

    public Pelicula(String pelicula, String director, double duracion) {
        this.pelicula = pelicula;
        this.director = director;
        this.duracion = duracion;
    }
    
    public Pelicula() {
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    @Override 
    public String toString(){
        return  pelicula;
    }

}
