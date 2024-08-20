import java.util.Scanner;

public class SumAndAverageUsingScannerClassMY {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            System.out.println("Enter First Integer :");
            int a1 = sc.nextInt();
            System.out.println("Enter Second Integer :");
            int a2 = sc.nextInt();
            System.out.println("Enter Third Integer :");
            int a3 = sc.nextInt();
            int IntegerSum = a1 + a2 + a3;
            int avgsum = (IntegerSum / 3);
            System.out.println("Integer Total Sum is : " + IntegerSum);
            System.out.println("Integer Total Average Sum is : " + avgsum);
        }
        else {
            System.out.println("Enter proper Integer values");
        }
    }
}
