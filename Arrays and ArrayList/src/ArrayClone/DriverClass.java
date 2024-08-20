package ArrayClone;

    /*
    Since, Java array implements the Cloneable interface, we can create the clone of the Java array. If we create the clone of a single-dimensional array, it creates the deep copy of the Java array. It means, it will copy the actual value. But, if we create the clone of a multidimensional array, it creates the shallow copy of the Java array which means it copies the references.
     */
public class DriverClass {
    public static void main(String[] args) {
        int arr[]={1,12,24,2,43};
        for (int i:arr) {
            System.out.println("The original array is :: "+i);
        }

        int clone[]=arr.clone();
        for (int j:clone){
            System.out.println("The cloned array elements are : "+j);
        }

        if (arr.equals(clone)){
            System.out.println("Both arrays have same data ");
        }else {
            System.out.println("Both arrays have different data");
        }
    }
}
