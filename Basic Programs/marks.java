// QUESTION :: Declare a string containing a student name ,
// declare  a larger integer variable containing marks of student between 1 to 100.

//Create a method to calculate the grade of a student based on marks .

//Then finally create another method to display the student name and grade .
public class marks {
    public static void main(String[] args) {
        String name="sai";
        int marks=88;
        System.out.println("Name is :: "+name);
        grade_calculator(marks);

    }
    public static void grade_calculator(int marks){
        if(marks>90 && marks<100){
            System.out.println(" O Grade");
        } else if (marks>80 && marks<90) {
            System.out.println("A Grade");
        }
        else {
            System.out.println("Fail");
        }
    }

}
