import java.util.Scanner;

public class EvenSum_My {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter last number ;");
        int n= sc.nextInt();
        int sum=0;

        for (int i=10;i<=n;i++){
            if(n%2==0){
                sum=sum+i;
            }
        }
        System.out.println("Even sum is : "+sum);
    }
}
