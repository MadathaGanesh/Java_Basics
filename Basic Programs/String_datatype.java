public class String_datatype {
    public static void main(String[] args) {

        //String is a collection of sequence of characters .
        String str1="Hello My name is Ganesh";
        System.out.println("Details are ::"+str1);
        String str2="I am from Shivanagar";
        System.out.println("Address is :: "+str2);
        String str3="Thank You ";
        System.out.println("Last statement is : "+str3);

        //Concatenating str1 and str2
        String concat=str1+str2;
        System.out.println("Conactenated statement is : "+concat);

        //Concatenating str1 and integer / double /float etc
        int i1=392;
        double d1=394.8459d;
        float f1=834.343f;
        String res=str1 +" "+ i1 +" "+str2 + " "+f1+" "+str3+" "+d1;
        System.out.println("Total statement is :: "+res);


    }
}
