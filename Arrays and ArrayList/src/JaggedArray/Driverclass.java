package JaggedArray;

        // If we are creating odd number of columns in a 2D array,it is known as a jagged array.
        // In other words, it is an array of arrays with different number of columns.

public class Driverclass {
    public static void main(String[] args) {
        int arr[][]=new int[3][];  // Declaring a 2D array with odd columns .

        arr[0]=new int[3];  // array with 3 columns
        arr[1]=new int[4];   // array with 4 columns
        arr[2]=new int[2];     // array with 2 columns

        // initializing a jagged array
        int count=0;
        for (int i=0;i< arr.length;i++)
            for (int j=0;j< arr[i].length;j++)
                arr[i][j]=count++;

        // Printing the data of a jagged array
        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr[i].length;j++){
                System.out.println(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
