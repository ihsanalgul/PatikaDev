package offerAnActivityAccordingToWeather;

import java.util.Random;

public class Runner {
    /*
    Koşullar :

    Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
    Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
    Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
    Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
    Ödev
    Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
     */
    public static void main(String[] args) {

        Random random = new Random();
        int temp = random.nextInt(30);
        System.out.println("Random temperature = " + temp);

        System.out.println(temp < 6 ? "Kayak" :
                (temp > 6 && temp < 15) ? "Sinema" :
                        (temp > 15 && temp < 25) ? "Piknik" :
                                (temp > 25) ? "Yüzme" : "");

    }
}
