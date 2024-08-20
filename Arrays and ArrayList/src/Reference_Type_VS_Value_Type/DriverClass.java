package Reference_Type_VS_Value_Type;

public class DriverClass {
    public static void main(String[] args) {
        int x=10;
        int y=x;
        System.out.println("X value is :: "+x);
        System.out.println("Y value is :: "+y);

        int x1=30;
        int y1=x1+6;
        System.out.println("Updated x1 value is :: "+x1);
        System.out.println("Updated y1 value is :: "+y1);

    }
}
