package palindromeNumbers;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();

        String str = String.valueOf(number);

        StringBuilder reverseStr = new StringBuilder();

        int strLength = str.length();

        for (int i = (strLength - 1); i >= 0; --i) {
            reverseStr.append(str.charAt(i));
        }

        if (str.equalsIgnoreCase(reverseStr.toString())) {
            System.out.println(str + " is a Palindrome String.");
        } else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }
}
