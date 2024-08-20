public class Type_Casting {
    public static void main(String[] args) {
        // Converting an integer value to float value .
        int a=10;
        System.out.println("Integer Value is : "+a);
        float f=(float)(a);
        System.out.println("Float Value is :: "+f);
        System.out.println("\n");

        // Converting a double value to integer value .
        double d=30.5564;
        System.out.println("Double Value is : "+d);
        int i=(int)(d);
        System.out.println("Integer value is ::" +i );
        System.out.println("\n");

        // Converting a short value to long datatype .
        Short s=394;
        System.out.println("Short Value is :: "+s);
        long l=(long)(s);
        System.out.println("Long value is :: "+l);
        System.out.println("\n");

        // Converting a long value to short value .
        long l1=343265432;
        System.out.println("Long value is : "+l1);
        short s1=(short) (l1);
        System.out.println("Short Value is :: "+s1);
        System.out.println("\n");
    }
}
