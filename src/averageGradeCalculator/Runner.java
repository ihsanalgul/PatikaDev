package averageGradeCalculator;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        double average;

        Scanner scanner = new Scanner(System.in);

        System.out.println(" - - - Average Grade Calculator -");
        System.out.println("= = = = = = = = = = = = = = = = = = =");

        System.out.print("Enter Math grade: ");
        Lesson math = new Lesson(Enums_Lesson.Math, scanner.nextFloat());

        System.out.print("Enter Music grade: ");
        Lesson music = new Lesson(Enums_Lesson.Music, scanner.nextFloat());

        System.out.print("Enter Chemistry grade: ");
        Lesson chemistry = new Lesson(Enums_Lesson.Chemistry, scanner.nextFloat());

        System.out.print("Enter History grade: ");
        Lesson history = new Lesson(Enums_Lesson.History, scanner.nextFloat());

        System.out.print("Enter Physic grade: ");
        Lesson physic = new Lesson(Enums_Lesson.Physic, scanner.nextFloat());

        System.out.print("Enter Foreign Language grade: ");
        Lesson forLang = new Lesson(Enums_Lesson.ForeignLang, scanner.nextFloat());

        scanner.close();

        average = (math.getGrade() +
                music.getGrade() +
                chemistry.getGrade() +
                history.getGrade() +
                physic.getGrade() +
                forLang.getGrade()) / 6;

//        average = Math.random() * 100;
        System.out.printf("Ortalamanız = %.2f \n", average);
        System.out.println(average > 60 ? "Geçtiniz!" : "Sınıfta Kaldı!");
    }
}