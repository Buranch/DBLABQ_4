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
public class DrinkItem implements ShopItem {

    String name;
    float price;
    int soldOut;
    String type = "DRINK";
    
    public DrinkItem(String name, float price, int soldOut){
        this.name = name;
        this.price = price;
        this.soldOut = soldOut;
    }
    
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public ShopItem getItem() {
        return this;
    }

    @Override
    public float getPrice() {
        return this.price;
    }

    @Override
    public String getItemType() {
        return this.type;
    }

    @Override
    public int getSoldOut() {
        return this.soldOut;
    }
    
}
