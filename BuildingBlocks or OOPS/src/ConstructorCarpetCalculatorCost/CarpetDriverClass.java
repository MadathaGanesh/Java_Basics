package ConstructorCarpetCalculatorCost;

public class CarpetDriverClass {
    public static void main(String[] args) {
        CarpetClass obj2=new CarpetClass(3.5);
        CarpetObjectClass obj1=new CarpetObjectClass(2.75,4.0);
        CarpetCalculator calc=new CarpetCalculator(obj1, obj2);
        System.out.println("Total : "+calc.getTotalCost());
        obj2 =new CarpetClass(1.5);

    }
}
