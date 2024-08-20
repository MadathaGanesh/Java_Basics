
/*
Create a integer variable kiloBytes and take a input from the user in kiloBytes.
 Now, create a method named  printMegaBytes(int kiloBytes) and convert the kiloBytes into MegaBYtes.
For example, if we divide the Kilobytes by 1024 , It will give the Megabytes(MB).


* */
import java.util.Scanner;

public class Byte_Convertion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value in KILOBYTES ::");
        int kilobytes=sc.nextInt();

        convert_to_kv(kilobytes);
        convert_to_mb(kilobytes);

    }

    public static void convert_to_mb(int kb){
    // 1MB = 1024 KB
        int mb=kb*1024;
        System.out.println("Value in MB is :: "+mb);
    }

    public static void convert_to_kv(int mb){
        // 1KB=1/1024MB
        int kb=mb%1024;
        System.out.println("Value in KB IS :: "+kb);
    }


}
