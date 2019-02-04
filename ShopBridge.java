/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package idea;

import javax.swing.JTable;

/**
 *
 * @author Biruk
 */
public final class ShopBridge {
    
    JTable jTable;
    Object[][] data;
    String type;
    public ShopBridge(JTable jTable, Object[][] data, String type){
    
        this.jTable = jTable;
        this.data = data;
        this.type = type;
        drawTable();
    }

    public void drawTable() {
    
        if(type.equals("ADMIN")){
            jTable.setModel(new AdminCusModel(data));
        }else{
            jTable.setModel(new CustomerCusModel(data));
        }
    }
}
