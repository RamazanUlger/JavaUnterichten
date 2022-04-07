package day07_ifElseStatement;

import java.util.Locale;
import java.util.Scanner;

public class C04_HaftaIciHaftaSonu {
    public static void main(String[] args) {
        /*Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        Ornek:  gun=Pazar output = “Hafta sonu”
        gun=Sali output = “Hafta ici”
 *** String icin equals method’unu kullanin
        */
        //cumartesi pazarsa hafta sonu
        //diger gunler hafta ici olarak tanimlanir.
        //String Case sensetive'dir.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gunismini yaziniz : ");
        String gunIsmi = scan.nextLine();
        gunIsmi = gunIsmi.toLowerCase();
        //String ifadelerde equals kullanilmaz ******

        if (gunIsmi.equals("pazar")
                || gunIsmi.equals("cumartesi")) {
            System.out.println("Haftasonu");
        }
        if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali")
                || gunIsmi.equals("carsamba")
                || gunIsmi.equals("persembe")
                || gunIsmi.equals("cuma")) {
            System.out.println("Haftaici");
        }

    }
}
