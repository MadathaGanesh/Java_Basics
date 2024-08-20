package Finding_Minimum_element_in_Array;

    // Java Program to demonstrate the way of passing an array to method.

public class DriverClass {

     // Finding Minimum element in an array
    public static void minimum_element(int arr[]){
        int min=arr[0];
        for (int i=0;i< arr.length;i++){
            if (min>=arr[i]){
                min=arr[i];
            }
        }
        System.out.println("the minimum element in array is :: "+min);
    }


    // Finding maximum element in an array
    public static void maximum_element(int arr[]){
        int max=arr[0];
        for (int j=0;j< arr.length;j++){
            if (max<= arr[j]){
            max=arr[j];
        }}
        System.out.println("The maximum element in an array is :: "+max);
    }

    public static void main(String[] args) {
       int arr[]={10,4,3,31,88,26,98,198};
       minimum_element(arr);
       maximum_element(arr);
    }
}
