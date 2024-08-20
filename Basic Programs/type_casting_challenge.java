public class type_casting_challenge {
    public static void main(String[] args) {
     // Declare an int variable ,short variable , byte variable and assign them with some values .
     // Finally declare a long variable which is equal to 1000 times the sum of above three .

        short s=15;
        byte b=10;
        int i=5;
        long l=1000*(s+b+i);
        System.out.println( "Result Long value is : "+l);

        // converting the result into short datatype

        short s1=(short) (1000*(s+b+i));
        System.out.println("Short value is : "+s1);
    }
}
