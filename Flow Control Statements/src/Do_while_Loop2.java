import java.util.Scanner;

/*
Printing number in reverse order
 */
public class Do_while_Loop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value : ");
        int n = sc.nextInt();
        int rem;
        do {
            rem = n % 10;
            System.out.println("Number in reverse order  is : "+rem);
            n=n/10;
        }while (n!=0);
    }
}
