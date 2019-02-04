/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package idea;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Biruk
 */
public class ItemObserver extends Observer{
    
   ItemSubject subject;
   
   public ItemObserver(ItemSubject subject){
      this.subject = subject;
      this.subject.attach(this);
   }

   @Override
   public void update() {
//      System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) ); 
       System.out.println("Observed that item is added "+subject.getState().getName());
        DefaultTableModel model = (DefaultTableModel) this.subject.getTable().getModel();
        model.addRow(new Object[]{subject.getState().getName(), subject.getState().getPrice()});
        ShopStateSingleton shopState = ShopStateSingleton.getInstance();
        if(subject.getState().getItemType().equals("DRINK")){
                shopState.addDrinkSales();
        }else{
                shopState.addFoodSales();
        }
        shopState.addRevenue(subject.getState().getPrice());
   }
    
}
