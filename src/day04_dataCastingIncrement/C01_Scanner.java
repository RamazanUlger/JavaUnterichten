package day04_dataCastingIncrement;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
        //Kullanicidan ismini alip bas hafini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz : " );
        char ilkHarf =scan.next().charAt(0);
        System.out.println("Isminizin ilkharfi : "+ilkHarf);
    }
}
