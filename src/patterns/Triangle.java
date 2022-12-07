package patterns;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the line number: ");

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            //    System.out.print(i + " ");
            for (int j = n - i; j > 0; --j) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2*i-1; j++) {
            System.out.print("*");
            }

            System.out.println("");

        }

        scanner.close();

    }
}