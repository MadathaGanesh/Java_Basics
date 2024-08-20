package ConstructorChallenge1;

public class StudObjectClass {
    private String studName;
    private int studRollNo;
    private int StudentClass;
    private String section;


    // Creating Getters
    public String getStudName() {
        return studName;
    }

    public int getStudRollNo() {
        return studRollNo;
    }

    public int getStudentClass() {
        return StudentClass;
    }

    public String getSection() {
        return section;
    }


    // Default Constructor
    public StudObjectClass() {
        this.studName = "Ravi";
        this.studRollNo=10;
        this.StudentClass=6;
        this.section="A";
        System.out.println(" Default Constructor is called");
    }


    // Two parameters should be taken at object creation and remaining two values  should be default
    public StudObjectClass(String studName, int studRollNo) {
        this.studName = studName;
        this.studRollNo = studRollNo;
        this.StudentClass=9;
        this.section="C";
        System.out.println(" Two parameters should be taken at object creation and remaining two values  should be default called :: " );
    }


    //Total Parameterized constructor .all parameters will be taken at object creation
    public StudObjectClass(String studName,int studRollNo,int studentClass,String section){
        this.studName=studName;
        this.studRollNo=studRollNo;
        this.StudentClass=studentClass;
        this.section=section;
        System.out.println("Total Parameterized constructor .all parameters will be taken at object creation CALLED ::: ");
    }
}



