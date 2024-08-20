
public class switch_case_1 {
	public static void main(String[] args) {
		char char1='l';
		switch (char1) {
		case 'A': {
			System.out.println(" Char is A");
			System.out.println("The multiplied value is : "+(char1*3));
			break;
		}
		case 'B':{
			System.out.println("The char is "+char1);
			break;
		}
		case 'G':{
			System.out.println("The char value is : GANESH");
			break;
		}
		default:
			System.out.println("This is default value ");
			break;
		}
	
	
	String str1="GaneSH";
	switch (str1.toUpperCase()) {  // we Can covert case value to lower case or upper case .
	case "pranay": {
		System.out.println("Name is "+str1);
		break;
	}
	case "ganesh":{
		System.out.println("The string is in lower case");
		break;
	}
	case "GaneSH":{
		System.out.println("This is mixed case ");
		break;
	}
	case "GANESH":{
		System.out.println("THE STRING IS IN UPPER CASE");
		break;
	}
	default:
		throw new IllegalArgumentException("Unexpected value: " + str1);
	}
	}

}
