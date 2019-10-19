/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_2;

/**
 *
 * @author xavier
 */
public class Boletin4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Satelite sat, sat2;
        sat=new Satelite();
        sat2=new Satelite(24.532,11.99432, -5.53302);
        sat.verPosicion();
        sat2.verPosicion();
    }
    
}
