/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_3;

import java.util.Scanner;

/**
 *
 * @author xavier
 */
public class Boletin4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc;
        Circulo cir, cir2;
        sc=new Scanner(System.in);
        cir=new Circulo();
        System.out.println("Introduzca el radio del circulo 2:");
        cir2=new Circulo(sc.nextDouble());
        System.out.println("Area del circulo 1: " + cir.calcularArea() + "\n Longitud: " + cir.calcularLongitud());
        System.out.println("Area del circulo 2: " + cir2.calcularArea() + "\n Longitud: " + cir2.calcularLongitud());
    }
    
}
