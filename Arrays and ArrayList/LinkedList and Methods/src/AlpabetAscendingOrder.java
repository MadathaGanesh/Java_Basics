import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class AlpabetAscendingOrder {
    public static void main(String[] args) {
        LinkedList<String> engalpbahet=new LinkedList<String>();
        addInAScOrder(engalpbahet,"haha");
        addInAScOrder(engalpbahet,"mahan");
        addInAScOrder(engalpbahet,"xray");
        addInAScOrder(engalpbahet,"katari krishna");
        addInAScOrder(engalpbahet,"avesham");
        addInAScOrder(engalpbahet,"eeeeee");
        addInAScOrder(engalpbahet,"ganesh");
        printList(engalpbahet);
        addInAScOrder(engalpbahet,"khakhe");
        printList(engalpbahet);
        addInAScOrder(engalpbahet,"mahan");
        printList(engalpbahet);
        addInAScOrder(engalpbahet,"zebra");
        printList(engalpbahet);
    }
    private static void printList(LinkedList<String> linkedlistrefname){
        Iterator i=linkedlistrefname.iterator();
        while (i.hasNext()){
            System.out.println("elements are : "+i.next());
        }
        System.out.println("************************************");
    }
    private static boolean addInAScOrder(LinkedList<String> linkedlistreferencename , String newword){
        ListIterator<String> iter=linkedlistreferencename.listIterator();
        while (iter.hasNext()){
            int compare=iter.next().compareTo(newword);
            if (compare==0){
                System.out.println("word already exist ");
                return false;
            } else if (compare>0) {
                // new word come before
                iter.previous();
                iter.add(newword);
                return true;
            }else if (compare<0){
            }
        }
        iter.add(newword);
        return true;
    }
}
