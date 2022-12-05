package exponentialsOfANumber;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter the number: ");
        int nextInt = scanner.nextInt();
        int result=1;

        System.out.println("Please enter the exponential: ");
        int exponential = scanner.nextInt();

        for (int i = 1; i <= exponential; ++i) {
            result*=nextInt;
        }


        System.out.println("Result: "+result);

        scanner.close();

    }
}
