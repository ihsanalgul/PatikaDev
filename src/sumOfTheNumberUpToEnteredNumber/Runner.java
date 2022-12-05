package sumOfTheNumberUpToEnteredNumber;

import java.util.Scanner;

/*
Ödev
Java döngüler ile tek bir sayı girilene kadar 
kullanıcıdan girişleri kabul eden ve girilen değerlerden 
çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
*/
public class Runner {
    public static void main(String [] args) {

        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Please enter the numbers: ");

        int sum=0, nextInt;

        do {
            nextInt=scanner.nextInt();
            if (nextInt % 4 ==0) {
                sum+=nextInt;
            }
        } while (nextInt % 2 == 0);

        System.out.println("Sum: "+sum);
        scanner.close();
        
    }
}
