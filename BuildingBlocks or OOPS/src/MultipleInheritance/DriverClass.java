package MultipleInheritance;

/*
    By creating the object we can access / inherit the methods and data of another classes .
 */
public class DriverClass {
    public static void main(String[] args) {
        FirstClass obj1;
        obj1=new FirstClass();
        obj1.display();

        SecondClass obj2=new SecondClass();
        obj2.display2();
    }
}
