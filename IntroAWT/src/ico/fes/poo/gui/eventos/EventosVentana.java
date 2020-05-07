/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui.eventos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author jeshc
 */
public class EventosVentana implements WindowListener{

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Evento opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Evento Closing");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Evento Closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Evento Iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("evento De iconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Evento Activted");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Evento DeActivated");
    }
    
}
