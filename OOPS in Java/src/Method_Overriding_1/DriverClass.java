package Method_Overriding_1;

public class DriverClass {
    public static void main(String[] args) {
       /*

       Parent_Class object;  // Creating an instance or objectname
        object=new Child_Class_1();  // By using new keyword we are assigning Child_Class_1 to object
        object.display();   // Calling the method of Child_Class_1

        object=new Child_Class_2(); //  By using new keyword we are assigning Child_Class_2 to object
        object.display();  // Calling the method of Child_Class_2
        object.display();

        object=new Parent_Class();  //  By using new keyword we are assigning parent_class to object
        object.display();  // Calling the method of parent_class

        */

        Parent_Class obj1=new Child_Class_1();  // Here overriding the parent_class with the help of child_class_1
        obj1.display();

        Parent_Class obj2=new Child_Class_2();  // Here overriding the parent_class with the help of child_class_2
        obj2.display();

        Parent_Class obj3=new Parent_Class();  // Here Calling the parent class object by creating object
        obj3.display();
    }
}
