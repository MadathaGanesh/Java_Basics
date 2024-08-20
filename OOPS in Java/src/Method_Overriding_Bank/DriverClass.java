package Method_Overriding_Bank;

/*
Consider a scenario where Bank is a class that provides a method to get the rate of interest.
 However, the rate of interest may differ according to banks.
 For example, SBI, ICICI, and AXIS banks are providing 8.4%, 7.3%, and 9.7% rate of interest.
 */
public class DriverClass {
    public static void main(String[] args) {
       Bank b;

       // for normal bank
       b=new Bank(1020,7,6.5);
       b.Calculated_Intrest();


       // for axis bank
       b=new AxIS(1500,12,9.7);
       b.Calculated_Intrest();

        // for SBI Bank
        b=new SBI(4030,15,8.4);
        b.Calculated_Intrest();


        // for ICICI Bank
        b=new ICICI(3200,5,7.3);
        b.Calculated_Intrest();
    }
}
