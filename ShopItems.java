/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package idea;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author Biruk
 */
public class ShopItems {

    Vector v;
    
    public ShopItems(){
        
        ShopItemFactory factory = new ShopItemFactory();
        
        v = new Vector();
        
        for(int i = 0; i< 5; i++){
            v.addElement(factory.getShopItem("FOOD", "Food "+i, 124*i, 7*i-2*i));
        }
        for(int i = 0; i< 5; i++){
            v.addElement(factory.getShopItem("DRINK", "Drink "+i, 24*i, 6*i-2*i));
        }
        
    }
    
    
    public Vector getShopItems(){
        return this.v;
    }
    
    public Enumeration elements() {
        return this.v.elements();
    }
 
    
}
