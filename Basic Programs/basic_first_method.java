public class basic_first_method {
    public static void main(String[] args) {
        // Creating a methods using static keyword

        //calling details method and accessing data  from details() method .
        // As there is static keyword in details() method we need not to be create object again.
        details();

    }

    //creating a method named details with void datatype .
    public static void details(){
        String name="My name is Ganesh ";
        int age=20;
        System.out.println(name);
        System.out.println(" Age :: "+age);
    }


}
