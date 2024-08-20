package UserArray;


// Taking UserArray data as input for an array

import java.util.Scanner;

public class DriverClass {
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int sum = 0;

        // Getting userdefined array values as input .
        int userArray[] = getUservalues(5);
        for (int i = 0; i < userArray.length; i++) {
            System.out.println("User array data is :: " + userArray[i]);
        }


        // printing sum of user defined array elements
        int usersum=sum(userArray);
        System.out.println("totalsum  of userarray is :: "+usersum);

        /* printing sum of user defined array elements
        for (int j=0;j<userArray.length;j++){
            sum=sum+userArray[j];
        }
        System.out.println("Total array sum is :: "+sum);
    }
    */
    }

    public static int[] getUservalues(int number){
        System.out.println("Enter "+ number + " integers :");
        int[] userValues= new int[number];
        for (int i=0;i<userValues.length;i++){
            userValues[i]=sc.nextInt();
        }
        return userValues;
    }

    public static int sum(int[] usersum){
        int totalsum=0;
        for (int i=0;i<usersum.length;i++){
           totalsum+=usersum[i];
        }
        return totalsum;
    }

}
