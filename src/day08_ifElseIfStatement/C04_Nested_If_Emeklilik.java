package day08_ifElseIfStatement;

import java.util.Scanner;

public class C04_Nested_If_Emeklilik {
    public static void main(String[] args) {
        /*Eger calisan kadinsa 60 yasindan buyuk
        oldugunda emekli olabilir,
                calisan erkekse 65 yasindan buyukse
        emekli olabilir*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetiniz giriniz.\n Kadin icin 'K' \n" +
                "Erkek icin 'E' giriniz...");
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz : ");
        double yas = scan.nextDouble();
        if (yas < 0 || yas > 120) {
            System.out.println("Lutfen girdiginiz yas degerini kontrol ediniz");
        } else if (cinsiyet == 'K') {
            if (yas <= 60) {
                System.out.println("Emekli olamazsiniz");
            } else {
                System.out.println("Emekli olabilirsiniz");
            }

        } else if (cinsiyet == 'E') {
            if (yas <= 65) {
                System.out.println("Emekli olamazsiniz");
            } else {
                System.out.println("Emekli olabilirsiniz");
            }
        }
    }
}
