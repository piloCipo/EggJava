/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambiodevariable;
import java.util.Scanner;
/**
 *
 * @author pilo
 */
public class CambioDeVariable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int A,B,C,D,aux;
        System.out.println("ingrese valores a las variables: ");
        System.out.println("A: ");
        A = leer.nextInt();
        System.out.println("B: ");
        B = leer.nextInt();
        System.out.println("C: ");
        C = leer.nextInt();
        System.out.println("D: ");
        D = leer.nextInt();
        System.out.println("valores iniciales: A = " + A + ", B = " + B + ", C = " + C + ", D = " + D);
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println("valores finales: A = " + A + ", B = " + B + ", C = " + C + ", D = " + D);

        
        
    }
    
}
