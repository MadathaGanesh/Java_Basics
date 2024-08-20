package ArrayTaskProgram;

import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args) {
        int[] numbers=new int[5]; // Array
        int NumValues=0; // Input taking values
        boolean valid;
        int num=0;

        Scanner sc=new Scanner(System.in);
        while (NumValues<numbers.length){
            do {
                valid = true;
                System.out.println("Please enter Unique number :");
               num = sc.nextInt();
                for (int i = 0; i < numbers[i]; i++) {
                    if (num == numbers[i]) {
                        System.out.println("Number already exists ");
                        valid = false;
                        break;
                    }
                }
            }
                while (!valid) ;
                numbers[NumValues] = num;
                NumValues++;
        }
        for (int numv:numbers){
            System.out.println("Number value : "+numv);
        }
    }
}
