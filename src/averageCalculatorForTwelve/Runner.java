package averageCalculatorForTwelve;

import java.util.Scanner;

/*
Ödev
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
 */
public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");

        int averageOfTwelve = 0, counter = 0, nextInt = scanner.nextInt();

        for (int i = 0; i < nextInt; i++) {
            if (i % 12 == 0) {
                counter++;
                averageOfTwelve += i;
            }
        }
        scanner.close();

        System.out.println("Result: "+averageOfTwelve);
    }

}