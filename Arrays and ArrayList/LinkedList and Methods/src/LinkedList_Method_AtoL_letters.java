import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

// add , add(index,element) method , descendingIterator() method ,get(index) method , getFirst() method, getLast() method ,
//indexof() method , lastindexof() method , listIterator(int index) , /contains() method , clone() method, clear() method .


public class LinkedList_Method_AtoL_letters {
    public static void main(String[] args) {
        LinkedList<String> linkedlistname=new LinkedList<String>();
        linkedlistname.add("Apple");
        linkedlistname.add("Banana");
        linkedlistname.add("donkey");
        linkedlistname.add("frog");
        linkedlistname.add("Kaleja");

        for (String i:linkedlistname) {
            System.out.println("Using Add method :: "+i);
        }
        System.out.println();

        //.add(index,element) method
        linkedlistname.add(2,"cat");
        linkedlistname.addLast("Zebra");
        linkedlistname.addFirst("HAHAHA");
        linkedlistname.add(3,"eggs");
//        linkedlistname.addAll(1,linkedlistname);
        for (String i:linkedlistname) {
            System.out.println("Using Add(index,element) method :: "+i);
        }
        System.out.println();

        // descendingIterator() method
        System.out.println("correct order is :: "+linkedlistname);
        Iterator i=linkedlistname.descendingIterator();
        while (i.hasNext()) {
            System.out.println("using descendingIterator() method prints elements in reverse order :: " + i.next());
        }
        System.out.println();

        //toarray() method
        linkedlistname.toArray();
        System.out.println("after using linkedlistname.toArray() ==>"+linkedlistname);
        System.out.println();

        //tostring() method
        linkedlistname.toString();
        System.out.println("after using linkedlistname.toString() ==>"+linkedlistname);


        //get(index) method
        System.out.println("get(index) method --> 4th element is  ::  "+linkedlistname.get(4));
        System.out.println();

        //getFirst() method
        System.out.println("getFirst() method -> first element is :: "+linkedlistname.getFirst());
        System.out.println();

        //getLast() method
        System.out.println("using getLast() method -> last element is :: "+linkedlistname.getLast());
        System.out.println();


        //indexof() method
        System.out.println("using indexof() method --> "+linkedlistname.indexOf("eggs"));
        System.out.println("using indexof() method --> "+linkedlistname.indexOf("hasjsd"));
        System.out.println();

        //lastindexof() method
        System.out.println("using lastindexof() method :: "+linkedlistname.lastIndexOf("eggs"));
        System.out.println("using lastindexof() method :: "+linkedlistname.lastIndexOf("hkjasa"));
        System.out.println();

        //listIterator(int index)
        ListIterator list_iter=linkedlistname.listIterator(2);
        while (list_iter.hasNext()) {
            System.out.println("using listIterator(int index) has next ::" + list_iter.next());
        }
        System.out.println();

        ListIterator list_iter1=linkedlistname.listIterator(4);
        while (list_iter1.hasPrevious()) {
            System.out.println("using listIterator(int index) has previous ::" + list_iter1.previous());
        }

        System.out.println();


        //contains() method
        boolean res=linkedlistname.contains("Banana");
        boolean res1=linkedlistname.contains("thank you");
        System.out.println("contains() method --> is thank you there ::"+res1);
        System.out.println("contains() method --> is kaleja there :: "+res);
        System.out.println();

        // clone() method
        System.out.println("cloned linked list is :: "+linkedlistname.clone());
        System.out.println();

        // clear() method
        System.out.println("using clear() method :: ");
        linkedlistname.clear();
        System.out.println();

    }
}
