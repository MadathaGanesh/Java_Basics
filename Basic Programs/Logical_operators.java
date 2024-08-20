public class Logical_operators {
    public static void main(String[] args) {

        //Logical AND operator .
        String firstname="Madatha";
        String lastname="Ganesh";
        if(firstname=="Madatha" && lastname=="Ganesh")
        {
            System.out.println("First name and Last name is correct ");
        }
        else
        {
            System.out.println("First name and Last name is not correct");
        }
        System.out.println("\n");


        // Logical OR operator .
        String firstname1="Madatha";
        String lastname1="Ganesh";
        if(firstname1=="Madathaa" || lastname1=="Ganeshh")
        {
            System.out.println("First name and Last name is correct ");
        }
        else
        {
            System.out.println("First name and Last name is not correct");
        }
        System.out.println("\n");

        // Logical NOT operator .

        String fullname="Madatha Ganesh";
        if(fullname!="Madatha Ganesh")
        {
            System.out.println("Full Name is incorrect ");
        }
        else
        {
            System.out.println("Full name is correct");
        }
    }
}
