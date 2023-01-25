package reverseTrianglePattern;

public class Runner {
    public static void main(String[] args) {

        /*

        ******* 7*          0b      1.line(n)
         *****  5*          1b      2.line
          ***   3*          2b      3.line
           *    1*          3b      4.line

       formula: 2n-2i       n-1     n


         */

        int n=10;

        for (int i = 0; i <= n; i++) {

            // space
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            // '*' sign
            // 2*4-2*0 = 8 -> 7 (2*n-2*i)
            // 2*4-2*1 = 6 -> 5
            // 2*4-2*2 = 4 -> 3
            // 2*4-2*3 = 2 -> 1
            for (int j = 1; j < 2*n-2*i; j++) {
                System.out.print("*");
            }

            // jump to the next-line
            System.out.println();

        }

    }
}
