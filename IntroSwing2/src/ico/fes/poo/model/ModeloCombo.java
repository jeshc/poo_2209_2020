/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.model;

import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author jeshc
 */
public class ModeloCombo implements ComboBoxModel<String>{
    private ArrayList<String> data;
    private String seleccionado;

    public ModeloCombo() {
    }

    public ModeloCombo(ArrayList<String> data, String seleccionado) {
        this.data = data;
        this.seleccionado = seleccionado;
    }
    
    
    @Override
    public void setSelectedItem(Object anItem) {
        seleccionado=(String)anItem;
        //data.add("Mamey");
    }

    @Override
    public Object getSelectedItem() {
      return seleccionado;
    }

    @Override
    public int getSize() {
      return data.size();
    }

    @Override
    public String getElementAt(int index) {
        return data.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
    
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
    
    }
    
}
