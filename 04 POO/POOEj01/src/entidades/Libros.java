/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author pilo
 */
public class Libros {
    private String autor;
    private String titulo;
    private int numPag;
    private int ISBN;

    public Libros() {
    }

    public Libros(String autor, String titulo, int numPag, int ISBN) {
        this.autor = autor;
        this.titulo = titulo;
        this.numPag = numPag;
        this.ISBN = ISBN;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumPag() {
        return numPag;
    }

    public int getISBN() {
        return ISBN;
    }
    
    
}
