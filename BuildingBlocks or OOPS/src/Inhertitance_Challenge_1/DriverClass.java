package Inhertitance_Challenge_1;

import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your product ....");
            System.out.println("Press 1 for fruits");
            System.out.println("Press 2 for Vegetables");
            System.out.println("Press 3 for Drinks");
            System.out.println("Press 4 for Spices");
            System.out.println("Press 5 for Oils");
            System.out.println("Please select an item from the above list");
            int item_code = sc.nextInt();
            Wallet obj = new Wallet();
            String item_name = obj.ItemsList(item_code);
            double price = obj.price(item_name);
            obj.bill(price);

        }
}
