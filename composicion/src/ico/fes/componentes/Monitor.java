/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ico.fes.componentes;

/**
 * Fecha de creación: 18-feb-2020
 * @author jesushc
 */
public class Monitor {
    private int tamanio;
    private float resolucion;
    private float frecuencia;

    public Monitor(int tamanio, float resolucion, float frecuencia) {
        this.tamanio = tamanio;
        this.resolucion = resolucion;
        this.frecuencia = frecuencia;
    }

    public Monitor() {
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public float getResolucion() {
        return resolucion;
    }

    public void setResolucion(float resolucion) {
        this.resolucion = resolucion;
    }

    public float getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(float frecuencia) {
        this.frecuencia = frecuencia;
    }
    
    public void encender(){
        System.out.println("Encendiendo...");
    }
    public void apagar(){
        System.out.println("Apagando...");
    }
    
    
}
