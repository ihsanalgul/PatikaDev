package calculateExpOfFourAndFive;

import java.util.Scanner;

/*
Ödev
Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
 */
public class Runner {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter the number: ");
        int nextInt = scanner.nextInt();

        for (int i = 1; i < nextInt; i*=4) {
            System.out.print(i+",");
        }
        
        for (int i = 1; i < nextInt; i*=5) {
            System.out.print(i+",");
        }

        scanner.close();
    }
}