import java.util.Scanner;

/*
        Write a method named hasNotTeen with 3 parameters of type int.
        We’ll say that a number is  “teen” if it is in the range 13..19 inclusive,
        otherwise it is not teen. Given 3 int values, return true if none of them are teen, otherwise return false..
*/
public class teenage {
    public static boolean hasNotTeen(int a,int b,int c){
        if ((a>=13 && a<20) && (b>=13 && b<=20)&& (c>=13 && c<=20)){
        	System.out.println("teenager");
        }
        else
        {
        	System.out.println("Not Teenager");
        }
		return false;
        }




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 values :: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        hasNotTeen(a,b,c);
    }
}
