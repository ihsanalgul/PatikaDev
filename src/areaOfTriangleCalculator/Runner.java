package areaOfTriangleCalculator;

import java.util.Scanner;

public class Runner {
    /*
    Dik Üçgende Hipotenüs Bulan Program
    Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
    
    Ödev
    Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
    
    Formül
    Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
    
    𝑢 = (a+b+c) / 2
    
    Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int u;
        int A;

        // Step-1: Scanner
        System.out.print("Enter 1st side of the triangle = ");
        int a = scanner.nextInt();

        System.out.print("Enter 2nd side of the triangle = ");
        int b = scanner.nextInt();

        System.out.print("Enter 2nd side of the triangle = ");
        int c = scanner.nextInt();

        // Step-2: Calculate
        u = (a + b + c) / 2;

        A = u * (u - a) * (u - b) * (u - c);

        // Step-3: Print result
        System.out.println("Area of the triangle = " + Math.sqrt(A));
    }
}
