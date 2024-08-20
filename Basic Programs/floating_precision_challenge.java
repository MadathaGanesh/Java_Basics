public class floating_precision_challenge {
    public static void main(String[] args) {
        //Calculate the quantity of petrol and diesel in a budget
        // of 1546.12 Rs according to respective prices 84.11, 74.91

        float petrol_price=84.11f;
        float diesel_price=74.91f;
        float total_amount=1546.12f;
        float petrol_quality=total_amount/petrol_price;
        float diesel_quality=total_amount/diesel_price;
        System.out.println("Floating petrol Quality :: "+petrol_quality);
        System.out.println("Floating Diesel Quality ::"+diesel_quality);
        System.out.println("\n");

        double petrol_price1=84.11d;
        double diesel_price1=74.91d;
        double total_amount1=1546.12d;
        double petrol_quality1=total_amount1/petrol_price1;
        double diesel_quality1=total_amount1/diesel_price1;
        System.out.println("Double petrol Quality :: " + petrol_quality1);
        System.out.println("Double Diesel Quality :: " + diesel_quality1);


    }
}
