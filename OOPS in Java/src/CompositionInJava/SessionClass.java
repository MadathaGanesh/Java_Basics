package CompositionInJava;

public class SessionClass {
    // Session also known as YearofPassing
    private String sessionName;
    private StudentClass student;

    public SessionClass(String sessionName, StudentClass student) {
        this.sessionName = sessionName;
        this.student = student;
    }

    public String getSessionName() {
        return sessionName;
    }

    public StudentClass getStudent() {
        return student;
    }

    public void SessionDetails(){
        System.out.println("Session name is :: "+getSessionName());
    }

}
