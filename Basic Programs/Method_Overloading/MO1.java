package Method_Overloading;

public class MO1 {
	public static void main(String[] args) {
	String name="Ganesh";
	int age=20;
	char Grade='A';
	float salary=(float) 90000.88;
	Details(name,age,Grade,salary);
	Details(name,age,Grade);
	Details(name,Grade,age);
	Details(name,Grade);
}
	
	// by changing number of arguments 
	public static void Details(String username,int userage,char usergrade,float usersalary) {
		System.out.println("Name is :"+username);
		System.out.println("User age is :"+userage);
		System.out.println("UserGrade is : "+usergrade);
		System.out.println("UserSalary is : "+usersalary+"\n\n");	
	}
	
	public static void Details(String name,int age,char grade) {
		System.out.println("Name is :"+name);
		System.out.println("User age is :"+age);
		System.out.println("UserGrade is : "+grade+"\n\n");
		}
	
	public static void Details(String name,char grade) {
		System.out.println("Name is :"+name);
		System.out.println("UserGrade is : "+grade+"\n\n");
		}
	
	
	
	//By changing datatype 
	public static void Details(String name,char grade,double age) {
		System.out.println("Name is :"+name);
		System.out.println("UserGrade is : "+grade);
		System.out.println("User age is :"+age+"\n\n");
		}
	
}
