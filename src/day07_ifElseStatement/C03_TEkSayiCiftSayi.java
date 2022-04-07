package day07_ifElseStatement;

import java.util.Scanner;

public class C03_TEkSayiCiftSayi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz : ");
    int sayi= scan.nextInt();
        if (sayi%2 == 0) {
            System.out.println("Girdiginiz sayi tektiktir : ");
        }
        if (sayi%2!=0 ) {
            System.out.println("girdiginiz sayi teksayidir.");
        }
        if (sayi%2 == 0) {
            System.out.println("Girdiginiz sayi ciftsayidir. ");
        }else {
            System.out.println("Girdiginiz sayi teksayidir.");
        }

        }
}
