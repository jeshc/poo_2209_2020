/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion2;

import ico.fes.organos.Cerebro;
import ico.fes.organos.Corazon;
import ico.fes.organos.Estomago;
import ico.fes.organos.Pulmon;

/**
 *
 * @author LABCOM2
 */
public class CuerpoHumano {
    private float altura;
    private float peso;
    private String colorPiel;
    private Pulmon pulmonDerecho;
    private Pulmon pulmonIzquierdo;
    private Corazon corazon;
    private Estomago estomago;
    private Cerebro cerebro;

    public CuerpoHumano() {
    }

    public CuerpoHumano(float altura, float peso, String colorPiel, Pulmon pulmonDerecho
            , Pulmon pulmonIzquierdo, Corazon corazon, Estomago estomago,
            Cerebro cerebro) {
        this.altura = altura;
        this.peso = peso;
        this.colorPiel = colorPiel;
        this.pulmonDerecho = pulmonDerecho;
        this.pulmonIzquierdo = pulmonIzquierdo;
        this.corazon = corazon;
        this.estomago = estomago;
        this.cerebro = cerebro;
    }

    public Cerebro getCerebro() {
        return cerebro;
    }

    public void setCerebro(Cerebro cerebro) {
        this.cerebro = cerebro;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public Pulmon getPulmonDerecho() {
        return pulmonDerecho;
    }

    public void setPulmonDerecho(Pulmon pulmonDerecho) {
        this.pulmonDerecho = pulmonDerecho;
    }

    public Pulmon getPulmonIzquierdo() {
        return pulmonIzquierdo;
    }

    public void setPulmonIzquierdo(Pulmon pulmonIzquierdo) {
        this.pulmonIzquierdo = pulmonIzquierdo;
    }

    public Corazon getCorazon() {
        return corazon;
    }

    public void setCorazon(Corazon corazon) {
        this.corazon = corazon;
    }

    public Estomago getEstomago() {
        return estomago;
    }

    public void setEstomago(Estomago estomago) {
        this.estomago = estomago;
    }
    
    public void vivir(){
        System.out.println("Vivir es increible.... GNP!!!");
    }

    @Override
    public String toString() {
        String res = "";
        res = res +" Altura:"+this.altura + "Mts.";
        res = res +"\n Peso:"+this.peso+" Kg.";
        res = res + "\n Color de piel:"+this.colorPiel;
        res = res +"\nPulmon Der.:" +pulmonDerecho.toString();
        res = res +"\nPulmon Izq.:" +pulmonIzquierdo.toString();
        res = res +"\n Estomago:"+estomago.toString();
        return res;
    }
    
    
}
