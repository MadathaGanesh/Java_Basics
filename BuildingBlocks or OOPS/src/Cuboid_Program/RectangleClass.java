package Cuboid_Program;
/*
1.Write a class with the name Rectangle The class needs two fields (instance variable) with names length and width of type double.
The class needs to have one constructor with parameters length and width of type double and it needs to initialize the fields.
In case the length parameter is less than 0 it needs to set the length field value to 0.Similarly if width parameter is less than 0 it needs to set the width field value to 0.
Write the following methods (instance methods):
Method named getLength without any parameters, it needs to return the value of length field.
Method named getWidth without any parameters, it needs to return the value of width field.
Method named getArea without any parameters, it needs to return the calculated area (length*width).
 */
public class RectangleClass {
     double length;
   double width;

    public RectangleClass(double length, double width) {
        if (length<0) {
            this.length = 0;
        }
        else{
            this.length=length;
            }
       if (width<0) {
           this.width = 0;
       }else {
        this.width = width;
    }}

    public RectangleClass() {
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea(){
        double area=length*width;
        return area;
    }
}

