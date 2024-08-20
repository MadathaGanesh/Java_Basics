
/*
Declare a double variable weightKgs and take input from the user in kilograms.
 Also, Create a method convert(double kgs) and convert the weight to grams and milligrams.
*/

import java.util.Scanner;

public class weight_calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter weight in KG :");
        double weightkgs=sc.nextDouble();


        converted(weightkgs);
    }
     // 1 KG = 1000 grams
    // 1 KG = 1000000 milligrams

    public static void converted(double kg_value){
        double gram_value;
        double milli_value;
        gram_value=kg_value*1000;
        milli_value=kg_value*100000;
        System.out.println("Grams Value is :: "+gram_value);
        System.out.println("Milli Grams value is ::"+milli_value);
    }

}
