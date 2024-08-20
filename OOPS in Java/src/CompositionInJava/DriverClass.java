package CompositionInJava;

public class DriverClass {

    // We can display one class properties with the help of object of another class object 
    public static void main(String[] args) {
        StudentClass stud1=new StudentClass("Ganesh","Warangal",83749554);
        SessionClass session1=new SessionClass("2018",stud1);  // Passing stud1 as a reference
        BranchClass branch1=new BranchClass("CSM",new SessionClass("2020",new StudentClass("Sai","Karimnagar",34332343)));
        //BranchClass branch1=new BranchClass("CSM",session1);
        FloorClass floor1=new FloorClass(4,"2000");
        LibraryClass libraray1=new LibraryClass(25000.0,1600,floor1);
        CollegeClass college1=new CollegeClass("Vaagdevi","Bollikunta",libraray1,branch1);
        UniversityClass university1=new UniversityClass("JNTU",college1);
       // university1.getCollege().CollegeDetails();
        university1.getCollege().getBranch().BranchDetails();
        session1.SessionDetails();
        //university1.getCollege().getBranch().getSession().SessionDetails();
        //session1.getStudent().studDetails();
        //university1.getCollege().getLibrary().getFloor().getFloorCapacity();

    }
}
