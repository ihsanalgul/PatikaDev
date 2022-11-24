package taxCalculator;

import java.util.Scanner;

public class Runner {
    /*
    KDV Tutarı Hesaplayan Program
    Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını
    ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

    (Not : KDV tutarını 18% olarak alın)

    KDV'siz Fiyat = 10;

    KDV'li Fiyat = 11.8;

    KDV tutarı = 1.8;

    Ödev
    Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
    tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı
    hesaplayan programı yazınız.
     */

    public static void main(String[] args) {
        double taxAppliedAmount = 0, tax = 0;

        // 1.step: Scanner amount
        Scanner scanner = new Scanner(System.in);
        double amount;

        System.out.print("Enter amount = ");

        amount = scanner.nextDouble();

        // 2.step: calculation

        if (amount > 0 && amount < 1000) {
            taxAppliedAmount = amount * 1.18;
            tax = amount * 0.18;
        }

        if (amount > 1000) {
            taxAppliedAmount = amount * 0.08;
            tax = amount * 0.08;
        }


        // 3.step: print result to the console
        System.out.println("Tax Applied Amount = " + taxAppliedAmount + " TL");

        System.out.println("Tax = " + tax + " TL");

    }
}
