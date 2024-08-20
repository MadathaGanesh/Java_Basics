package ArrayList_ShoppingCart;

import java.util.ArrayList;

public class ShoppingCart {

   //  ArrayList <String> arrayname=new ArrayList<>();
    ArrayList <String> shoppingCart;

    public ShoppingCart() {
        shoppingCart = new ArrayList<String>();
    }

    public void PrintCart(){
         System.out.println("There are "+(shoppingCart.size()) + " items in the cart ");   // .size() method is used to get length / size of arrayList
         for (int i=0;i<shoppingCart.size();i++){
             System.out.println("Item no  "+ (i+1) + " is : "+ shoppingCart.get(i));   // .get() method is used to get the items from arrayList
         }
    }

    public void AddItem(String item){
        shoppingCart.add(item);   // .add() method is used to add items in arraylist
    }
    public void modifyCart(int position,String newitem){
        shoppingCart.set(position,newitem);    // .set() method is used to update the new item .we have to index number and new element as there parameters
        System.out.println("Item number "+(position+1)+ " is updated ");
        System.out.println("newly updated item is :: "+newitem);
    }
    public void removeitem(int position){
        String itemname=shoppingCart.get(position);
        shoppingCart.remove(itemname);     // .remove() method is used to remove an item

    }

    public String searchItem(String searchitem){
        int position=shoppingCart.indexOf(searchitem);  // .indexof() method is used to get the index of elements .
        if (position>0){
            return shoppingCart.get(position);
        }else
            return null;
    }

}
