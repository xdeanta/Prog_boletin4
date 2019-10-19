/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_3;

/**
 *
 * @author xavier
 */
public class Circulo {
    private double radio;
    private final double PI;
    public Circulo(){
        PI=Math.PI;
        radio=0;
    }
    public Circulo(double radio){
        this.radio=radio;
        PI=Math.PI;
    }
    public void setRadio(double radio){
        this.radio=radio;
    }
    public double getRadio(){
        return radio;
    }
    public double calcularArea(){
        return PI*Math.pow(radio,2);
    }
    public double calcularLongitud(){
        return 2*PI*radio;
    }
}
