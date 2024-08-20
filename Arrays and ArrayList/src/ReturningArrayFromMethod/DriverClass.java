package ReturningArrayFromMethod;

        //  We can also return an array from the method in Java.

public class DriverClass {

    public static int[] getarray(){
        return new int[]  {10,23,42,54,67,23};
    }

    public static void main(String[] args) {
        int[] returnArray=getarray();
        for (int i:returnArray) {
            System.out.println("Array elements are :: "+i);
        }
    }
}
