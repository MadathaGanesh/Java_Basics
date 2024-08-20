package SettersAndGettersStudentMarks;

public class DriverClass {
    public static void main(String[] args) {
    ObjectClass obj=new ObjectClass();

    // With firstname and lastname
    obj.setFirstname("Ganesh ");
    obj.setLastName("Madatha");
    obj.setMarks(98);
    System.out.println("First name and Last Name is : "+obj.getfullname());
    System.out.println("Pass or Not :  " + obj.ispass());
    System.out.println("*********");

    // No Firstname and lastname
        obj.setFirstname("");
        obj.setLastName("");
        obj.setMarks(130);
        System.out.println("NO First name and NO Last Name is : "+obj.getfullname());
        System.out.println("Pass or Not :  " + obj.ispass());
        System.out.println("*********");


     // With firstname but no lastname
     obj.setFirstname("RamCHARAN");
     obj.setLastName("");
     obj.setMarks(12);
     System.out.println("With firstname but no lastname : "+obj.getfullname());
     System.out.println("Pass or Not :  " + obj.ispass());
     System.out.println("*********");


    // With lastname but No firstname
        obj.setFirstname("");
        obj.setLastName("MAdatha");
        obj.setMarks(45);
        System.out.println("With lastname but No firstname: "+obj.getfullname());
        System.out.println("Pass or Not :  " + obj.ispass());
        System.out.println("*********");
    }
}
