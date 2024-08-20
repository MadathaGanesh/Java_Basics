import java.util.Scanner;

/*
    Printing Factors of a number
 */
public class Factors_Of_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num= sc.nextInt();

            if (num <= 0) {
                System.out.println("Invalid input");
            } else {
                for (int i = 1; i <= num; i++) {
                    if (num % i == 0) {
                        System.out.println("Factors of " + num + " is : " + i);
                    }
                }
            }
    }
}
