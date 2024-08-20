package MatrixAddition;

public class DriverClass {
    public static void main(String[] args) {
        addition();
        subtraction();
        multiplication();
    }

    // Matrix Addition
    public static void addition(){
        int a[][] = {{1, 2, 3}, {4, 7, 5}, {9, 7, 4}};
        int b[][] = {{4, 10, 11}, {1, 20, 21}, {10, 21, 43}};
        int sum[][] = new int[3][3];  // 3 rows and 3 columns
        System.out.println("Addition of two matrices is  ::");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                System.out.println(sum[i][j]+" ");
            }
            System.out.println();
        }
    }


    // Matrix subtraction
    public static void subtraction() {
        int c[][] = {{2, 4,5}, {8,9,7}};
        int d[][] = {{1,4, 3}, {5,2,6}};
        int sub[][] = new int[2][3];      // 2 rows and 3 columns
        System.out.println("Differences of two matrices is ::");
        for (int k=0;k<2;k++){
            for (int x=0;x<3;x++){
                sub[k][x]=c[k][x]-d[k][x];
                System.out.println(sub[k][x]+" ");
            }
            System.out.println("\n");
        }
    }

    // Matrix multiplication

   public static void multiplication(){
        int a[][]={{2,4},{5,4}};
        int b[][]={{5,6},{1,3}};
        int mul[][]=new int[2][2];   // 2 rows and 2 columns
       System.out.println("Multiplication of two arrays is :: ");
       for (int i=0;i<2;i++){
           for (int j=0;j<2;j++) {
               mul[i][j] = 0;
               for (int k = 0; k < 2; k++) {
                   mul[i][j] = mul[i][j] + a[i][k] * b[k][j];
               }
               System.out.println(mul[i][j] + " ");
           }
           System.out.println();
       }
   }
}
