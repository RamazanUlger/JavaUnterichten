package day19_whileloop_DoWhileLoop;

import java.util.Scanner;

public class C04_DoWhileloop {
    public static void main(String[] args) {
       /* Kullanicidan toplamak uzere pozitif sayilar isteyin
       , islemi bitirmek icin 0’a basmasini soyleyin.
        Kullanici yanlislikla negative sayi girerse
         o sayiyi dikkate almayin ve “Negatif sayi giremezsiniz”
         yazdirip basa donun
        Kullanici 0’a bastiginda toplam kac pozitif sayi
         girdigini, yanlislikla kac negative sayi
         girdigini ve girdigi pozitif sayilarin
         toplaminin kac oldugunu yazdirin.
    */

        Scanner scan = new Scanner(System.in);
        int sayi;
        int pozitifSayac = 0;
        int negatifSayac=0;
        int toplam = 0;
        do {
            System.out.println("Lutfen pozitif bir tam sayi giriniz\n" +
                    "Cikmak icin 0'a basin");
            sayi = scan.nextInt();
            if (sayi < 0) {
                negatifSayac++;
                System.out.println("Negatif sayi giremezsiniz");
            } else if (sayi > 0) {
                pozitifSayac++;
                toplam += sayi;
            }

        } while (sayi != 0);

        System.out.println("toplam = " + toplam);

        System.out.println("Girdiginiz pozitif sayi adedi = "+pozitifSayac+"\n"+
                "Girdiginiz negatif sayi adedi = "+negatifSayac);
    }

}
