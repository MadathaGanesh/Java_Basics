package ArrayListDemo;

import java.util.ArrayList;

public class DriverClass {
    public static void main(String[] args) {
        int n=5;
        ArrayList <String> arrayname=new ArrayList<String>();
        ArrayList <Integer> integerarrayName=new ArrayList<Integer>();

        for (int i=0;i<n;i++){
            integerarrayName.add(i);
            arrayname.add("Hello ");
        }
        System.out.println("Integer Array is :: "+integerarrayName);
        System.out.println("String array is :: "+arrayname);
    }
}
