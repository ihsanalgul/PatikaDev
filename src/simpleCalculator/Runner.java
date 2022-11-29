package simpleCalculator;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("Please select the operation by entering order number");
        System.out.println("1- Sum +");
        System.out.println("2- Subtraction -");
        System.out.println("3- Multiplication x");
        System.out.println("4- Division /");

        int op = scanner.nextInt();

        System.out.println("Enter 1st number: ");
        int a = scanner.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = scanner.nextInt();

        System.out.println("Result: " + calculate(a, b, op));
        scanner.close();
    }

    private static int calculate(int a, int b, int op) {
        switch (op) {
            case 1:
                return a + b;
            case 2:
                return a - b;
            case 3:
                return a * b;
            case 4:
                return a / b;
        }
        return 0;
    }
}
