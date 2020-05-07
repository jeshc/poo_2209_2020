/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui; //Graphic User Interface

import ico.fes.poo.gui.eventos.EventosVentana;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;


/**
 *
 * @author jeshc
 */
public class Ventana extends Frame{
    private String titulo;
    private int alto;
    private int ancho;
    private Button boton1;
    private Button boton2;
    
    

    public Ventana() throws HeadlessException {
    }

    public Ventana(String titulo, int alto, int ancho) throws HeadlessException {
        super(titulo);
        this.titulo = titulo;
        this.alto = alto;
        this.ancho = ancho;
        this.setSize(alto, ancho);
        boton1 = new Button("Presioname 1");
        boton2 = new Button("Presioname 2");
        this.setLayout(new FlowLayout(FlowLayout.RIGHT));
        this.add(boton1);
        this.add(boton2);
        this.addWindowListener(new EventosVentana());
        
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    
    
    
    
}
