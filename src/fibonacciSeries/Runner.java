package fibonacciSeries;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        int prev,curr;

        List<Integer> fibo = new ArrayList<>();

        fibo.add(0);
        fibo.add(1);

        for (int i = 0; i < 10; i++) {

            prev=fibo.get(i);

            curr=fibo.get(i+1);

            fibo.add(prev+curr);
        }

        System.out.println("Fibonacci Serie = " + fibo);
    }
}
