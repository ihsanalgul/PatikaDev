package orderThreeNumbers;

import java.util.Arrays;
import java.util.Random;

public class Runner {
    /*
    Ödev
    Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
     */
    public static void main(String[] args) {
        Random random = new Random();
        int number1 = random.nextInt(1000);
        int number2 = random.nextInt(1000);
        int number3 = random.nextInt(1000);

        int[] res = new int[3];

        swapNumbers(number1, number2, number3, res);

        swapNumbers(number2, number1, number3, res);

        swapNumbers(number3, number2, number1, res);


        System.out.print(number1);
        System.out.print(" " + number2);
        System.out.println(" " + number3);

        System.out.println(Arrays.toString(res));

    }

    private static void swapNumbers(int number1, int number2, int number3, int[] res) {
        if (number1 < number2 && number1 < number3) {
            res[0] = number1;
            if (number2 < number3) {
                res[1] = number2;
                res[2] = number3;
            } else {
                res[1] = number3;
                res[2] = number2;
            }
        }
    }


}
