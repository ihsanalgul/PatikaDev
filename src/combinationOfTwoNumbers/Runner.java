package combinationOfTwoNumbers;

import java.util.Scanner;
import factorial.*;
/*
 * Ödev
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
 N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.

Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)
 */

public class Runner {
    public static void main(String[] args) {
        int result = 1;

        Scanner scannerOfN = new Scanner(System.in);
        System.out.println("Please enter n: ");
        int N = scannerOfN.nextInt();

        int factorialOfN = Factorial.factorial(N);// n!

        Scanner scannerOfR = new Scanner(System.in);
        System.out.println("Please enter r: ");
        int R = scannerOfR.nextInt();

        int factorialOfR = Factorial.factorial(R);// (r)!

        int factorialOfNR = Factorial.factorial(N - R);// (n-r)!

        // Kombinasyon formülü C(n,r) = n! / (r! * (n-r)!)
        result = factorialOfN / (factorialOfR * factorialOfNR);

        System.out.println("Result: " + result);

        scannerOfN.close();
        scannerOfR.close();
    }
}
