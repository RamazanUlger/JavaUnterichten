package day07_ifElseStatement;

import java.util.Locale;
import java.util.Scanner;

public class C07_HaftaninGunleri {
    public static void main(String[] args) {
         /*Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        Ornek:  gun=Pazar output = “Hafta sonu”
        gun=Sali output = “Hafta ici”
 *** String icin equals method’unu kullanin
        */
        //cumartesi pazarsa hafta sonu
        //diger gunler hafta ici olarak tanimlanir.
        //String Case sensetive'dir.
        //****Eger kullanici gunismini yanlis girerse
        //"Yanlsi Giris" yazdirsin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gunismi  giriniz : ");

        String gunIsmi = scan.nextLine().toLowerCase();
        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")) {
            System.out.println("Girdiginiz gun hafta sonuna denk gelmektedir.");

        } else if (gunIsmi.equals("pazartesi") ||
                gunIsmi.equals("sali") ||
                gunIsmi.equals("carsamba") ||
                gunIsmi.equals("persembe") ||
                gunIsmi.equals("cuma")) {
            System.out.println("Girdiginiz gun haftaicine denk gelmektedir.");
        } else {
            System.out.println("Hatali bir giris yaptiniz. ");

        }

    }
}
