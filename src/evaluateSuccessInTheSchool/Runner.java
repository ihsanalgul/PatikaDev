package evaluateSuccessInTheSchool;

import java.util.Scanner;

public class Runner {
    /*
    Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

    Geçme Notu : 55

    Ödev
    Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lessons = {"Matematik", "Fizik", "Türkçe", "Kimya", "Müzik"};
        int temp;
        int average = 0;
        int counter = 0;


        for (String w : lessons) {
            System.out.println("Please enter grade for "+w + " lesson ");
            temp = scanner.nextInt();
            if (temp < 100 && temp > 0) {
                ++counter;
                average += temp;
                average /= counter;
            }
        }

        if (average >= 55) {
            System.out.println("The student pass the class successfully!\nAverage = " + average);
        } else System.out.println("The student failed! Average: "+average+"\nAverage must be 55 to pass in minimum.");

    scanner.close();
    }
}
