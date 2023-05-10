/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enteroaromano;
import java.util.Scanner;
/**
 *
 * @author pilo
 */
public class EnteroARomano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero entre 1 y 10: ");
        int numero = leer.nextInt();
        switch (numero){
            case 1: System.out.println("el numero romano es I");break;
            case 2: System.out.println("el numero romano es II");break;
            case 3: System.out.println("el numero romano es III");break;
            case 4: System.out.println("el numero romano es IV");break;
            case 5: System.out.println("el numero romano es V");break;
            case 6: System.out.println("el numero romano es VI");break;
            case 7: System.out.println("el numero romano es VII");break;
            case 8: System.out.println("el numero romano es VIII");break;
            case 9: System.out.println("el numero romano es IX");break;
            case 10: System.out.println("el numero romano es X");break;
            default: System.out.println("ingrese un numero correcto");break;
        }
              
    }
    
}
