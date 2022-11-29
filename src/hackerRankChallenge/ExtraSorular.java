package hackerRankChallenge;

public class ExtraSorular {
    public static void main(String[] args) {

        int a = 20, b = 10;
        if ((a < b) && (b++ < 25)) { // && op. sonrası karşılaştırma işlemi yapılmaz
                                    // ve b = 10 değerini korur.
            System.out.println(a);
        } else {
            System.out.print(a);
        }
        System.out.println(b);
    }
}
