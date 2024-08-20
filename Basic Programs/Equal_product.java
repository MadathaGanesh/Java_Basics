
/*
Write a method hasEqualProduct with 3 parameters of type int.
The method should return boolean and it needs to return true
if the product of the first and second parameter is equal to the third parameter. Otherwise, return false.
*/

import java.util.Scanner;

public class Equal_product {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A , B , C Values :: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        boolean res=hasEqualProduct(a,b,c);
        System.out.println(res);
    }
    public static boolean hasEqualProduct(int a,int b,int c){
        int p=a*b;
        if(p==c){
            return true;
        }
        else {
            return false;
        }

    }
}
