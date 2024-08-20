import java.util.LinkedList;
import java.util.ListIterator;

public class LinedListMethodsMtoZ {
    public static void main(String[] args) {
        LinkedList<String> linkedlistname=new LinkedList<>();
        linkedlistname.add("Hello");
        linkedlistname.add("Grapes");
        linkedlistname.add("Hahaha");
        linkedlistname.addFirst("EEEEEE");
        linkedlistname.add("RRR");
        linkedlistname.addLast("Xray");
        ListIterator iter=linkedlistname.listIterator();
        while (iter.hasNext()) {
            System.out.println("elements are :: " + iter.next());
        }
        System.out.println();

//            offer() method  ==> used to insert new elements in Linkedlist
            linkedlistname.offer("Dil");
            linkedlistname.offerFirst("Katamarayudu");
            linkedlistname.offerLast("NTR");
            ListIterator iter1 = linkedlistname.listIterator();
            while (iter1.hasNext()) {
                System.out.println("elements using offer() method are :: " + iter1.next());
            }
        System.out.println();


//      peek() method
        System.out.println("linkedlistname.peek() ==> " +linkedlistname.peek());
        System.out.println("linkedlistname.peekFirst() ==> " +linkedlistname.peekFirst());
        System.out.println("linkedlistname.peekLast() ==> " +linkedlistname.peekLast());
        System.out.println();

        //set()method
        linkedlistname.set(2,"Racha");
        linkedlistname.set(6,"Howley");
        System.out.println("using set() method"+linkedlistname);
        System.out.println("size() method ::"+linkedlistname.size());
        ListIterator list4=linkedlistname.listIterator();
        while (list4.hasNext()){
            System.out.println("elements after using set() method is :: "+list4.next());
        }
        System.out.println();

//        spliterator() method
        linkedlistname.spliterator();
        System.out.println("after using linkedlistname.spliterator() ==> "+linkedlistname);
        System.out.println();

//        toArray() method
        linkedlistname.toArray();
        System.out.println("after using linkedlistname.toArray() ==> "+linkedlistname);
        System.out.println();


//        tostring() method

        linkedlistname.toString();
        System.out.println("after using linkedlistname.toString ==> "+linkedlistname.toString());
        System.out.println();

//   push() method
        linkedlistname.push("Allu arjun");
        linkedlistname.push("NANI");
        System.out.println("push() method is ::"+linkedlistname);
        System.out.println();

//       pop() method
        linkedlistname.pop();
        System.out.println("popped element using pop() method is ::"+linkedlistname.pop());
        System.out.println("remaining elements after using pop() method is :: "+linkedlistname);
        System.out.println();


//        remove()method
        System.out.println("using remove() method :: "+linkedlistname.remove());
        System.out.println("using removeFirst() method :: "+linkedlistname.removeFirst());
        System.out.println("using removeLast() method :: "+linkedlistname.removeLast());
        System.out.println("using removeLastOccurance() method :: "+linkedlistname.removeLastOccurrence("Hello"));
        System.out.println("using removeLastOccurance() method :: "+linkedlistname.removeLastOccurrence("dagfjdd"));
        System.out.println();



    }
}
