/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4;

/**
 *
 * @author xdeantabelisario
 */
public class Coche {
    private int velActual;
    
    public Coche(){
        velActual=0;
    }
    public int getVelocidad(){
        return velActual;
    }
    public void acelerar(int valor){
        velActual=velActual+valor;
    }
    public void frenar(int menos){
        velActual=velActual-menos;
    }
}
