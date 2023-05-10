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
public class Operacion {
    private double num1;
    private double num2;

    public Operacion(double num1, double num2) {
        this.num1 = 0;
        this.num2 = 0;
    }

    public Operacion() {
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese los dos numeros: ");
        this.num1 = leer.nextInt();
        this.num2 = leer.nextInt();
    }
    public double sumar() {
        return this.num1+this.num2;
    }
    public double restar() {
        return this.num1-this.num2;
    }
    public double multiplicar() {
        if (this.num1 == 0 || this.num2 == 0) {
            System.out.println("ERROR");
            return 0;
        } else {
        return this.num1*this.num2;
        }
    }    
    public double dividir() {
        if (this.num2 == 0) {
            System.out.println("ERROR");
            return 0;
        } else {
            return this.num1 / this.num2;
        }
    }    
}
