import java.util.Scanner;

/*
  Printing Tables using Scanner Class
 */
public class TablesScannerClass {
    public static void main(String[] args) {
        PrintTheTable();


    }
    public static void PrintTheTable(){
        System.out.println("Please enter the number for which you want to print the table : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=10;i++){
            int table=n*i;
            System.out.println( n +" * "+ i + " = "+ table);
        }
    }

}
