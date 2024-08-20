package Anonymous_Array_in_Java;

public class DriverClass {
        // Java supports the feature of an anonymous array, so you don't need to declare the array while passing an array to the method.
    public static void anonymous(int arr[]){
        for (int i:arr) {
            System.out.println(" the array elements are ::"+i);
        }
    }

    public static void main(String[] args) {
        anonymous(new int[]{10,23,15,32,64,756,8});
    }
}
