package primeNumbers;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        /*
        Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
         */

        List<Integer> primeList = new ArrayList<>();


        int counter = 0;
        for (int i = 1; i < 101; i++) {

            //Is there any divider up to i for i
            // 1 can divide every number
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    // counter eq. 0 prime number
                    counter++;
                }
            }

            if (counter == 0) {
                primeList.add(i);
            }
            counter = 0;
        }

        System.out.println(primeList);
    }
}
