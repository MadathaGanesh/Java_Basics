import java.util.Scanner;

/*
Checking whether a given number is a palindrome number or not .
 */
public class Palindrome_Number {
    public static boolean isPalindrome(int number){
        int reverse=0;
        int temp=number;
        while (temp!=0){
            reverse=reverse*10+temp%10;
            temp=temp/10;
        }
        if (number==reverse){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers :");
            int number= sc.nextInt();
            if (isPalindrome(number)){
        System.out.println(number + " is a plaindrome number");
    }else {
                System.out.println(number + " is not a palindrome number ");
            }
    }

}
