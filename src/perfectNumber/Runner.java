import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Runner
 */
public class Runner {

    public static void main(String [] args) {

        /*
        Mükemmel Sayı Nedir ?
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.*/

        Scanner scanner=new Scanner(System.in);

            System.out.println("Please enter a number to understand \n   if it is Perfect Number or Not!");

        
        int number = scanner.nextInt();

        List<Integer> posDividers=new ArrayList<>();

        for (int i = 1; i <+ number; i++) {
            if (number % i == 0) {
                posDividers.add(i);
            }
        }

        int sum=0;

        for (int i = 0; i < posDividers.size(); i++) {
            sum+=posDividers.get(i);
        }

        if (sum == number) {
            System.out.println("Perfect Number !");
        } else {
            System.out.println("Not Perfect Number !");
        }

        scanner.close();

    }
}