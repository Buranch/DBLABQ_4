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
public class ShopStateSingleton {
    
    private int totalRevenue = 0;
    private int noDrinkSales = 0;
    private int noFoodSales = 0;
    
    private static final ShopStateSingleton instance = new ShopStateSingleton();
    
    private ShopStateSingleton(){
    }
    
    public static ShopStateSingleton getInstance(){
        return instance;
    }
    public void addDrinkSales(){
        this.noDrinkSales++;
    }
    public void addFoodSales(){
        this.noFoodSales++;
    }

    public void addRevenue(float num){
        totalRevenue += num;
    }
    
    public float getTotalRevenue(){
        return this.totalRevenue;
    }
    
    public int getNoFoodSales(){
        return this.noFoodSales;
    }
    
    public int getNoDrinkSales(){
        return this.noDrinkSales;
    }
}
