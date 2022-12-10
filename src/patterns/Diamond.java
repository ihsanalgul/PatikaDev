package patterns;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the line number: ");

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            // System.out.print(i + " ");
            for (int j = n - i; j > 0; --j) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println("");

        }

        for (int i = 1; i <= n; i++) {
            // boşluk
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // yıldız
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

        System.out.println();

        scanner.close();

    }
}