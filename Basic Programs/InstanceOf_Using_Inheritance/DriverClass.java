package InstanceOf_Using_Inheritance;

public class DriverClass {
    public static void main(String[] args) {
        ChildClass obj=new ChildClass();
        System.out.println(obj instanceof ParentClass);
        System.out.println(obj instanceof ChildClass);
    }
}
