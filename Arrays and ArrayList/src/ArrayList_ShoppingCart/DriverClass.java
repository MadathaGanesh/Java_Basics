package ArrayList_ShoppingCart;

import java.util.Scanner;

public class DriverClass {

    private static Scanner sc=new Scanner(System.in);  // Scanner class
    public static ShoppingCart shopcart=new ShoppingCart();  // Creating an object for ShoppingCart class

    public static void main(String[] args) {
        boolean exit=false;
        int userchoice=0;
        printInstructions();
        while (!exit){
            System.out.println("Enter your choice :: ");
            userchoice=sc.nextInt();
            sc.nextLine();
            switch (userchoice){
                case 0:
                    printInstructions();;
                    break;
                case 1:
                    shopcart.PrintCart();
                    break;
                case 2:
                    Additem();
                    break;
                case 3:
                    ModifyItem();
                    break;
                case 4:
                    RemoveItem();
                    break;
                case 5:
                    SearchItem();
                    break;
                case 6:
                    exit=true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("Please enter your choice ....");
        System.out.println(" press 0 to display instructions  ");
        System.out.println(" press 1 to display Cart items  ");
        System.out.println(" press 2 to Add items into cart  ");
        System.out.println(" press 3 to Modify items into cart  ");
        System.out.println(" press 4 to Remove items into cart  ");
        System.out.println(" press 5 to Search items from cart  ");
        System.out.println(" press 6 to exit ");
    }
    public static void Additem(){
        System.out.print("Please enter the item you want to add to cart ::");
        String newitem=sc.nextLine();
        shopcart.AddItem(newitem);
    }
    public static void ModifyItem(){
        System.out.print("Please enter the position of item which you want to modify ....");
        int pos= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the new replacement item .. ");
        String newitems=sc.nextLine();
        shopcart.modifyCart(pos-1,newitems);
    }

    public static void RemoveItem(){
        System.out.print("Please enter the item position that you want to remove from cart ::");
        int position= sc.nextInt();
        sc.nextLine();
        shopcart.removeitem(position-1);
    }

    public static void SearchItem() {
        System.out.print("Please enter the item that you want to search ..");
        String searchIt = sc.nextLine();
        if (shopcart.searchItem(searchIt) != null) {
            System.out.println("Item found");
        } else {
            System.out.println("Item not found ");
        }
    }
}
