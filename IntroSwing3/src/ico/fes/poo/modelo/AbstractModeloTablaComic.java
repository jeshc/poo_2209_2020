/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.modelo;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 * jkhkjds
 *
 * @author jeshc
 */
public class AbstractModeloTablaComic extends AbstractTableModel {

    private ArrayList<Comic> data;

    public AbstractModeloTablaComic() {
    }

    public AbstractModeloTablaComic(ArrayList<Comic> data) {
        this.data = data;
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String columnName = "";
        switch (columnIndex) {
            case 0:
                columnName = "# de comic";
                break;
            case 1:
                columnName = "Edición";
                break;
            case 2:
                columnName = "Universo";
                break;
            case 3:
                columnName = "Editorial";
                break;
            case 4:
                columnName = "Personaje";
                break;
            case 5:
                columnName = "Título";
                break;
            case 6:
                columnName = "$ Precio";
                break;

            default:
                columnName = "ND";
        }
        return columnName;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return Integer.class;
            case 1:
                return Integer.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
            case 6:
                return Float.class;
            default:
                return String.class;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Comic tmp = data.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return tmp.getNumeroComic();
            case 1:
                return tmp.getEdicion();
            case 2:
                return tmp.getUniverso();
            case 3:
                return tmp.getEditorial();
            case 4:
                return tmp.getPersonaje();
            case 5:
                return tmp.getTitulo();
            case 6:
                return tmp.getPrecio();
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Comic tmp = data.get(rowIndex);
        switch (columnIndex) {
            case 0:
                tmp.setNumeroComic((int) aValue);
                break;
            case 1:
                tmp.setEdicion((int) aValue);
                break;
            case 2:
                tmp.setUniverso((String) aValue);
                break;
            case 3:
                tmp.setEditorial((String) aValue);
                break;
            case 4:
                tmp.setPersonaje((String) aValue);
                break;
            case 5:
                tmp.setTitulo((String) aValue);
                break;
            case 6:
                tmp.setPrecio((float) aValue);
                break;
            default:
                throw new AssertionError();

        }
        data.set(rowIndex, tmp);
        this.fireTableCellUpdated(rowIndex, columnIndex);
    }
    
    public void agregarComic(Comic c){
        data.add(c);
        this.fireTableDataChanged();
    }
}
