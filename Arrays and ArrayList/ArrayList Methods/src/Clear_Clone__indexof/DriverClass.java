package Clear_Clone__indexof;

import java.util.ArrayList;
import java.util.Collections;

public class DriverClass {
    public static void main(String[] args) {
        ArrayList<Integer> arrayname=new ArrayList<Integer>();


        // Adding elements
        arrayname.add(1);
        arrayname.add(2);
        arrayname.add(3);
        arrayname.add(5);
        for (int i:arrayname) {
            System.out.println("Adding elements are :: "+i);
        }
        System.out.println();

        //Cloning elements

        arrayname.clone();
        System.out.println("cloned elements are :: "+arrayname);
        System.out.println();

        //sorted() method
        Collections.sort(arrayname);
        System.out.println("after sorted is :: "+arrayname+"\n");

        // Contains elements
        boolean contain1=arrayname.contains(3);
        if (contain1) {
            System.out.println(" The element 3 is present");
        }
        else {
            System.out.println("Element 3 is not there");
        }
        System.out.println();

        boolean contain2=arrayname.contains(100);
        if (contain2) {
            System.out.println("element 100 is there");
        }else {
            System.out.println("element 100 is not there");
        }
        System.out.println();


        // indexof () method
        System.out.println(" element 1 index is ::: "+arrayname.indexOf(3));
        System.out.println("element 100 index is :: "+arrayname.indexOf(100));

        // get() method
        int pos=arrayname.get(2);
        System.out.println("number 4 index is ::: "+pos+"\n");
        //int pos1=arrayname.get(10);
       // System.out.println("number 100 index is :: "+pos1);  // it shows error bcoz index out of bound range

        // indexof() method
        int ind=arrayname.indexOf(2);
        System.out.println(" index 2 elemts is :: "+ind+"\n");


        // isempty() method
        System.out.println("Isempty() method :: "+arrayname.isEmpty()+"\n");

        // lastindexof() method
        System.out.println("last index element is :: "+arrayname.lastIndexOf(2));
        System.out.println("last index element is :: "+arrayname.lastIndexOf(208));
        System.out.println();

        //tostring() method
        System.out.println("to string() method Is :: "+arrayname.toString());

        //toarray() method
        System.out.println("toarray() method ::"+arrayname.toArray());
    }


}
