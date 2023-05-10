/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej03;
import entidades.Operacion;
/**
 *
 * @author pilo
 */
public class POOEj03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operacion op = new Operacion();
        op.crearOperacion();
        
        double resultadoSuma = op.sumar();
        System.out.println("la suma es " + resultadoSuma);
        double resultadoResta = op.restar();
        System.out.println("la resta es " +resultadoResta);
        double resultadomult = op.multiplicar();
        if (resultadomult == 0) {
            System.out.println("no se puede multiplicar por 0");
        } else {
        System.out.println("la multiplicacion es " + resultadomult);
        }
        double resultadodiv = op.dividir();
        if (resultadodiv == 0) {
            System.out.println("no se puede dividir por 0");
        } else {
        System.out.println("la division es " + resultadodiv);        
        }
    }
    
}
