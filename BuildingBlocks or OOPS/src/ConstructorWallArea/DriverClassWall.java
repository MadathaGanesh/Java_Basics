package ConstructorWallArea;

public class DriverClassWall {
    public static void main(String[] args) {
    ObjectClassWall obj=new ObjectClassWall();
        System.out.println("Default constructor area is : "+obj.getArea());

        ObjectClassWall obj1=new ObjectClassWall(10,20);
        System.out.println("Parameterized constructor 1 value is : "+obj1.getArea());

        ObjectClassWall obj2=new ObjectClassWall(0,20);
        System.out.println("Parameterized constructor value 2 is : "+obj2.getArea());

        ObjectClassWall obj3=new ObjectClassWall(10,0);
        System.out.println("Parameterized constructor 3 value is : "+obj3.getArea());

        ObjectClassWall obj4=new ObjectClassWall(0,0);
        System.out.println("Parameterized constructor value is : "+obj4.getArea());

        ObjectClassWall obj5=new ObjectClassWall();
        obj5.setWidth(10.0);
        obj5.setHeight(20.0);
        System.out.println("obj 5 Area is : "+obj5.getArea());
    }
}
