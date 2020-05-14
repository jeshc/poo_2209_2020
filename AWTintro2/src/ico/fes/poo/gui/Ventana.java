/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui;

import ico.fes.poo.gui.eventos.EventosRaton;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author jeshc
 */
public class Ventana extends Frame {

    private TextField entrada;
    private Button boton;
    private Label etiqueta;
    
    public Ventana() throws HeadlessException {
        super.setSize(300, 300);
        super.setTitle("Repaso AWT y Eventos");
        super.setLayout(new FlowLayout());
        entrada = new TextField(15);
        boton = new Button("Saludame!!!");
        etiqueta = new Label("sin nada que mostrar");
        super.add(entrada);
        super.add(boton);
        super.add(etiqueta);
        boton.addMouseListener(new EventosRaton());
        
        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
//                String nombre = entrada.getText();
//                etiqueta.setText("Hola " + nombre + "!");
               etiqueta.setText("Hola "+ entrada.getText()+ "!!");
                System.out.println("X="+e.getX());
                System.out.println("Y="+e.getY());
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Entro al boton");
            }

            
            
            
            
            
            
        });
        super.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
            
        });
        
        entrada.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
              System.out.println("Tecla:"+e.getKeyChar());
            }
            
        });
        
    }
    
}
