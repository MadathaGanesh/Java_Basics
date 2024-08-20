package Cuboid_Program;
/*
Write a class with the name Cuboid that extends Rectangle class.
 The class needs two field (instance variables) with name height of type double and rectangle of type Rectangle.
The class needs to have one constructor with two parameters: rectangle of type Rectangle and height of type double.
  In case the height parameter is less than 0 it needs to set the height field value to 0.
Write the following methods (instance methods):
Method named getHeight without any parameters, it needs to return the value of height field.
 Method named getVolume without any parameters, it needs to return the calculated volume. To calculate volume, multiply the area with height.
 */
public class CuboidClass extends RectangleClass {
     double height;
     RectangleClass rectangle;
    public CuboidClass(RectangleClass rectangle, double height) {
        if (height < 0)
            this.height = 0;
        else
            this.height = height;
        this.rectangle = rectangle;
}


    public double getHeight(){
            return height;
    }

    public double getVolume(){
        double volume=rectangle.getArea()*getHeight();
        return volume;
    }
}
