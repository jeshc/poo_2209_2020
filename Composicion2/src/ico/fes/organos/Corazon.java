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
public class Corazon {
    private String tamanio;
    private String funcion;
    private int rpm;

    public Corazon() {
    }

    public Corazon(String tamanio, String funcion, int rpm) {
        this.tamanio = tamanio;
        this.funcion = funcion;
        this.rpm = rpm;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }
    
    public void contraer(){
        System.out.println("Contrayendo el corazon...");
    }
    public void expandir(){
        System.out.println("Expandiendo el corazón");
    }
}
