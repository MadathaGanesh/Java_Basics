public class Conditional_Operators {
    public static void main(String[] args) {
        // If statement .
        int age=19;
        if(age>=18)
        {
            System.out.println("You are eligible for vote");
            System.out.println("\n");
        }

        //If - else Statement .

        String username="Ganesh";
        String password="Ganesh@123";
        if(username.equals("Ganesh") && password.equals("Ganesh@123"))
        {
            System.out.println("Credentials are correct");
            System.out.println("\n");

        }
        else
        {
            System.out.println("Enter correct Credentials ");
            System.out.println("\n");
        }

        //If -elif-else statement .

        int num=347;
        if(num%2==0){
            System.out.println("Number divisible by 2");
        }
        else if(num%5==0){
            System.out.println("Number divisible by 5");
        }
        else
        {
            System.out.println("Number divisible by 1 and itself ");
        }


    }
}
