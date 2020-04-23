/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2.instrumentos;

/**
 *
 * @author LABCOM2
 */
public interface Instrumento {
    public static final int GUITARRA = 1;
    public static final int PIANO = 2;
    public static final int FLAUTA = 3;
    
    public abstract boolean afinar();
    public String emitirSonido();
    public void limpiar();
   
}
