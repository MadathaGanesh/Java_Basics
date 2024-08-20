package Add_And_Remove_Modify_Methods;

import java.util.ArrayList;
import java.util.Collections;

public class DriverClass {
    public static void main(String[] args) {
        ArrayList<String> arrayname = new ArrayList<>();


        // Adding elements
        arrayname.add("Ganesh");
        arrayname.add("Singam");
        arrayname.add("Doraemon0");
        arrayname.add("jhdfhldf");
        arrayname.add("jddf");
        arrayname.add(2,"Puli");
        System.out.println("After adding elements are :: "+arrayname);
        System.out.println();


        // Removing elements

        arrayname.remove("Ganesh");
        arrayname.remove(4);
        arrayname.removeIf(array->(array.charAt(0)=='D'));  // removeif() method
        for (String name:arrayname) { // for each loop
            System.out.println("after removing elements ::"+name);
        }



        // Modify the elements using set method

        arrayname.set(1,"Thank You");
        System.out.println("Modified element is :: "+arrayname+"\n");


        //size() method

        System.out.println("array size is :: "+arrayname.size()+"\n");


        //sorted() method
       Collections.sort(arrayname);
        System.out.println("after sorted() method is :: "+arrayname+"\n");

        //sublist() method
        arrayname.subList(1,3);
        System.out.println("sub list is :: "+arrayname+"\n");

        //trimtosize() method
        System.out.println("trim to size() method is :: "+arrayname.subList(1,3)+"\n");

        // toarray() method
        System.out.println("toarray() method is :: "+arrayname.toArray()+"\n");


        // tostring() method
        System.out.println("tostring() method is ::"+arrayname.toString());

        //removeall() method
        System.out.println("after removing all ::");
        arrayname.removeAll(arrayname);
        System.out.println(arrayname);


    }
}
