package factorial;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");

        int result = 1, nextInt = scanner.nextInt();

        for (int i = 1; i <= nextInt; i++) {
            result *= i;
        }

        System.out.println(nextInt + "!: " + result);

        scanner.close();
    }
}
