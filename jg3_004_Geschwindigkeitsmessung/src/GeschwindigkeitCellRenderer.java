
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcs
 */
public class GeschwindigkeitCellRenderer implements TableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = new JLabel(value.toString());
//        Geschwindigkeitsmessung g = (Geschwindigkeitsmessung) value;
        switch(column){
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                Integer g = (Integer) value;
                label.setOpaque(true);
                if(g < -30){
                    label.setBackground(Color.red);
                }else if(g > -30 && g < -20){
                    label.setBackground(Color.orange);
                }else if(g > -20 && g < 0){
                    label.setBackground(Color.yellow);
                }else if(g >= 0){
                    label.setBackground(Color.green);
                }
                    break;
                
           
        }
        return label;
    }
    
}
