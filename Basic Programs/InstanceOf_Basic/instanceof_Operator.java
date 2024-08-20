package InstanceOf_Basic;
/*
Here, if objectName is an instance of className, the operator returns true. Otherwise, it returns false.
 */
public class instanceof_Operator {
    public static void main(String[] args) {
        String name="Hello";
        boolean res=name instanceof String;
        System.out.println("name is an instanceof string :: "+res);

        Object num=123;
        boolean res1=num instanceof String;
        System.out.println("num is an instanceof string :: "+res1);


    }
}
