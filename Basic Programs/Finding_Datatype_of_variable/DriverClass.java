package Finding_Datatype_of_variable;

import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args) {
        // Declaring variables

        int intdata;
        char chardata;
        String stringData;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string value :: ");
        stringData=sc.next();
        System.out.println("Enter integer value :: ");
        intdata=sc.nextInt();
        System.out.println("Enter char data ::");
        chardata=sc.next().charAt(0);
        System.out.println("Enter name :");
        Object obj=sc.nextInt();

        System.out.println(stringData + " is of datatype ::" + ((Object)stringData).getClass().getSimpleName());
        System.out.println(intdata + " is of datatype ::"+ ((Object)intdata).getClass().getSimpleName());
        System.out.println(chardata + " is of datatype :: "+ ((Object)chardata).getClass().getSimpleName());
        System.out.println(obj + " is of datatype :: "+((Object)obj.getClass().getSimpleName()));
    }
}
