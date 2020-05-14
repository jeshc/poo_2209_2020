/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fez.poo.gui;

import javax.swing.JButton;

/**
 *
 * @author jeshc
 */
public class BotonBuscaMInas extends JButton{
    private boolean mina;

    public BotonBuscaMInas() {
    }

    public BotonBuscaMInas(boolean mina) {
        this.mina = mina;
    }

    public boolean isMina() {
        return mina;
    }

    public void setMina(boolean mina) {
        this.mina = mina;
    }
    
    
}
