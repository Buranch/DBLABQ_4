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
public class DisplayObserver extends Observer{
    
   ItemSubject subject;
   
   public DisplayObserver(ItemSubject subject){
      this.subject = subject;
      this.subject.attach(this);
   }

   @Override
   public void update() {
//      System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) ); 
        System.out.println("Populating Labels with new Item change"+subject.getState().getName());
        ShopStateSingleton shopState = ShopStateSingleton.getInstance();
        this.subject.getRevenueLabel().setText(""+shopState.getTotalRevenue());
        this.subject.getNoDrinkLabel().setText(""+shopState.getNoDrinkSales());
        this.subject.getNoFoodLabel().setText(""+shopState.getNoFoodSales());
   }
    
    
}
