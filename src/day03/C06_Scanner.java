package day03;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {


//Kullanicidan isim ve soyismini aliniz ve aralarinda bir bosluk biracak sekilde yazdiriniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi yaziniz : " );
        String isim=scan.next();
        System.out.println("Soyiminizi yaziniz : ");
        String soyIsim=scan.next();
        System.out.println("Isminiz : "+isim+"\n" + "Soyisiminiz : "+soyIsim);

    }
}
