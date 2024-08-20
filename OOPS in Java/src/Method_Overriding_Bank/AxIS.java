package Method_Overriding_Bank;
// Axis == 9.7% intrest  ...      Principal loan amount x interest rate x loan term = interest.
public class AxIS extends Bank{
    private double deposited_amount;
    private double duration;
    private double intrest;


    public double getDeposited_amount() {
        return deposited_amount;
    }

    public void setDeposited_amount(double deposited_amount) {
        this.deposited_amount = deposited_amount;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getIntrest() {
        return intrest;
    }

    public void setIntrest(double intrest) {
        this.intrest = intrest;
    }

    public AxIS(double deposited_amount, double duration, double intrest){
        super(deposited_amount,duration,intrest);
        this.deposited_amount=deposited_amount;
        this.duration=duration;
        this.intrest=intrest;
    }

    public void Calculated_Intrest(){
        double total_amount=deposited_amount*duration*intrest;
        System.out.println("Total AXIS bank intrest is :: "+total_amount);
        System.out.println(" intrest of AXIS bank is :: "+getIntrest());
        System.out.println("\n");
    }

}

