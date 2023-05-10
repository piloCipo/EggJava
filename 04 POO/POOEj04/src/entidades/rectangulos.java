/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;
import java.util.Scanner;
/**
 *
 * @author pilo
 */
public class rectangulos {
    private int base;
    private int altura;

    public rectangulos(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public rectangulos() {
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void datos() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la base y la altura del rectangulo");
        System.out.println("base: ");
        this.base = leer.nextInt();
        System.out.println("altura: ");
        this.altura = leer.nextInt();
    }
    
    public double superficie() {
        return this.altura * this.base;
    }
    
    public double perimetro() {
        return 2 * (this.altura + this.base);
    }
            
    public void figura () {
        for (int i = 0; i < this.base; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < this.altura-2; i++) {
            System.out.print("*");
        for (int j = 0; j < this.base-2; j++) {
            System.out.print(" ");
        }
            System.out.println("*");
        }
        for (int i = 0; i < this.base; i++) {
            System.out.print("*");
        }
    }
}
