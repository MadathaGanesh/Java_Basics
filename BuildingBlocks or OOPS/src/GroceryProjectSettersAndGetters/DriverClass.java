package GroceryProjectSettersAndGetters;

public class DriverClass {
    public static void main(String[] args) {

        GroceryMartObj obj=new GroceryMartObj();
        obj.setCustomerName("Ganesh");
        obj.setCustomerId(100);
        obj.setCustomerPhoneNumber(873923453);
        obj.setAccountBalance(500.70);
        obj.setCustomerAddress("Warangal");

        /*
        System.out.println("Customer Details are : ");
        System.out.println("Customer name is : "+obj.getCustomerName());
        System.out.println("Customer Id is : "+obj.getCustomerId());
        System.out.println("Customer number is : "+obj.getCustomerPhoneNumber());
        System.out.println("Customer Account balance is : "+obj.getAccountBalance());
        System.out.println("Customer Address is : "+obj.getCustomerAddress());
        System.out.println();
        */

        obj.maxAmountShop(560.70);

        obj.recharge(100);
        obj.maxAmountShop(300.0);
    }
}
