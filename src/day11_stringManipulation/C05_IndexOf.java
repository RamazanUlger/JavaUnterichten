package day11_stringManipulation;

import java.util.Scanner;

public class C05_IndexOf {
    public static void main(String[] args) {
        String str = "Java bir baska guzel valla cok guzel ";
        System.out.println(str.indexOf('J'));//0
        System.out.println(str.indexOf("l"));//19
        System.out.println(str.length() - 1);//19

        //iaterserk char olarak verdiginiz  bir harfin indexini dondurur
        // istersek bir hsrf yada metin olarak verdigimiz Stringin indexini dondurur


        //ayni harften yada metinden birden fazla varsa
        System.out.println(str.indexOf('b'));//5. indexi dondurur
        //Verilen Srtingdeki 2. ayni harfi bulalaim
        int ilkIndex = str.indexOf('b');
        System.out.println(str.indexOf('b', ilkIndex + 1));//9. indexi verir
     int sonindex=str.indexOf("guzel");
        System.out.println(str.indexOf("guzel",sonindex+1));
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen mail adresinizi giriniz");
        String eMail=scan.nextLine();

        if (eMail.indexOf('@')==-1) {

            System.out.println("Gecedrsiz mail");
        }else{
            System.out.println("Gecerli mail");
        }
    }
}
