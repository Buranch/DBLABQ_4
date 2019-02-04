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
public interface ShopItem {
    public String getName();
    public ShopItem getItem();
    public float getPrice();
    public String getItemType();
    public int getSoldOut();
    
}
