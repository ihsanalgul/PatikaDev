package recursiveMethods;

import java.util.Scanner;

public class MethodForThePattern {

    static boolean flag = true;

    static int numberFirst;

    /*
    Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan
    bir "Recursive" metot yazın.

    Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
    Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
    Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
    Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
     */
    public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number= ");
            numberFirst = scanner.nextInt();

            System.out.print(callRec(numberFirst));
        }

        private static int callRec(int number) {
            System.out.print(number + ", ");

            int temp = number;

            if (number <= 0 || !flag) {
                number += 5;
            } else {
                number -= 5;
            }

            if (temp * number < 0 || temp * number == 0) {
                // sayi sıfırı geçti
                flag = false;
            }

            if (numberFirst != number) {
                return callRec(number);
            }

            return number;
        }
}
