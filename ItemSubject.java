/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package idea;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author Biruk
 */
public class ItemSubject {
   private List<Observer> observers = new ArrayList<Observer>();
   private ShopItem state;

   private JTable jTable;
   
   private JLabel labelTotalRevenue;
   private JLabel labelNoDrink;
   private JLabel labelNoFood;

   
   public ItemSubject(JTable jTable, JLabel labelTotalRevenue, JLabel labelNoDrink, JLabel labelNoFood ){
       this.jTable = jTable;
       this.labelTotalRevenue = labelTotalRevenue;
       this.labelNoDrink = labelNoDrink;
       this.labelNoFood = labelNoFood;
   }
   
   
   public JLabel getRevenueLabel(){
       return this.labelTotalRevenue;
   }
   
   public JLabel getNoDrinkLabel(){
       return this.labelNoDrink;
   }
   
   public JLabel getNoFoodLabel(){
       return this.labelNoFood;
   }
   
   
   public JTable getTable(){
       return this.jTable;
   }
   public ShopItem getState() {
      return state;
   }

   public void setState(ShopItem state) {
      this.state = state;
      notifyAllObservers();
   }

   public void attach(Observer observer){
      observers.add(observer);		
   }

   public void notifyAllObservers(){
      for (Observer observer : observers) {
         observer.update();
      }
   } 	
}
