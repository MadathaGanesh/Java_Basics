package DefaultConstructorDemo;

public class ObjectClass1 {
    String Custname;
    int CustId;
    long custPhoneno;
    double Accbal;
    String CustAddress;

    // Creating and Calling Default Constructor
    public ObjectClass1(){
        // Assigning values to default constructor
        this("Sai",532,97320839,100,"Karimnagar");
        System.out.println("Default Constructor is called");
    }

    //Constructor Overloading with parameters
    public ObjectClass1(String custname,int custId,long custPhoneno,double accbal,String custAddress){
        this.Custname=  custname;
        this.CustId=custId;
        this.custPhoneno=custPhoneno;
        this.Accbal=accbal;
        this.CustAddress=custAddress;
        System.out.println("Parameterized Constructor Called");
    }

    // Setters
    public void setCustname(String custname) {
        Custname = custname;
    }

    public void setCustId(int custId) {
        CustId = custId;
    }

    public void setCustPhoneno(long custPhoneno) {
        this.custPhoneno = custPhoneno;
    }

    public void setAccbal(double accbal) {
        Accbal = accbal;
    }

    public void setCustAddress(String custAddress) {
        CustAddress = custAddress;
    }

    // Getters
    public String getCustname() {
        return Custname;
    }

    public int getCustId() {
        return CustId;
    }

    public long getCustPhoneno() {
        return custPhoneno;
    }

    public double getAccbal() {
        return Accbal;
    }

    public String getCustAddress() {
        return CustAddress;
    }

    public void MaxShop(double balance){
        if (Accbal>balance){
            double rembal=Accbal-balance;
            System.out.println("Shopping completed .Your remaining acc balance is :"+rembal);
        }else {
            double LOWbal=balance-Accbal;
            System.out.println("Low Balance . you need more :"+LOWbal +" Rupees ");
        }
    }

  public void Recharge(double rechargeAmount){
        double AmountAfterRecharge=Accbal+rechargeAmount;
      System.out.println("After recharging your balance is : "+AmountAfterRecharge);
  }

}
