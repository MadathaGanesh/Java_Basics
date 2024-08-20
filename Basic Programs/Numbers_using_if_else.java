/*
Write a method called printNumberInWord.
 The method has one parameter number which is the whole number.
  The method needs to print "ZERO", "ONE", "TWO", ... "NINE",
  "OTHER" if the int parameter number is 0, 1, 2, .... 9 or other
  for any other number including negative numbers.
  You can use if-else statement or switch statement whatever is easier for you.
 */
public class Numbers_using_if_else {
    public static void main(String[] args) {
        printNumberInWord(0);
        printNumberInWord(-34);
        printNumberInWord(2);
        printNumberInWord(34);
    }

    public static void printNumberInWord(int wholenumber){
        if(wholenumber==0){
            System.out.println("Zero");
        } else if (wholenumber==1) {
            System.out.println("One");
        } else if (wholenumber==2) {
            System.out.println("TWO");
        } else if (wholenumber==3) {
            System.out.println("Three");
        } else if (wholenumber==4) {
            System.out.println("Four");
        } else if (wholenumber==5) {
            System.out.println("Five");
        } else if (wholenumber==6) {
            System.out.println("Six");
        } else if (wholenumber==7) {
            System.out.println("Seven");
        }else if(wholenumber==8){
            System.out.println("Eight");
        }else if(wholenumber==9){
            System.out.println("Nine");
        } else if (wholenumber<=0) {
            System.out.println("Negative number");
        }else{
            System.out.println("Invalid Number");
        }
    }
}
