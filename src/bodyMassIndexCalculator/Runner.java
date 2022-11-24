package bodyMassIndexCalculator;

import java.util.Scanner;

public class Runner {
    /*
    Vücut Kitle İndeksi Hesaplama
    Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
    Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

    Formül
    Kilo (kg) / Boy(m) * Boy(m)
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Body Mass Index Calculator");

        System.out.println("Enter height: ");
        double height = scanner.nextDouble();

        System.out.println("Enter weight: ");
        double weight = scanner.nextDouble();

        System.out.println("Your body mass index is " + weight / (height * height));

    }
}
