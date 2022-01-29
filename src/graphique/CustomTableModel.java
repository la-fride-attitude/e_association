/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique;

import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Frida
 */
public class CustomTableModel extends AbstractTableModel{
    
    Vector<Vector> rows;
    Vector<String> headers;
    public CustomTableModel(Vector<String> h){
        rows = new Vector<Vector>();
        h = headers;
    }
    
    public String getColumnName(int column){
        return headers.get(column);
    }

    @Override
    public int getRowCount() {
        return rows.size();
    }

    @Override
    public int getColumnCount() {
        return headers.capacity();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         return rows.get(rowIndex).get(columnIndex);
    }
    
    public void setValue(Object o, int rowIndex, int columnIndex){
        rows.get(rowIndex).add(o);
    }
    
    
}
