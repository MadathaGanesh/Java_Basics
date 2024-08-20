package Inhertitance_Challenge_1;

/*
Create a class ShoppingList which will contain the list of all the items that are there to shop from.
 */
public class ShoppingList {
    public static String ItemsList(int item_code){
        String item_name=" ";
        switch (item_code){
            case 1:
                item_name="Fruits";
                System.out.println("Item name is :"+item_name);
                return item_name;
            case 2:
                item_name="Vegetables";
                System.out.println("Item name is : "+item_name);
                return item_name;
            case 3:
                item_name="Mobiles";
                System.out.println("Item name is : "+item_name);
                return item_name;
            case 4:
                item_name="Laptops";
                System.out.println("Item name is : "+item_name);
                return item_name;
            default:
                System.out.println("Please enter correct input");
        }
        return item_name;
    }
}
