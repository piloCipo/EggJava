/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dispositivocadenas;
import java.util.Scanner;
/**
 *
 * @author pilo
 */
public class DispositivoCadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        String clave = "&&&&&";
        String palabra = "";
        String X = "X";
        String O = "O";
        String primerLetra;
        String ultimaLetra;     
        int correctas = 0;
        int incorrectas = 0;
        while (clave != palabra) { 
            System.out.println("ingrese palabras maximo 5 letras: ");
            System.out.println("para salir del programa escriba &&&&&!!");
            palabra = leer.nextLine();
            primerLetra = palabra.substring(0,1);
            ultimaLetra = palabra.substring(palabra.length()-1);
            if (palabra.length()<=5 && primerLetra.equals(X) && ultimaLetra.equals(O)) {
            correctas++;
            } else if (palabra.equals(clave)) {
                break;
            }
            else {
            incorrectas++;
            }
        }
        System.out.println("palabras correctas: " + correctas);
        System.out.println("palabras incorrectas: " + incorrectas);
    }
}
            
             
                
            
       
  
