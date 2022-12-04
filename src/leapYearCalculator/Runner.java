package leapYearCalculator;

import java.util.Scanner;

/**
 * Runner
 */
public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;

        System.out.println("Yıl Giriniz : ");
        year = scanner.nextInt();

        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " bir artık yıldır !");
        } else if (year % 100 != 0 && year % 4 == 0) {
            System.out.println(year + " bir artık yıldır !");
        } else {
            System.out.println(year + " bir artık yıldır değildir !");

        }
        scanner.close();
    }
}