package Array_3;

public class DriverClass {
    public static void main(String[] args) {
        int arr[]=new int[11];

        // Initializing an array using for loop
        for(int i=1;i<arr.length;i++){
            arr[i]=i*2;
        }

        /* printing an array using for loop
        for (int i=1;i<arr.length;i++){
            System.out.println("array elemts are :: "+arr[i]);
        }

         */

        //  printing an array using for each loop
        for (int i:arr) {
            System.out.println("Array elements using for each loop are :: "+i);
        }
    }
}
