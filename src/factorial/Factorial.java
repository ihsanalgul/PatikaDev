package factorial;

public class Factorial {
    public static int factorial(int nextInt) {
        int result = 1;

        for (int i = 1; i <= nextInt; i++) {
            result *= i;
        }

        return result;
    }
}
