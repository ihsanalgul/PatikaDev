package ebobEkok;

import java.util.Scanner;

/**
 * Runner
 */
public class Runner {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int x,y;

        int ebob=0,temp;

        x= scanner.nextInt();

        y= scanner.nextInt();
     
        System.out.printf("Ebob-Ekok for %d and %d", x,y);

        if (x>y) {
            temp=y;
        } else {
            temp=x;
        }

        for (int i = 1; i <= temp; i++) {
            if (x % i == 0 && y % i == 0) {
                ebob=i;
            }
        }

        System.out.println("Ebob: "+ ebob);

        int ekok=x*y/ebob;

        System.out.println("Ekok: "+ekok);

        scanner.close();
        
    }
    
}

