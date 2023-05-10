/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizmagica;
import java.util.Scanner;
/**
 *
 * @author pilo
 */
public class MatrizMagica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int filas[] = new int [3];
        int columnas[] = new int [3];
        int diagonales[] = new int[2];
        int matriz[][] = new int [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("ingrese un numero a la matriz ");
                matriz[i][j] = leer.nextInt();
                filas[i] = (matriz[i][0]+matriz[i][1]+matriz[i][2]);
            }
        }
        System.out.println(filas);
                
    }
}
