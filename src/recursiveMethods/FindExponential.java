package recursiveMethods;

import java.util.Scanner;

public class FindExponential {
    /*
    Taban değeri giriniz :2
    Üs değerini giriniz : 0
    Sonuç : 1
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = scanner.nextInt();
        System.out.print("Enter exp: ");
        int exp = scanner.nextInt();
        int res = recursiveMethod(base, exp);
        System.out.print("Result = " + res);
    }

    private static int recursiveMethod(int base, int exp) {
        if (exp == 0) {
            return 1;
        } else {
            exp--;
            return base * recursiveMethod(base, exp);
        }
    }
}
