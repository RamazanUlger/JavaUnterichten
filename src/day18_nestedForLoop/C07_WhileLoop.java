package day18_nestedForLoop;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {
        //kullanicidan kac sayi toplamak istedigini alin
        //bu sayilarin toplamini ekrana yazdirin

        int sayiAdedi=3;
        Scanner scan =new Scanner(System.in);
        int sayi=0;
        int toplam=0;
        for (int i = 1; i <=sayiAdedi ; i++) {
            System.out.println("Lutfen bir sayi giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("girilen sayi adedi " + sayiAdedi + " sayinin toplami " + toplam);
//****************************************
        //While Loop ile
        //**************************
        sayi=0;
        toplam=0;
        int sayac=0;
        while (sayac<=sayiAdedi){
            System.out.println("Lutfen bir sayi giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;
            sayac++;
        }
        System.out.println("girilen sayi adedi " + sayiAdedi + " sayinin toplami " + toplam);

    }
}
