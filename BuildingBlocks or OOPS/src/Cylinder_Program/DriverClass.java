package Cylinder_Program;

public class DriverClass {
    public static void main(String[] args) {
    CircleClass circle=new CircleClass(3.75);
        System.out.println("Circle radius is :: "+circle.getRadius());
        System.out.println("Circle Area is :: "+circle.getArea());
    CylinderClass cylinder;
    cylinder=new CylinderClass(5.55,7.25);
        System.out.println("Cylinder radius is :: "+cylinder.getRadius());
        System.out.println("Cylinder height is :: "+cylinder.getHeight());
        System.out.println("Cylinder area is :: "+cylinder.getArea());
        System.out.println("Cylinder volume is :: "+cylinder.getVolume());
    }
}
