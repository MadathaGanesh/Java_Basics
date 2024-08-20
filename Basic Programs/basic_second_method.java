public class basic_second_method {
    public static void main(String[] args) {

        // Assigning values of length and breadth and calling method .
        area_of_rect(20,15);
    }
    // Creating a method with parameters with void datatype and static keyword .

    public static  void area_of_rect(double length ,double breadth){
    double area=length*breadth;
    double perimeter=2*(length+breadth);
        System.out.println("Area of rectangle : "+area);
        System.out.println("Perimeter of rectangle : "+perimeter);
    }
}
