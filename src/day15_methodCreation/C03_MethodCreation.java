package day15_methodCreation;

import java.util.Scanner;

public class C03_MethodCreation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz : ");
        String kelime = scan.next();

        int harfSayisi = kelime.length();
        if (harfSayisi < 3) {
            System.out.println("Kelime cok kısa");
        } else if (harfSayisi == 3) {
            ucHarfTersinecevirme(kelime);
        } else if (harfSayisi == 4) {
            dortHarfTersinecevirme(kelime);
        } else if (harfSayisi == 5) {
            besHarfTersinecevirme(kelime);
        } else {
            System.out.println("Kelime cok uzun");
        }
     //1.)method olusturmak icin method'un adini aziniz
        //2.)Method'a giderken method' goturmen gereken Variable
    }

    public static void besHarfTersinecevirme(String kelime) {
        String tersKelime="";
        tersKelime=kelime.substring(4)+
                kelime.substring(3,4)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
    }

    public static void dortHarfTersinecevirme(String kelime) {
      String tersKelime="";
        tersKelime=kelime.substring(3)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
    }



   public static void ucHarfTersinecevirme(String kelime) {
        String tersKelime="";
        tersKelime=kelime.substring(2)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
    }
}

