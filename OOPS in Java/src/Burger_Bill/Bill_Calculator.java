package Burger_Bill;

public class Bill_Calculator {
     /*
    Create a program that will generate a bill at McDonald's for four vegetable burgers (@ Rs 45 per vegetable Burger)
     and three vegetable McPuffs (@ Rs 25 per vegetable McPuff).
     There is a special Independence Day discount of Rs 50 on the final bill amount.
     */

    public double vegetable_burgers_price=45.0;
    public int No_of_Vegetable_Burgers=4;
    public double Vegetable_MCPuffs_price=25;
    public int No_Of_Vegetable_MCpuffs=3;


    public void totalBill(){
        double total_Burgers_cost=vegetable_burgers_price*No_of_Vegetable_Burgers;
        double total_MCPuffs_Cost=Vegetable_MCPuffs_price*No_Of_Vegetable_MCpuffs;
        double total_Price_without_Discount=total_Burgers_cost+total_MCPuffs_Cost;
        double total_price_with_discount=total_Price_without_Discount-50;
        System.out.println("total_Price_without_Discount  is :: "+total_Price_without_Discount);
        System.out.println("total_price_with_discount is :: "+total_price_with_discount);
    }


}
