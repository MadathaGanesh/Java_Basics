import java.util.Scanner;

public class method_challenge_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name ::");
        String student_name = sc.next();
        System.out.println("Student name is :: "+student_name);
        System.out.println("Enter Student Marks :: ");
        int student_marks = sc.nextInt();
        if (student_marks >= 80) {
            System.out.println("Grade : A");
        } else if (student_marks >= 60 && student_marks < 80) {
            System.out.println(" Grade : B");
        } else if (student_marks >= 40 && student_marks < 60) {
            System.out.println("Grade : C");
        } else {
            System.out.println("Grade F");
        }
    }
}
