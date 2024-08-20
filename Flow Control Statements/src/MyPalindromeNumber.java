import java.util.Scanner;

public class MyPalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter number in correst order : ");
        int number= sc.nextInt();
        int revNum=0;
        int OriginalNumber=number;
        int remainder;

        /*
        while (number!=0){
            remainder=number%10;
            revNum =revNum*10+remainder;
            number=number/10;
        }
         */

        for (revNum=0;number>0;){
                remainder=number%10;
                revNum=revNum*10+remainder;
                number=number/10;
        }

        if (OriginalNumber==revNum){
            System.out.println(OriginalNumber + " is a palindrome number");
        }else {
            System.out.println(OriginalNumber + " is not a palindrome number");
        }
    }
}
