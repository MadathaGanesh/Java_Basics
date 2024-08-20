package Method_Overriding_Bank;

public class SBI extends Bank{

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

    public SBI(double deposited_amount, double duration, double intrest) {
        super(deposited_amount, duration, intrest);
        this.deposited_amount = deposited_amount;
        this.duration = duration;
        this.intrest = intrest;
    }

    public void Calculated_Intrest(){
        double total_amount=deposited_amount*duration*intrest;
        System.out.println("Total SBI bank intrest is :: "+total_amount);
        System.out.println(" intrest of SBI bank is :: "+intrest);
        System.out.println("\n");
    }
}
