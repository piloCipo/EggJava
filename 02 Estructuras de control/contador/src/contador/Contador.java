/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador;

/**
 *
 * @author pilo
 */
public class Contador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++)    {
                    String I = Integer.toString(i);
                    String J = Integer.toString(j);
                    String K = Integer.toString(k);
                    if (K.equals("3")) {
                        K = "E";
                    }
                    if (J.equals("3")) {
                        J = "E";
                    }
                    if (I.equals("3")) {
                        I = "E";    
                    }
                    System.out.println(" " + I + " " + J + " " + K + " ");
                }         
            }
        }
    }
}