public class integer_datatype {
    public static void main(String[] args) {
        // Finding Maximum_Range of Integer Datatype .
        int max_range=Integer.MAX_VALUE;
        System.out.println("Maximum value of Integer Datatype is :: " + max_range);
        // Finding Minimum_Range of Integer Datatype .
        int minimum_range=Integer.MIN_VALUE;
        System.out.println("Minimum value of Integer Datatype is :: " +minimum_range);

        //Adding some value to Maximum_Value

        int sum_value=max_range+1;
        System.out.println("After adding the value is becomes minimum value:: " +sum_value);

        int difference_value=minimum_range-1;
        System.out.println("After subtracting the value is becomes maximum value :: "+difference_value);
    }
}
