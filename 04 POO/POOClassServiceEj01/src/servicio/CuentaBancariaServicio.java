/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;
import entidades.CuentaBancaria;
/**
 *
 * @author pilo
 */
public class CuentaBancariaServicio {
    public void crearCuenta (CuentaBancaria cuenta) {
    }
    public void ingresar (CuentaBancaria cuenta, double cantidad) {
        double saldoActual = cuenta.getSaldoActual();
        saldoActual += cantidad;
        cuenta.setSaldoActual(saldoActual);
    }
    public void retirar (CuentaBancaria cuenta, double cantidad) {
        double saldoActual = cuenta.getSaldoActual();
        if (cantidad <= saldoActual) {
            saldoActual -= cantidad;
            cuenta.setSaldoActual(saldoActual);
        } else {
            System.out.println("la cantidad excede al monto maximo " + saldoActual);
            System.out.println("retirando el maximo posible" + saldoActual);
            cuenta.setSaldoActual(0);
        }   
    }
    public void extraccionRapida (CuentaBancaria cuenta) {
        double saldoActual = cuenta.getSaldoActual();
        if (saldoActual == 0) {
            System.out.println("no tiene dinero en la cuenta");
        } else {
            double limite = saldoActual * 0.2;
            saldoActual -= limite;
            cuenta.setSaldoActual(saldoActual);
        }
    }
    public double consultarSaldo (CuentaBancaria cuenta) {
        return cuenta.getSaldoActual();
    }
    public void consultarDatos (CuentaBancaria cuenta) {
        System.out.println("numero de cliente: " +cuenta.getNumeroCliente());
        System.out.println("numero de DNI: " + cuenta.getDniCliente());
        System.out.println("saldo disponible: " + cuenta.getSaldoActual());
               
    }
}
