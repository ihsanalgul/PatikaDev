package ebobEkok;

import java.util.Scanner;

/**
 * Runner
 */
public class Runner {

    public static void main(String[] args) {
        int x=0,y=0;
        Scanner scanner= new Scanner(System.in);

        int ebob=0,temp;

        System.out.println("Enter x:");
        x= scanner.nextInt();

        System.out.println("Enter y:");
        y= scanner.nextInt();


        System.out.printf("\033[1;31m Ebob-Ekok for %d and %d\n\033[0m", x, y); 
     

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

