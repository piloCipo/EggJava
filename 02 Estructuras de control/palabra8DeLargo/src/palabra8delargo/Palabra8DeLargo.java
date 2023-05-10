/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabra8delargo;
import java.util.Scanner;
/**
 *
 * @author pilo
 */
public class Palabra8DeLargo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una palabra: ");
        String palabra = leer.nextLine();
        
        if (palabra.length()==8){
            System.out.println("CORRECTO!!");
        }else
            System.out.println("ICORRECTO!!");
    }
    
}
