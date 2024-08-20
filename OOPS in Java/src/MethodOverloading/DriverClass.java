package MethodOverloading;

public class DriverClass {
    /*
    Method overloading can be done by changing number of arguments and datatype of an arguments .
     */
    public static void main(String[] args) {
        Basic_Class obj=new Basic_Class();
        System.out.println(obj.area(10.5,12.5));
        System.out.println(obj.area(10,20));
        System.out.println(obj.area(10,20,30));
        System.out.println(obj.area(10.6,10.8,34.9));

    }
}
