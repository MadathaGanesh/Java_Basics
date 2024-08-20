import java.util.Iterator;
import java.util.LinkedList;

public class Prep_AlphabeticalOrder {
    public static void main(String[] args) {
        LinkedList<String> linkedListname=new LinkedList<>();
        linkedListname.add("Apple");
        linkedListname.add("Cat");
        linkedListname.add("Dog");
        linkedListname.add("Frog");
        printList(linkedListname);
        linkedListname.add(1,"Bat");
        linkedListname.add(4,"egg");
        linkedListname.remove(3);
        printList(linkedListname);
    }
    private static void printList(LinkedList<String> linkedlistrefname){
        Iterator i=linkedlistrefname.iterator();
        while (i.hasNext()){
            System.out.println("elements are : "+i.next());
        }
        System.out.println("************************************");
    }
}
