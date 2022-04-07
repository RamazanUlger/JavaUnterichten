package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplaminiBulma {
    public static void main(String[] args) {
        //Kullanicidan aldiginiz 4 basamakli bir sayinin
        //rakamlar toplamini bulunuz
        int rakam;
        rakam=0;
        int rakamlarToplami;
        rakamlarToplami=0;
        Scanner scan=new Scanner(System.in);
        int s1;
        System.out.println("Lutfen 4 basamakli bir sayi giriniz.");
        s1= scan.nextInt();
        rakam=s1%10;
        rakamlarToplami+=rakam;
        s1/=10;
        rakam=s1%10;
        rakamlarToplami+=rakam;
        s1/=10;
        rakam=s1%10;
        rakamlarToplami+=rakam;
        s1/=10;
       rakam=s1%10;
       rakamlarToplami+=rakam;
        System.out.println(rakamlarToplami);


    }
}
