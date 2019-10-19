/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4;

import java.util.Scanner;

/**
 *
 * @author xavier
 */
public class Boletin4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc;
        Coche vw;
        int valor;
        sc=new Scanner(System.in);
        vw=new Coche();
        System.out.println("Velocidad actual: " + vw.getVelocidad() + " Km/h");
        System.out.println("Introduzca valor para acelerar:");
        valor=sc.nextInt();
        vw.acelerar(valor);
        System.out.println("Velocidad actual: " + vw.getVelocidad() + " Km/h");
        System.out.println("Introduzca valor para frenar:");
        valor=sc.nextInt();
        vw.frenar(valor);
        System.out.println("Velocidad actual: " + vw.getVelocidad() + " Km/h");
    }
    
}
