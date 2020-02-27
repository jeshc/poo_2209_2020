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
public class Pulmon {
    private float peso;
    private String funcion;
    private boolean saludable;

    public Pulmon() {
    }

    public Pulmon(float peso, String funcion, boolean saludable) {
        this.peso = peso;
        this.funcion = funcion;
        this.saludable = saludable;
    }

    public boolean isSaludable() {
        return saludable;
    }

    public void setSaludable(boolean saludable) {
        this.saludable = saludable;
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
    
    public void contraer(){
        System.out.println("Contrayendo el pulmón...");
    }
    
    public void expandir(){
        System.out.println("Expandiendo el pulmón....");
    }

    @Override
    public String toString() {
      String resultado= " Peso:"+this.peso+
                        " kgs.\n Función: "+this.funcion + 
                        "\n Esta saludable?:"+this.saludable;   
      
      
      
      return resultado;
    }
    
    
}
