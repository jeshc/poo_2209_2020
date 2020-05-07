/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.clases.abstractas;

import javax.swing.JOptionPane;

/**
 *
 * @author jeshc
 */
public class Pruebas {
    

    public static void main(String[] args) {
        Guitarra g = new Guitarra(6, 1967, "Gibson");
        
        System.out.println(g.getAnioConstruccion());
        g.afinar();
        g.tocar();
        JOptionPane.showMessageDialog(null, "Hola");
    }
}
