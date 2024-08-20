package SettersAndGettersFullNames;
/*
Write a class with the name Name. The class needs two fields (instance variables) with names firstName and lastName both of type string.
Write the following methods (instance methods):
Method named getFirstName without any parameter, it needs to return the value of firName field.
Method name getLastName without any parameter, it needs to return the value of lastName field.
Method named setFirstName with one parameter of type string, it needs to set the value of firstName field.
Method named setLastName with one parameter of type string, it needs to set the value of lastName field.
Method named getName without any parameters, it need to return the full name i.e. “firstName space lastName”.
For example ,
setFirstName(“Sudhir”)-> set the value of firstName as “Sudhir”.
setLastName(“Dhangar”)-> set the value of lastName as “dhangar”.
getName()-> it will return the full name as “Sudhir Dhangar”.
 */
public class DriverClass {
    public static void main(String[] args) {
       ObjectClassNames obj=new ObjectClassNames();
       obj.setFirstName("Madatha  ");
       obj.setLastName(" Ganesh");

        System.out.println("First name and Last name is :"+obj.getname());
    }
}
