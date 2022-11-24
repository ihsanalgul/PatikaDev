package areaOfCircleCalculator;

import java.util.Scanner;

public class Runner {
    /*
    Dairenin Alanını ve Çevresini Hesaplayan Program
    Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

    Alan Formülü : π * r * r;

    Çevre Formülü : 2 * π * r;

    Ödev
    Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

    𝜋 sayısını = 3.14 alınız.

    Formül : (𝜋 * (r*r) * 𝛼) / 360
     */
    public static void main(String[] args) {
        double pi = 3.14;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius = ");
        double r = scanner.nextDouble();

        System.out.println("Area: " + pi * r * r);
        System.out.printf("Perimeter: %.2f \n", 2 * pi * r);

        System.out.print("Enter angle for the partial area of the circle: ");
        double angle = scanner.nextDouble();


        System.out.printf("The partial area of the circle = %.2f", ((pi * r * r * angle) / 360));

        scanner.close();
    }
}
