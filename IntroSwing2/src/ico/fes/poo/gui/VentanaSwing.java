/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui;

import ico.fes.poo.model.ModeloCombo;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author jeshc
 */
public class VentanaSwing extends JFrame{
    private JLabel etiqueta;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JTextArea area;
    private JButton boton5;
    private JComboBox combo;
    
    public VentanaSwing() throws HeadlessException {
        super("Muestrario de componentes Swing");
        super.setSize(600, 600);
        super.getContentPane().setLayout(new FlowLayout());
        etiqueta= new JLabel("Hola swing");
        boton1=new JButton("Show Message");
        boton2=new JButton("Show Input");
        boton3=new JButton("Show Confirm");
        boton4=new JButton("Abrir archivo");
        area=new JTextArea(4, 15);
        boton5=new JButton("Cargar datos");
        combo = new JComboBox();
        
        etiqueta.setForeground(new Color(255, 0, 255));
        super.getContentPane().add(etiqueta);
        super.getContentPane().add(boton1);
        super.getContentPane().add(boton2);
        super.getContentPane().add(boton3);
        super.getContentPane().add(boton4);
        super.getContentPane().add(area);
        super.getContentPane().add(boton5);
        super.getContentPane().add(combo);
        
        boton5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ArrayList<String> frutas=new ArrayList();
                frutas.add("Piña");
                frutas.add("Sandia");
                frutas.add("Naranja");
                frutas.add("Melón");
                frutas.add("Kiwi");
                frutas.add("Aguacate");
                ModeloCombo model=new ModeloCombo(frutas, "");
                combo.setModel(model);
                
            }
            
        });
        
        boton4.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e) {
                JFileChooser jfc=new JFileChooser();
                jfc.showOpenDialog(null);
                File arch=jfc.getSelectedFile();
                System.out.println("Ruta:"+ arch.getAbsolutePath());
                try {
                    FileReader fr = new FileReader(arch);
                    BufferedReader bf= new BufferedReader(fr);
                    String linea="";
                    do{
                        linea=bf.readLine();
                        if(linea != null)
                            area.setText(area.getText()+linea+"\n");
                        
                    }while( linea != null);
                    
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                } catch(IOException ioe){
                    ioe.printStackTrace();
                }
                
            }
            
        });
        
        
        boton3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int respuesta = JOptionPane.showConfirmDialog(
                        null, 
                        "¿Le vas al américa?",
                        "Pregunta del millon",
                        JOptionPane.YES_NO_OPTION
                        );
                System.out.println("Elegiste:"+respuesta);
                if(respuesta == JOptionPane.CANCEL_OPTION){
                    System.out.println("Cancelaste");
                }
                if(respuesta == JOptionPane.YES_OPTION){
                    System.out.println("Puedes cambiarte de carrera");
                }
                if(respuesta == JOptionPane.NO_OPTION){
                    System.out.println("Muy bien");
                }
                
            }
              
        });
        
        boton2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String respuesta=JOptionPane.showInputDialog("Introduce tu nombre:");
                System.out.println("Escribiste:" + respuesta.toUpperCase() );
            }
            
        });
        
        boton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // JOPtionPane
                JOptionPane.showMessageDialog(null, 
                            "Este es un mensaje",
                            "Aviso importante",
                            JOptionPane.INFORMATION_MESSAGE
                            ,new ImageIcon(System.getProperty("user.dir")+"/src/hulk.png")
                            );
            }      
        });
       
        etiqueta.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clic en etiqueta");
                etiqueta.setText("");
                System.out.println( System.getProperty("user.dir"));
                ImageIcon icon= new ImageIcon(
                        System.getProperty("user.dir")+"/src/hulk.png");
                etiqueta.setIcon(icon);
            }
            
        });
        
        super.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
            
        });
        
    }
    
    
}
