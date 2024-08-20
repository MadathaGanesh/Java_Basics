
public class Switch_case {

	public static void main(String[] args) {
		int num=3;
		switch(num) {
		case 1:
		{
			System.out.println("The number is 1");
			System.out.println("The addition is :"+(10+num));
			break;
		}
		case 2:
		{
			System.out.println("The number is 2");
			System.out.println("The Multiplied value is "+(8*num));
			break;
		}
		
		case 3:{
			System.out.println("The number is 3");
			System.out.println("The subtracted value is "+(10-num));
			break;
			
		}
		case 4:{
			System.out.println("The number is 4");
			System.out.println("The divided value is : "+(20/num));
			break;
		}
		case 5:{
			System.out.println("The number is 5");
			System.out.println("The remainder value is "+(39%num));
			break;
		}
		default:{
			System.out.println("This is default statement");
			System.out.println("This default statement will execute if none of condition is true");
			break;
		}
		}

	}

}
