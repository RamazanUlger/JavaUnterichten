package day18_nestedForLoop;

import java.util.Random;
import java.util.Scanner;

public class C09_WhileLoop {
    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        Scanner scan = new Scanner(System.in);
        Random rastGele=new Random();
        System.out.println("Lutfen tahmin edilmessi istenen sayiyi giriniz : ");
        int tahmin = scan.nextInt();
        int sayac = 0;
       int computer = rastGele.nextInt(0,100); ;
        while (tahmin != computer) {
            tahmin = scan.nextInt();
            if (tahmin < computer) {
                System.out.println("Lutfen daha buyuk sayi giriniz!");
            } else if (tahmin > computer){
                System.out.println("lutfen daha kucuk bir sayigiriniz!");
            }
            sayac++;
        }
        System.out.println("Tebrikler sayiyi buldunuz"+"\n"+"Toplam tahmin sayisi : "+sayac);

    }
}

