/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenta;

/**
 *
 * @author victo
 */
public class CuentaApp {

    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Pepe", "78109", 7.0, 1000);

        Cuenta c2 = new Cuenta();

        c2.setNdelcliente("Santi");
        c2.setNdecuenta("65031");
        c2.setInteres(7);
        c2.setSaldo(7000);

        /*Realizar un ingreso en c2
     realizar extraccion en c2
     realizar un extraccion c1
     realizar una transferencia de c1 a c2
         */
 
        c1.ingreso(2000);
     
        System.out.println("El saldo de c1 es: " + c1.getSaldo());
         
        c2.ingreso(3000);

        System.out.println("El saldo de c2 es: " + c2.getSaldo());

        c2.extraccion(1500);

        System.out.println("El saldo luego de c2 luego de la extraccion es: " + c2.getSaldo());
        System.out.println("Saldo c1: " + c1.getSaldo());
        System.out.println("Saldo c2: " + c2.getSaldo());

        c1.transferencia(c2, 500);
        System.out.println("Despues de la transferencia");

        System.out.println("Saldo c1: " + c1.getSaldo());
        System.out.println("Saldo c2: " + c2.getSaldo());

    }
}
