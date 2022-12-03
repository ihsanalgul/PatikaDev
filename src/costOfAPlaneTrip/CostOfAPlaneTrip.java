package costOfAPlaneTrip;

import java.util.Scanner;

/*Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. 
Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. 

Mesafe başına ücret 0,10 TL / km olarak alın. 

İlk olarak uçuşun toplam fiyatını hesaplayın
 ve sonrasındaki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. 
Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.

Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.

Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.

Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.

Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır. */


public class CostOfAPlaneTrip {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int distance=0, way=0;
        float perKm=0;

        try {
            System.out.println("Please enter distance: ");
            distance= scanner.nextInt();
            System.out.println("Please enter one-way and return as 1 or 2: ");
            way= scanner.nextInt();
            System.out.println("Enter cost per km:");
            perKm=scanner.nextFloat();

        } catch (Exception e) {
            System.out.println("Hatalı Veri Girdiniz !");
        }
        


        double toplamUcret= distance*perKm*way;

        System.out.println("Toplam ucret: "+toplamUcret);

    }
}