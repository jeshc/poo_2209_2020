/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author jeshc
 */
public class VentanaUno extends JFrame {

    private JTextField txtNombre;
    private JButton btnBoton1;

    public VentanaUno() throws HeadlessException {

        this.setTitle("Hola desde la cuarentena");
        this.setSize(600, 400);

        this.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Cerrando ventana");
                System.exit(0);
            }
        });

        this.getContentPane().setLayout(new FlowLayout());
        txtNombre = new JTextField();
        txtNombre.setColumns(15);
        btnBoton1 = new JButton("Presioname!!");


        btnBoton1.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e) {
                String nombre = txtNombre.getText();
                JOptionPane.showMessageDialog(null, "Hola "+nombre);
            }
            
        });

        this.getContentPane().add(txtNombre);
        this.getContentPane().add(btnBoton1);
        this.setVisible(true);
    }

}
