/*
Write a method named hasSameLastDigit with three parameters of type int.
Each number should be within the range of 10 (inclusive) - 1000 (inclusive).
If one of the numbers is not within the range, the method should return false.
The method should return true if at least two of the numbers share the same rightmost digit;
otherwise, it should return false.
EXAMPLE INPUT/OUTPUT:
hasSameLastDigit (41, 22, 71); → should return true since 1 is the rightmost digit in numbers 41 and 71
hasSameLastDigit (23, 32, 42); → should return true since 2 is the rightmost digit in numbers 32 and 42
hasSameLastDigit (9, 99, 999); → should return false since 9 is not within the range of 10-1000
 */
public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41,22,72));
        System.out.println(hasSameLastDigit(32,23,9));

    }

    /*
    Checking whether last number is equal in the three different numbers or not
     */
    public static boolean hasSameLastDigit(int firstnum,int secondnum,int thirdnum){
        if((firstnum>=10&& firstnum<=1000)&&(secondnum>=10&&secondnum<=1000)&&(thirdnum>=10&&thirdnum<=1000)){
            return((firstnum%10==secondnum%10)||(secondnum%10==thirdnum%10)||(thirdnum%10==firstnum%10));
        }
        else {
            return false;
        }
    }
}
