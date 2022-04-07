package day11_stringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class C04_Length {
    public static void main(String[] args) {
        //Kullanicidan ismini alip bas Harfini ve son harfini
        //yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz : ");
        String isim=scan.nextLine();
        System.out.println("Girdiginiz isim : " + isim);
        System.out.println("ilk harf " + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));
        System.out.println("son harf : "+ isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim.length()-1));



    }
}
