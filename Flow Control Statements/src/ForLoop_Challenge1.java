public class ForLoop_Challenge1 {
    public static void main(String[] args) {
        int n=100;
        for (int k=0;k<n;k++){
        isprime(k);
    }
    }

    public static void isprime(int n){
        int count=0;
        for (int i=1;i<=n;i++) {
            if (n % i == 0) {
                count = count + 1;
            }
        }
            if(count==2) {
                System.out.println(n + " is a prime number ");
            }
    }
}
