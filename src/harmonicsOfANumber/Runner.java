package harmonicsOfANumber;

import java.util.Scanner;

/*
 * Java ile girilen sayının harmonik serisini bulan program yazacağız.

Harmonik Seri Formülü :

    1 + (1/2) + (1/3) (1/4)... +(1/n) 

 */

public class Runner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter the number: ");
        double nextInt = scanner.nextDouble();

        double result=1.0;

        for (double i = 2; i <= nextInt; i++) {
            
            result+=(1/i);
        }

        System.out.println("Harmonics: "+result);      
        
        
        
        scanner.close();
    }
}
