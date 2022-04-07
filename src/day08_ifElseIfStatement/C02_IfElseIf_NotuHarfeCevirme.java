package day08_ifElseIfStatement;

import java.util.Scanner;

public class C02_IfElseIf_NotuHarfeCevirme {
    public static void main(String[] args) {
       /* Soru 7) Kullanicidan 100 uzerinden notunu isteyin. Not’u harf sistemine
        cevirip yazdirin.
         50’den kucukse “D”,
          50-60 arasi “C”,
          60-80 arasi “B”,
           80’nin uzerinde ise “A”*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunu giriniz : ");
        Double notSayi = scan.nextDouble();
        if (notSayi < 0 || notSayi > 100) {
            System.out.println("Lutfen gecerli bir not giriniz.");
        }
        if (notSayi < 50) {
            System.out.println("Notunuz D'dir");
        } else if (notSayi >= 50 && notSayi < 60) {
            System.out.println("Notunuz C'dir");
        } else if (notSayi <= 60 && notSayi < 80) {
            System.out.println("Notunuz B'dir");
        } else {
            System.out.println("Notunuz A'dir");
        }
    }
}
