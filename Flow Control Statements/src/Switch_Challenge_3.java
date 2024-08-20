import java.util.Scanner;

/*
(Find the number of days in a month)
 Write a program that prompts the user to enter the month and year
 and displays the number of days in the month.
 For example, if the user entered month 2 and year 2012,
 the program should display that February 2012 has 29 days.
  If the user entered month 3 and year 2015, the program should display that March 2015 has 31 days.
 */
public class Switch_Challenge_3 {
    public static boolean isLeapYear(int year){
        if((year%4==0 && year%100!=0) ||(year%400!=0) )
        {
            return true;
        }else {
            return false;
        }
    }

    public static void getDaysInMonth(int month,int year){
        if(month<1 ||month>12){
            System.out.println("Invalid Month");
        }
        if(year<1||year>9999){
            System.out.println("Invalid Year");
        }
        switch (month){
            case 1:{
                System.out.println("January "+year+" has 31 Days");
                break;
            } case 2:{
                System.out.println("February "+year+ " has " +(isLeapYear(year)?"29 Days":"28 Days"));
                break;
            } case 3:{
                System.out.println("March "+year+" Has 31 Days");
                break;
            } case 4:{
                System.out.println("April "+year+" Has 30 Days");
                break;
            } case 5:{
                System.out.println("May "+year+" Has 31 Days");
                break;
            }case 6:{
                System.out.println("June "+year+" Has 30 Days");
                break;
            } case 7:{
                System.out.println("July "+year+" Has 31 Days");
                break;
            }case 8:{
                System.out.println("August "+year+" Has 30 Days");
                break;
            } case 9:{
                System.out.println("September "+year+" Has 31 Days");
                break;
            }case 10:{
                System.out.println("October "+year+" Has 30 Days");
                break;
            } case 11:{
                System.out.println("November "+year+" Has 31 Days");
                break;
            } case 12:{
                System.out.println("December "+year+" has 30 Days");
                break;
            } default:{
                System.out.println("Please enter correct year and month");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year : ");
        int year=sc.nextInt();
        System.out.println("Enter Month : ");
        int month= sc.nextInt();
        getDaysInMonth(month,year);

    }
}
