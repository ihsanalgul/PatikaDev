package taximeterCalculator;

import java.util.Scanner;

public class Runner {
    /*
    Taksimetre Programı
    Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

    Taksimetre KM başına 2.20 TL tutmaktadır.
    Minimum ödenecek tutar 20 TL'dir. 20 TL altındaki ücretlerde yine 20 TL alınacaktır.
    Taksimetre açılış ücreti 10 TL'dir.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double perKm = 2.20;
        int startingAmount = 10;

        System.out.print("Enter current amount = ");

        int currentKm = scanner.nextInt();
        double currentAmount = startingAmount + currentKm * perKm;
        double total = currentAmount < 20 ? 20 : currentAmount;

        System.out.println("Current Amount = " + currentAmount);

        System.out.println("Total = " + total);

    }
}
