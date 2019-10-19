/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_4;

/**
 *
 * @author xavier
 */
public class Cuenta {
    private String nombre;
    private String ncuenta;
    private double interes;
    private double saldo;
    public Cuenta(){
        nombre = ncuenta = null;
        interes = saldo = 0;
    }
    public Cuenta(String nombre, String ncuenta, double interes, double saldo){
        this.nombre=nombre;
        this.ncuenta=ncuenta;
        this.interes=interes;
        this.saldo=saldo;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setNCuenta(String ncuenta){
        this.ncuenta=ncuenta;
    }
    public void setInteres(double interes){
        this.interes=interes;
    }
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
    public String getNombre(){
        return nombre;
    }
    public String getNCuenta(){
        return ncuenta;
    }
    public double getInteres(){
        return interes;
    }
    public double getSaldo(){
        return saldo;
    }
    public void ingreso(double valor){
        saldo+=valor;
    }
    public void reintegro(double valor){
        if(valor>0){
            saldo-=valor;
        }
    }
    public void transferencia(Cuenta des,double importe){
        reintegro(importe);
        des.ingreso(importe);
        
    }
}
