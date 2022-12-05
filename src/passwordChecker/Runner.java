package passwordChecker;

import java.util.Objects;
import java.util.Scanner;
/*
Ödev
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini
kontrol edip ,
şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
Sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
 */

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerPass = new Scanner(System.in);

        String password = "myPassw0rd!!";
        String nextStep = "";
        String newPass;

        System.out.print("Please enter your password\n\nPassword: ");
        String enteredPass = scanner.nextLine();

        if (!password.equals(enteredPass)) {
            System.out.println("Entered password is not correct! Do you want to reset your password?\nYes(Y) or No(N)");
            nextStep = scanner.next();
        } else {
            System.out.println("Welcome Mr. John Doe !");
        }

        if (Objects.equals(nextStep, "Y") || Objects.equals(nextStep, "y")) { // I know, I know!
            System.out.println("Please enter new password: ");
            newPass = scannerPass.nextLine();
            if (newPass.equals(password)) {
                System.out.println("Password cannot be created. Please try again.");
            } else {
                password = newPass;
                System.out.println("Password successfully changed!\n Your new password is -> " + password);
            }
        }

        scanner.close();
        scannerPass.close();
    }
}
