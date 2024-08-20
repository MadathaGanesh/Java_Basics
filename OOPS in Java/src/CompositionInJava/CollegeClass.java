package CompositionInJava;

public class CollegeClass {
    private String CollegeName;
    private String CollegeAddress;
    private LibraryClass library;
    private BranchClass branch;

    public CollegeClass(String CollegeName,String CollegeAddress,LibraryClass library,BranchClass branch){
        this.CollegeName=CollegeName;
        this.CollegeAddress=CollegeAddress;
        this.library=library;
        this.branch=branch;
    }

    public String getCollegeName(){
        return CollegeName;
    }
    public String getCollegeAddress() {
        return CollegeAddress;
    }
    public LibraryClass getLibrary() {
        return library;
    }
    public BranchClass getBranch() {
        return branch;
    }

    public void CollegeDetails(){
        System.out.println("College Details are ...");
        System.out.println("College Name is :: "+getCollegeName());
        System.out.println("College Address is ::"+getCollegeAddress());
        System.out.println("Library name is :: "+getLibrary());
        System.out.println("Branch is ::"+getBranch());
    }

}
