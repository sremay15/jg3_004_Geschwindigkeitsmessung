
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcs
 */
public class GeschwindigkeitsTable extends AbstractTableModel{
    
    private static String [] colnames = {"Datum","Uhrzeit","Kennzeichen","V-Erlaubt","V-Gemessen","Übertretung"};
    private ArrayList<Geschwindigkeitsmessung> list = new ArrayList();
    
    public void add(Geschwindigkeitsmessung gesch){
        list.add(gesch);
        fireTableRowsInserted(0, 0);
    }
    
    public void delete(int index){
        list.remove(index);
        fireTableRowsUpdated(index, index);
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return colnames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Geschwindigkeitsmessung gesch = list.get(rowIndex);
        switch(columnIndex){
            case 0: return gesch.getDate();
            case 1: return gesch.getTime();
            case 2: return gesch.getKennzeichen();
            case 3: return gesch.getVgemessen();
            case 4: return gesch.getVerlaubt();
            case 5: return (gesch.getVerlaubt() - gesch.getVgemessen());
            default: return "???";
        }

       
    }
    
}
