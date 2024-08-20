    /* Declare a string variable student_name and a int variable student_score.
    calculate student division by using student_score variable . Student division can be calculated as :
              if student_score>=80, print "A" division
              else if student_score >=60 and <80, print "B" division
              else if student_score>=40 and <60, print "C" division
              else if student_score<40, print "F" division.

     */



public class method_challenge {
    public static void main(String[] args) {

        /*
        String student_name="SAI";
        int student_marks=67;
        System.out.println("Student Name is :: "+student_name);
        if(student_marks>=80){
            System.out.println("Grade : A");
        } else if (student_marks>=60 && student_marks<80) {
            System.out.println(" Grade : B");
        } else if (student_marks>=40 && student_marks<60) {
            System.out.println("Grade : C");
        }
        else {
            System.out.println("Grade F");
        }


         */


        String student_name="SAI";
        int student_marks=67;
        String Grade;
        System.out.println("Student Name is :: "+student_name);
        if(student_marks>=80){
         Grade="A Grade";
        } else if (student_marks>=60 && student_marks<80) {
         Grade="B Grade";
        } else if (student_marks>=40 && student_marks<60) {
            Grade="C Grade ";
        }
        else {
            Grade="F Grade";
        }
        System.out.println("Grade of Student is :: "+Grade);
    }
}



