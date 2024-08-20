package Array_2;

public class DriverClass {
    public static void main(String[] args) {
        int[] myarray={41,25,35,5,42,86};    // Direct initialization to array means declaration , instantiation ,initialization .

        /* using for loop
        for (int i=1;i<myarray.length;i++){
            System.out.println(" array elements are ::"+myarray[i]);
        }
        */

        int k=1;
        while (k<myarray.length){
            System.out.println(" array elements using while loop  are ::"+myarray[k]);
            k++;
        }
    }

       // Using while loop


}
