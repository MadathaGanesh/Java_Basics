/*
Write a method called numberToWords with one int parameter named number.
The method should print out the passed number using words for the digits.
If the number is negative, print “Invalid Value”.
Example Input/Output
numberToWords(123)-> should print “One Two Three”.
numberToWords(3456)-> should print “Three Four Five Six”.
numberToWords(-7)-> should print “Invalid Value” since parameter is negative;
 */

import java.util.ArrayList;

public class NumberToWordConvertor {
    public static void numberToWordConvertor(int number){
        if (number<0){
            System.out.println("Invalid Input");
        }
        int temp=number;
        ArrayList<String > arrayname=new ArrayList <String> ();
        String array[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        while (temp!=0) {
            arrayname.add(array[temp % 10]);
            temp = temp / 10;
        }
        for (int i= arrayname.size()-1;i>=0;i--){
            System.out.println(arrayname.get(i)+ " ");

        }
    }
    public static void main(String[] args) {
        numberToWordConvertor(124);
    }
}
