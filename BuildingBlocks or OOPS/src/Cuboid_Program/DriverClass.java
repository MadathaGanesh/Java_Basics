package Cuboid_Program;

public class DriverClass {
    public static void main(String[] args) {
        RectangleClass rect=new RectangleClass(2,3);
        System.out.println("Rect length is :: "+rect.getLength());
        System.out.println("Rect width is :: "+rect.getWidth());
        System.out.println("Rect area is :: "+rect.getArea());

        CuboidClass cuboid =new CuboidClass(rect,5);
        System.out.println("Cuboid height is :: "+cuboid.getHeight());
        System.out.println("Cuboid volume is :: "+cuboid.getVolume());
    }
}
