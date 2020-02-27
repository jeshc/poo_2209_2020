/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.organos;

/**
 *
 * @author LABCOM2
 */
public class Cerebro {
    private float peso;
    private String funcion;
    private String tamanio;

    public Cerebro() {
    }

    public Cerebro(float peso, String funcion, String tamanio) {
        this.peso = peso;
        this.funcion = funcion;
        this.tamanio = tamanio;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }
    
    
}
