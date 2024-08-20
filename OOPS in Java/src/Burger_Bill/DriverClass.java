package Burger_Bill;

public class DriverClass {
    /*
    Create a program that will generate a bill at McDonald's for four vegetable burgers (@ Rs 45 per vegetable Burger)
     and three vegetable McPuffs (@ Rs 25 per vegetable McPuff).
     There is a special Independence Day discount of Rs 50 on the final bill amount.
     */
    public static void main(String[] args) {
        Bill_Calculator obj;
        obj=new Bill_Calculator();
        obj.totalBill();

    }
}
