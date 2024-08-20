package CompositionInJava;

public class StudentClass {
    private String studentName;
    private String StudAddress;
    private long StudPhoneNumber;

    // Creating Constructor
    public StudentClass(String studentName,String studAddress,long studPhoneNumber){
        this.studentName=studentName;
        this.StudAddress=studAddress;
        this.StudPhoneNumber=studPhoneNumber;
    }

    public String getStudentName(){
        return studentName;
    }
    public String getStudAddress(){
        return StudAddress;
    }
    public long getStudPhoneNumber() {
        return StudPhoneNumber;
    }

    public void studDetails(){
        System.out.println("Stud name is :: "+getStudentName());
        System.out.println("Stud Address is ::"+StudAddress);
        System.out.println("Stud phone number is :: "+getStudPhoneNumber());
    }

}
