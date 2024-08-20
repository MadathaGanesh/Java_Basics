import java.util.Scanner;

public class area_of_Rectangle {
    public static void main(String[] args) {
        // Calculate perimeter of rectangle .

        float length=34.23f;
        double breadth=54.334d;
        double perimeter_of_rect = 2 * (length + breadth);
        System.out.println("Area of rectangle :: "+perimeter_of_rect);

        // Calculate area of rectangle

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length1 ::");
       double length1=sc.nextDouble();
        System.out.println("Enter breadth1 :: ");
        double breadth1=sc.nextDouble();
        double area_of_rect=length1*breadth1;
        System.out.println("Area of rectangle : "+area_of_rect);


    }
}
