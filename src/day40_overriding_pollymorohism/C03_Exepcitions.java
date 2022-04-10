package day40_overriding_pollymorohism;

import java.util.Scanner;

public class C03_Exepcitions {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int sayi1;
        int sayi2;
        int sonuc=0;
     /*
    System.out.println("Bolmek istediginiz sayiyi giriniz : ");


        System.out.println("Kaca bolmek istediginizi yaziniz :");
       /*
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	at day40_overriding_pollymorohism.C03_Exepcitions.main(C03_Exepcitions.java:12)
     *********
     Sayi2 0 girildiginide sayi1/0 tanimsiz olacagi icin
     Java bu drum ile karsilansinca Exepcition  verir
     Javanin yazidigi exeptcition mesejinda ne tur bir sorun oldugu



         */
        int control=0;
        while (control!=2){
            System.out.println("Bolmek istediginiz sayiyi giriniz : ");
            sayi1= scan.nextInt();
            System.out.println("Kaca bolmek istediginizi yaziniz :");
            sayi2= scan.nextInt();


            try {
            sonuc=sayi1/sayi2;

            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Devam etmek icin 1 \n" +
                    "Bitirmek icin  2' bas!");
            System.out.println("Sonuc : "+sonuc);
        }

        System.out.println("Sonuc : ");


    }
}
