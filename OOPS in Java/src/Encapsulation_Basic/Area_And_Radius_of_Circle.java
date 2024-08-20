package Encapsulation_Basic;

public class Area_And_Radius_of_Circle {
    /*
    Suhani recently learnt the concept of encapsulation, helping her in writing a code to find the area and radius of the circle using encapsulation.
     */
    private double radius;
    private static double pi=3.14;

    public Area_And_Radius_of_Circle(double radius){
        this.radius=radius;
    }



    public double getRadius() {
        return radius;
    }

    public void display(){
        double areaOfCircle=2*pi*radius;
        double radiusOfCircle=pi*radius*radius;
        System.out.println(" Area of circle :: "+areaOfCircle);
        System.out.println("Radius of circle :: "+radiusOfCircle);
    }


}
