package findTheMaxAndMin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicIntegerArray;

/*
 * Kaç tane sayı gireceksiniz: 4
1. Sayıyı giriniz: 16
2. Sayıyı giriniz: -22
3. Sayıyı giriniz: -15
4. Sayıyı giriniz: 100
En büyük sayı: 100
En küçük sayı: -22
 */

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //min and max
        AtomicIntegerArray arr = new AtomicIntegerArray(2);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        List<Integer> numList= new ArrayList<>();

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.print(i+1+".Sayıyı giriniz: ");
            numList.add(scanner.nextInt());
            System.out.println(numList);
        } 



        arr.addAndGet(0, min);
        arr.addAndGet(1, max);

        System.out.println(arr);
        

        numList.forEach(x -> {
            if(x < arr.get(0)) {arr.getAndSet(0, x);}
            if(x > arr.get(1)) {arr.getAndSet(1, x);}
        });


        System.out.println(arr);
        

        System.out.println("Min: "+arr.get(0));

        System.out.println("Max: "+arr.get(1));


        scanner.close();
    }
}
