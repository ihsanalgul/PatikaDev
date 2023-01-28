package recursiveMethods;

import java.util.Scanner;

public class FindPrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int div = 2;

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        evaluateNumber(number, div);
    }

    private static void evaluateNumber(int number, int divider) {
        if (number < 2) {
            System.out.println("Not a Prime Number");
        } else if (number == 2) {
            System.out.println("Prime number");
        } else if (number % divider != 0) {
            ++divider;
            if (divider < number) {
                evaluateNumber(number, divider);
            } else {
                System.out.println("Prime number");
            }
        } else System.out.println("Not a Prime Number");

    }
}
