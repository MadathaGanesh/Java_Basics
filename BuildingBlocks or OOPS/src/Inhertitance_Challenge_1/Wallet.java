package Inhertitance_Challenge_1;

import java.util.Scanner;

/*
Create one more class wallet which will extend ShoppingCart , there will be different methods in the wallet class,
which will generate the bill and update and recharge the wallet  balance accordingly.
*/
public class Wallet extends ShoppingCart{
    double wallet_Balance=50;
    public static void balance(){
        double balance=0.0;
        System.out.println("Your current balance is :: "+balance);
    }

    public void recharge(double amount){
        wallet_Balance=wallet_Balance+amount;
        System.out.println("Thanks for recharging ");
        System.out.println("Your new balance is :: "+wallet_Balance);
    }

    public void updateBalance(double item_price){
        wallet_Balance=wallet_Balance-item_price;
        System.out.println("Your remaining balance is :: "+wallet_Balance);
    }

    public void bill(double item_price){
        if (item_price<wallet_Balance){
            System.out.println("Thanks for purchasing ");
            updateBalance(item_price);
        }else if (item_price>wallet_Balance){
            System.out.println("Your account does not have sufficient Balance . ");
            double recharge_amount=item_price-wallet_Balance;
            System.out.println("you need more "+ recharge_amount + " amount ");
            Scanner sc=new Scanner(System.in);
            System.out.println("Please enter how much amount you want to recharge : ");
            double amount=sc.nextInt();
            recharge(amount);
        }
    }
}
