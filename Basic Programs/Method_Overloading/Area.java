package Method_Overloading;
/*
Write a method named area with one double parameter named radius.
The method needs to return a double value that represents the area of a circle.
If the parameter radius is negative then return -1.0 to represent an invalid value.
Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.
The method needs to return an area of a rectangle.
If either or both parameters is/are a negative return -1.0 to indicate an invalid value.
For formulas and PI value please check the tips below.
Examples of input/output:
area(5.0); should return 78.53975
 area(-1);  should return -1 since the parameter is negative
 area(5.0, 4.0); should return 20.0 (5 * 4 = 20)
 area(-1.0, 4.0);  should return -1 since first the parameter is negative
TIP: The formula for calculating the area of a rectangle is x * y.
TIP: The formula for calculating a circle area is radius * radius * PI.
TIP: For PI use a constant from Math class e.g. Math.PI
*/
public class Area {
    public static void main(String args[]){
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0,4.0));
        System.out.println(area(-1.0,4.0));
    }
    public static double area(double radius) {
        if (radius < 0) {
            double invalid_value=-1;
            return invalid_value;
        } else {
            double pi=3.14;
            double area_of_circle=pi*radius*radius;
            return area_of_circle;
        }
    }

    public static double area(double length,double breadth) {
        if ((length< 0)||(breadth<0)) {
            double invalid_value = -1;
            return invalid_value;
        } else {
            double area_of_rect = length*breadth;
            return area_of_rect;
        }
    }



    }
