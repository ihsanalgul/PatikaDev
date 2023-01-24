

/*
Ödev
Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

Örnek : 1643 = 1 + 6 + 4 + 3 = 14
 */
public class Runner {

    public static void main(String[] args) {
        int number = 1643;
        int result = 0, temp = 0;

        while (number != 0) {
            System.out.println(number);
            temp = number % 10;
            result += temp;
            number /= 10;
        }

        System.out.println("Result:" + result);
    }

}