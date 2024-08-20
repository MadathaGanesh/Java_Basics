
public class Switch_Challenge_1 {

	// 	Declare a char variable and initialize it with any letter of the english alphabet .
	//  Determine whether the input is a vowel or not using switch case
	public static void main(String[] args) {
		char charvalue='j';
		switch (charvalue) {
		case 'a': case 'A':{
			System.out.println("Vowel a");
			break ;
		}
		case 'e': case 'E':{
			System.out.println("Vowel e");
			break;
		}
		case 'i': case 'I':{
			System.out.println("Vowel I");
			break;
		}
		case 'o': case'O':{
			System.out.println("Vowel O");
			break;
		}
		case 'u': case 'U':{
			System.out.println("Vowel U");
			break;
		}
				
		default:
			System.out.println("Not a vowel");
		}
		
	}
	
}
