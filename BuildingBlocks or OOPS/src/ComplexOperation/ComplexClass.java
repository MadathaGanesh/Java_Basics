package ComplexOperation;
/*
A complex number is a number that can be expressed in the form a+bi, where a and b are real numbers, and i is a solution of equation x2=-1.
Write a program to Add and subtract  two complex numbers by creating a class Complex number in which :
The complex numbers will be initialized with the help of the constructor.
The addition and subtraction will be performed with the help of function calling.
  Example :
Input : a1= 4 b1=8 a2=5 b2=7
Output : Sum = 9+ i15 Difference = -1+i
Explanation:
(4 + i8) + (5 + i7)
= (4 + 5) + i(8 + 7)
= 9 + i15 (4 + i8) - (5 + i7)
= (4 - 5) + i(8 - 7)
= -1 + i
 */
public class ComplexClass {
    int real, imaginary;
    public ComplexClass(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexClass() {
    }
    ComplexClass AddComplex(ComplexClass c1,ComplexClass c2){
        ComplexClass temp=new ComplexClass();
        temp.real=c1.real+c2.real;
        temp.imaginary= c1.imaginary+c2.imaginary;
        return temp;
    }

    ComplexClass SubtractComplex(ComplexClass c1,ComplexClass c2){
        ComplexClass temp=new ComplexClass();
        temp.real= c1.real-c2.real;
        temp.imaginary=c1.imaginary-c2.imaginary;
        return temp;
    }

    void printComplex(){
        System.out.println("Complex Number is : "+ real + " + "+ imaginary +" i");
    }


}
