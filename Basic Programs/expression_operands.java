public class expression_operands {
    public static void main(String[] args) {
        // Expression ,operands and operators .
        int exp=((3*2)+(22/3)%3);
        System.out.println("Expression result is : "+exp);
        System.out.println("\n");


        //Pre - Increment and Post - Increment
        int num=10;
        System.out.println("original number :: "+num);
       num=++num;
        System.out.println("Pre-increment number :: "+num);
        num=num++;
        System.out.println("Post-increment value is :: "+num);
        System.out.println(num);
        System.out.println("\n");

        //Pre-Decrement and Post-Decrement

        int res=20;
        System.out.println("original res value is :: "+res);
        int res1=res--;
        System.out.println("Post Decrement value is : "+res1);
        int res2=--res;
        System.out.println("Pre-Decrement value is :: "+res2);
        System.out.println("\n");


        // Boolean datatype
         boolean age=true;
         if (age==false){
             System.out.println("congrats ");
         }
         else {
             System.out.println("Sorry");
         }

    }
}
