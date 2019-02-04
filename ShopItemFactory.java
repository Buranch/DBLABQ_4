/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package idea;

/**
 *
 * @author Biruk
 */
public class ShopItemFactory {
    
    
    public ShopItem getShopItem(String shapeType, String name, float price, int soldOut){
      if(shapeType == null){
         return null;
      }		
      if(shapeType.equalsIgnoreCase("FOOD")){
         return new FoodItem(name, price, soldOut);
         
      } else if(shapeType.equalsIgnoreCase("DRINK")){
         return new DrinkItem(name, price, soldOut);
      }
      return null;
   }
}
