/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_4;

import java.util.Scanner;

/**
 *
 * @author xavier
 */
public class Boletin4_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta cta1, cta2;
        Scanner sc;
        cta1=new Cuenta();
        cta2=new Cuenta("Jose","ES73 9210", 0.05, 1592.56);
        sc=new Scanner(System.in);
        System.out.println("Introduzca el Nombre:");
        cta1.setNombre(sc.nextLine());
        System.out.println("Introduzca el numero de cuenta:");
        cta1.setNCuenta(sc.nextLine());
        System.out.println("Introduzca el saldo:");
        cta1.setSaldo(sc.nextDouble());
        cta1.setInteres(0.05);
        System.out.println("Introduzca el importe a transferir:");
        cta1.transferencia(cta2,sc.nextDouble());
        System.out.println("Transferencia realizada.\nSaldo:" + cta1.getSaldo());
        System.out.println("Saldo de segunda cuenta: " + cta2.getSaldo());
    }
    
}
