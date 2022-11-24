package greenGrocery;

import java.util.Scanner;

public class Runner {
    /*
    Manav Kasa Programı
    Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre
    toplam tutarını ekrana yazdıran programı yazın.

    Meyveler ve KG Fiyatları

    Armut : 2,14 TL
    Elma : 3,67 TL
    Domates : 1,11 TL
    Muz: 0,95 TL
    Patlıcan : 5,00 TL
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "    Meyveler ve KG Fiyatları\n" +
                        "    Armut :    2,14 TL\n" +
                        "    Elma :     3,67 TL\n" +
                        "    Domates :  1,11 TL\n" +
                        "    Muz:       0,95 TL\n" +
                        "    Patlıcan : 5,00 TL\n"+".....");

        // Kaç kg istersiniz
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.0, weight, totalPrice = 0;
        System.out.print("Kaç kg armut = ");
        weight = scanner.nextDouble();
        totalPrice += weight * armut;

        System.out.print("Kaç kg elma = ");
        weight = scanner.nextDouble();
        totalPrice += weight * elma;

        System.out.print("Kaç kg domates = ");
        weight = scanner.nextDouble();
        totalPrice += weight * domates;

        System.out.print("Kaç kg muz = ");
        weight = scanner.nextDouble();
        totalPrice += weight * muz;

        System.out.print("Kaç kg patlican = ");
        weight = scanner.nextDouble();
        totalPrice += weight * patlican;

        // Toplam Fiyatı göster.
        System.out.printf("....."+"\nToplam: %.2f",totalPrice);
        System.out.print(" TL.");
    }
}
