public class WhileLoop1 {
    public static void main(String[] args) {

        int i = 2;
        while (i <= 10) {
            System.out.println("Number in correct order is : " + i);
            i++;
        }

        System.out.println("*************************");
            // Using while true
            int reverse = 20;
            while (reverse >= 1) {
                if (reverse % 2 == 0) {
                    System.out.println("The even number in reverse order is : " + reverse);
                }
                reverse--;
            }
        }
    }

