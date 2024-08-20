package DefaultConstructorDemo;

public class DriverClass1 {
    public static void main(String[] args) {

        // Default Constructor with No Parameters
        ObjectClass1 obj1 =new ObjectClass1();
        obj1.setCustname("GANESH");
        obj1.setCustId(101);
        obj1.setCustPhoneno(325446543);
        obj1.setAccbal(500.90);
        obj1.setCustAddress("Warangal");
        obj1.MaxShop(510);
        obj1.Recharge(50);

        // Constructor with parameters
        ObjectClass1 para1=new ObjectClass1("Madatha",202,786358911,200,"Hanamkonda");

        System.out.println("Default Constructor values are : ");
        System.out.println("Name is : "+obj1.getCustname());
        System.out.println("Cust ID is : "+obj1.getCustId());
        System.out.println("Cust phone number is : "+obj1.getCustPhoneno());
        System.out.println("Account balance is : "+obj1.getAccbal());
        System.out.println("Cust Addrress is : "+obj1.getCustAddress());

        System.out.println("**************************8");

        System.out.println(" Parameterized Constructor  values are :: ");
        System.out.println("Name is : "+para1.getCustname());
        System.out.println("Cust ID is : "+para1.getCustId());
        System.out.println("Cust phone number is : "+para1.getCustPhoneno());
        System.out.println("Account balance is : "+para1.getAccbal());
        System.out.println("Cust Addrress is : "+para1.getCustAddress());




    }
}
