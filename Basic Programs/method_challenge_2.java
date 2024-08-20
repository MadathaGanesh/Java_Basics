import java.util.Scanner;

public class method_challenge_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student name :");
        String name=sc.nextLine();
        System.out.println("Enter marks ::");
        int marks=sc.nextInt();


        char res=grade_cal(marks);
        result(name,res);
    }

    public static char grade_cal(int marks1){
        char grade;
        if(marks1>80){
            grade='A';
        } else if (marks1>65) {
            grade='B';
        }
        else {
            grade='F';
        }
        return grade;
    }


    public static void result(String name,char grade){
        System.out.println("Student name is :: "+name);
        System.out.println("Student Grade is :: "+grade);
    }

}
