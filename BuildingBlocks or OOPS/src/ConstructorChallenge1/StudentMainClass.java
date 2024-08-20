package ConstructorChallenge1;

public class StudentMainClass {
    public static void main(String[] args) {

        // Creating object for Default Constructor
        StudObjectClass obj=new StudObjectClass();
        System.out.println("Student name is :  "+obj.getStudName());
        System.out.println("Student ROll no is : "+obj.getStudRollNo());
        System.out.println("Student class is : "+obj.getStudentClass());
        System.out.println("Student Section is : "+obj.getSection());
        System.out.println("******************************************");

        // Creating Object for Two parameters should be taken at object creation and remaining two values  should be default
        StudObjectClass obj1=new StudObjectClass("Sai",29);
        System.out.println("Student name is :  "+obj1.getStudName());
        System.out.println("Student ROll no is : "+obj1.getStudRollNo());
        System.out.println("Student class is : "+obj1.getStudentClass());
        System.out.println("Student Section is : "+obj1.getSection());
        System.out.println("******************************************");


        // creating Object for Total Parameterized constructor .all parameters will be taken at object creation
        StudObjectClass obj2=new StudObjectClass("Krishna",89,10,"B");
        System.out.println("Student name is :  "+obj2.getStudName());
        System.out.println("Student ROll no is : "+obj2.getStudRollNo());
        System.out.println("Student class is : "+obj2.getStudentClass());
        System.out.println("Student Section is : "+obj2.getSection());


    }
}
