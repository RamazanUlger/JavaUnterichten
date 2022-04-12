package day42_exceptions;

import java.util.Scanner;

public class C03_IllegalArgumetException {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi isteyin
        kullanici yas olarak negatif bir sayi,
        0 veya 120'den buyuk bir sayi girerse
        IllegalArgumetException olusacak sekilde
        bir proram yaziniz

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfe yasinizi giriniz");
        int yas=scan.nextInt();
        if (yas< 0 || yas >120) {
            //System.out.println("Lutfen gecerli bir yas giriniz");
            //Java bizim istedigimiz durumlarda Exception firlatabilir
            throw new IllegalArgumentException();

        }
    }
}
