package Method_Overloading;

public class MO_Challenge {

	public static void main(String[] args) {
		int length=5;
		int breadth=4;
		double height=3.5;
		
		area(length);
		area(length,breadth);
		area(breadth,height);

	}
	
	public static void area(int sq_length) {
		double sq_area=sq_length*sq_length;
		System.out.println("Square area is :"+sq_area);
		
	}
	
	public static void area(int rect_length,int rect_breadth) {
		double rect_area=rect_length*rect_breadth;
		System.out.println("Rectangle area is :"+rect_area);
	}
	
	public static void area(int tri_breadth,double tri_height) {
		double tri_area=0.5*tri_height*tri_breadth;
		System.out.println("Triangle area is :"+tri_area);
	}
	

}
