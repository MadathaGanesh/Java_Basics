
public class Odd_Number_While {
    public static void main(String[] args) {
/*
        int i = 5;
        int n = 30;
        while (i<=n){
            if (i%2!=0) {
                System.out.println(i + " is a odd  number");
            }else {
                System.out.println(i + " is an even number ");
            }
            i++;
        }
*/
        /*
        find odd number using while loop from 5 to 30
         if it is odd number  returns true , else return false
     */
        int FirstNum=4;
        int LastNum=29;

        while (FirstNum<LastNum){
            FirstNum++;
            if(!isOdd(FirstNum)){
                continue;
            }else {
                System.out.println(FirstNum + " is a odd number ");
            }
        }



    }
    public static boolean isOdd(int FirstNum){
        if ((FirstNum%2)!=0){
            return true;
        }else {
            return false;
        }
    }
}
