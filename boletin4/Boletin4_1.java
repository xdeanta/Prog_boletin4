/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4;

import java.util.Scanner;

/**
 *
 * @author xdeantabelisario
 */
public class Boletin4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coche vw;
        int valor;
        Scanner sc;
        sc=new Scanner(System.in);
        vw=new Coche();
        System.out.println("Introduzca valor:");
        valor=sc.nextInt();
        vw.acelerar(valor);
        System.out.println("Velocidad Actual: " + vw.getVelocidad());
        System.out.println("Introduzca valor:");
        valor=sc.nextInt();
        vw.frenar(valor);
        System.out.println("Velocidad Actual: " + vw.getVelocidad());
    }
    
}
