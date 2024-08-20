public class WrapperClasses {
    public static void main(String[] args) {
        autoboxing();
        unboxing();
    }
    public static void autoboxing(){
        // Below all are primitive datatypes
        int a=10;
        byte b=8;
        short s=1;
        long l=1243L;
        double d=12.42;
        char c1='E';
        boolean bool=true;
        // Converting primitive datatypes to Wrapper Classes
        Integer intvalue=a;
        Byte byteValue=b;
        Short shortvalue=s;
        Long longvalue=l;
        Double doublevalue=d;
        Character charvalue=c1;
        Boolean boolvalue=bool;
        System.out.println("Autoboxing :: converting primitive datatype to objects ");
        System.out.println("Integer Object value is :: "+intvalue);
        System.out.println("Byte Object value is :: "+byteValue);
        System.out.println("Short Object value is :: "+shortvalue);
        System.out.println("Long object value is :: "+longvalue);
        System.out.println("Double Object value is :: "+ doublevalue);
        System.out.println("Character Object value is :: "+charvalue);
        System.out.println("Boolean Object value is :: "+boolvalue);
    }


    public static void unboxing(){
        // Converting Object to Primitive Datatype
        Integer i=101;
        Boolean bool=false;
        Character ch='H';
        Float f=12.5f;
        Double d=120.43d;
        Short s=122;
        Long l=2314L;
        Byte b=12;

        int ivalue=i;
        boolean booleanvalue=bool;
        char charvalue=ch;
        float fvalue=f;
        double doublevalue=d;
        short shortvalue=s;
        long longvalue=l;
        byte bytevalue=b;
        System.out.println("Unboxing :: Converting objects to Primitive datatype ");
        System.out.println(" integer PDT value is :: "+ivalue);
        System.out.println(" boolean PDT value is :: "+booleanvalue);
        System.out.println(" char PDT value is :: "+charvalue);
        System.out.println(" float PDT value is :: "+fvalue);
        System.out.println(" double PDT value is :: "+doublevalue);
        System.out.println(" short PDT value is :: "+shortvalue);
        System.out.println(" long PDT value is :: "+longvalue);
        System.out.println(" byte PDT value is :: "+bytevalue);
    }
}
