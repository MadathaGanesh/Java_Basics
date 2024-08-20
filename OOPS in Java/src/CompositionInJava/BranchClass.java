package CompositionInJava;

public class BranchClass {
    private String Branch;
    private SessionClass session;

    public BranchClass(String branch, SessionClass session) {
        Branch = branch;
        this.session = session;
    }

    public String getBranch() {
        return Branch;
    }

    public SessionClass getSession() {
        return session;
    }

    public void BranchDetails(){
        System.out.println("Branch name is ::"+getBranch());
    }

}
