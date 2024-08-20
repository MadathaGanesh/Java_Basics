package FloorInASortedArray;

/*
     Given a sorted array and a value x,
     the floor of x is the largest element in array smaller than or equal to x.
     Write efficient functions to find floor of x.
     Input :  arr= {1, 2, 8, 10, 10, 12, 19}, x = 5 Output : 2
 */
public class DriverClass {
    public static int floorsearch(int arr[],int n,int x){
        if (x>=arr[n-1])
            return n-1;
        if (x<arr[0])
            return -1;
        for (int i=1;i<n;i++)
            if (arr[i]>x)
                return (i-1);
        return -1;
    }

    /*
    In this program it will return the number which is nearest and less than x value
    and if the x value is negative number then it returns else statement .
     */
    public static void main(String[] args) {
        int arr[]={1,2,4,6,10,12,14};
        int n=arr.length;
        int x=11;
        int index=floorsearch(arr,n-1,x);
        if (index==-1)
            System.out.println("Floor of "+ x + " doesn't exist in array");
        else
            System.out.println("Floor of "+ x + " is " + arr[index]);
    }
}


