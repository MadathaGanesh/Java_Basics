package ComplexOperation;

public class DriverClass {
    public static void main(String[] args) {
        ComplexClass c1=new ComplexClass(4,-8);
        c1.printComplex();

        ComplexClass c2=new ComplexClass(5,7);
        c2.printComplex();

        ComplexClass add=new ComplexClass();
        add=add.AddComplex(c1,c2);
        System.out.println("Addition of complex numbers is : ");add.printComplex();
        
        ComplexClass sub=new ComplexClass();
        sub=sub.SubtractComplex(c1,c2);
        System.out.println("Subtraction of Complex NUmbers is : ");sub.printComplex();
    }
}
