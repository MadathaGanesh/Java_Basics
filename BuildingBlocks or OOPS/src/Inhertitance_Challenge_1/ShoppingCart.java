package Inhertitance_Challenge_1;

/*
Create another class ShoppingCart that will extend ShoppingList,
there will be a method price in ShoppingCart, which will calculate the price of the shopping item.
 */

public class ShoppingCart extends ShoppingList{
    public static double price( String item_name){
        double price = 0;
        if (item_name=="Fruits"){
            price=40;
        } else if (item_name=="Vegetables") {
            price=30.50;
        }else if (item_name=="Mobiles"){
            price=12000.0;
        } else if (item_name=="Laptops") {
            price=70000.400;
        }
        return price;
    }

}
