package GroceryProjectSettersAndGetters;

public class GroceryMartObj {
    private String CustomerName;
    private int CustomerId;
    private long CustomerPhoneNumber;
    private double AccountBalance;
    private String CustomerAddress;

    // Setters for attributes
    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public void setCustomerId(int customerId) {
        CustomerId = customerId;
    }

    public void setCustomerPhoneNumber(long customerPhoneNumber) {
        CustomerPhoneNumber = customerPhoneNumber;
    }

    public void setAccountBalance(double accountBalance) {
        AccountBalance = accountBalance;
    }

    public void setCustomerAddress(String customerAddress) {
        CustomerAddress = customerAddress;
    }


    // Getters for attributes
    public String getCustomerName() {
        return CustomerName;
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public long getCustomerPhoneNumber() {
        return CustomerPhoneNumber;
    }

    public double getAccountBalance() {
        return AccountBalance;
    }

    public String getCustomerAddress() {
        return CustomerAddress;
    }


    // Creating maxamountShop method

    public void maxAmountShop(double amount){
        if (AccountBalance>amount){
            double remainingbalance=AccountBalance-amount;
            System.out.println("Thanks for shopping .Your remaining balance is : "+remainingbalance);
        }
        else {
            double lowamount=amount-AccountBalance;
            System.out.println("Your Account Balance is Not Sufficient . Please do recharge amount of : "+lowamount);
        }
    }

    // Creating recharge method
    public void recharge(double rechargeamount){
        double AmountAfterRecharge=AccountBalance+rechargeamount;
        System.out.println("After recharging your Account Balance is : "+AmountAfterRecharge);
    }




}
