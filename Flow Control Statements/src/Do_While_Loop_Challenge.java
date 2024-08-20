/*
            Calcute the sum of digits in a number .
 */
public class Do_While_Loop_Challenge {
    public static void main(String[] args) {
        int n=235;
        int rem;
        int sum=0;
       do {
           rem=n%10;
           sum=sum+rem;
           n=n/10;
       }while (n!=0);
        System.out.println("The sum of digits in number is  : "+sum);
    }
}
