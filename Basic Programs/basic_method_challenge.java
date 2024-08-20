public class basic_method_challenge {
    public static void main(String[] args) {
        // QUESTION :: Declare a string containing a student name ,
        // declare  a larger integer variable containing marks of student between 1 to 100.
        String stud_name = "Ganesh";
        int stud_marks=89;

        char studGrade=grade_calculator(stud_marks);
        display(stud_name,studGrade);
    }

    //Create a method to calculate the grade of a student based on marks .
    public static char grade_calculator(int marks){
        char Grade;
        if (marks>90 && marks<=100){
        Grade = 'O' ;
         }
        else if (marks>80 && marks<90) {
        Grade='A' ;
        }
        else if (marks>70 && marks<80) {
        Grade='B';
        }
        else {
            Grade='F';
        }
        return Grade;
    }

    //Then finally create another method to display the student name and grade .
    public static void display(String name ,char studentGrade){
        System.out.println("Student Name is :"+name);
        System.out.println("Student Grade is :"+studentGrade);
    }

}
