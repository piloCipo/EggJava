/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;
import java.util.Scanner;
/**
 *
 * @author pilo
 */
public class Televisor extends Electrodomesticos{

    private int resolucion;
    private boolean sintonizadorTDT;

    public Televisor(int resolucion, boolean sintonizadorTDT) {
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor(int resolucion, boolean sintonizadorTDT, double precio, String color, char consumo, int peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    public void crearTelevisor() { 
        crearElectrodomestico();
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la resolucion en pulgadas");
        resolucion = leer.nextInt();
        leer.nextLine();
        System.out.println("ingrese si posee sintonizador TDT (s/n)");
        String TDT = leer.nextLine();
        if (TDT.equalsIgnoreCase("s")) {
            sintonizadorTDT = true;
        } else {
            sintonizadorTDT = false;
        }
    }
    
    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if (resolucion > 40) {
            precioFinal += precioFinal * 0.3;
        }
        if (sintonizadorTDT) {
            precioFinal += 500;
        }
        return precioFinal;
    }
    
}
