package SortedArray;

public class DriverClass {

    public static void main(String[] args) {
        int arr[]=new int[]{-3,1,45,21,-4,20,-53};
        realArray(arr);
        sortedArray(arr);
    }

    public static void realArray(int arr[]){
        System.out.println("Array elements before sorting is ::");
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }

    public static void sortedArray(int arr[]){
        int temp=0;
        System.out.println("Sorted array elements are :: ");
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }}
                System.out.println(arr[i]);
        }
    }
}
