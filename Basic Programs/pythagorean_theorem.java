
// Write a program to accept three number and check whether they are pythagorean triplet or not.

import java.util.Scanner;

public class pythagorean_theorem {
    public static void main(String[] args) {
        // Formula is  ::   C^2=A^2+B^2
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A value :: ");
        int a=sc.nextInt();
        System.out.println("Enter B value ::");
        int b=sc.nextInt();
        System.out.println("Enter C value :: ");
        int c=sc.nextInt();

        calc(a,b,c);
    }


    // 3 , 4 , 5 follows pythagorans triplets .
    public static int calc(int a,int b,int c){
        int p=a*a;
        int q=b*b;
        int r=c*c;
        if(r==(p+q)){
            System.out.println(a +" "+b+" "+" "+c +"follows pythagoras theorem ");
        }
        else{
            System.out.println("Doesnot follow pythagoraus theorem");
        }
        return 0;
    }

}
