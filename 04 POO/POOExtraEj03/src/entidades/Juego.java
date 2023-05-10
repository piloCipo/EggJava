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
public class Juego {
    private int numero;
    private int intentos;

    public Juego() {
    }

    public Juego(int numero, int intentos) {
        this.numero = numero;
        this.intentos = intentos;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void iniciar_juego () {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de intentos: ");
        this.intentos = leer.nextInt();
        System.out.println("ingrese el numero a adivinar: ");
        this.numero = leer.nextInt();
    }
    
    public void juego() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        int numeroIngresado = leer.nextInt();
        int cont = 1;
        if (numeroIngresado == this.numero) {
            System.out.println("adivinaste en el primer intento");
        } else {
        while (numeroIngresado != this.numero && cont < this.intentos ) { 
            if (numeroIngresado < this.numero) {
                System.out.println("no adivinaste, el numero es mayor al que ingresaste, intenta de nuevo");
                numeroIngresado = leer.nextInt();
                cont++;
            } else if (numeroIngresado > this.numero) {
                System.out.println("no adivinaste, el numero es menor al que ingresastet, intenta de nuevo");
                numeroIngresado = leer.nextInt();
                cont++;
            } 
            }    
            if (numeroIngresado != this.numero && cont == this.intentos){
                System.out.println("se le acabaron los intentos ");
            } else {
                System.out.println("a adivinado en el intento " + cont);
            }
        }
    }
}
