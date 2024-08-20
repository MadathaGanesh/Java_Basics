package CompositionInJava;

public class UniversityClass {
    private String UniversityName;
    private CollegeClass college;

    public UniversityClass(String universityName, CollegeClass college) {
        UniversityName = universityName;
        this.college = college;
    }

    public String getUniversityName() {
        return UniversityName;
    }
    public CollegeClass getCollege() {
        return college;
    }

    public void UniversityDetails(){
        System.out.println("University name is :: "+getUniversityName());
        System.out.println("College is :: "+getCollege());
    }

}
