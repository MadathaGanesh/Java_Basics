package MethodOverloading;

public class Basic_Class {
    public double area(double length,double breadth){
        return length*breadth;
    }

    public int area(int length,int breadth){
        return length*breadth;
    }

    public static int area(int length,int breadth,int height){
        return length*breadth*height;
    }

    public static double area(double length,double breadth,double height){
        return length*breadth*height;
    }
}
