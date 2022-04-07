package day12_stringManipulation;

public class C02_LastIndexOf {
    public static void main(String[] args) {
        /*    Kullanicidan bir cumle ve bir kelime isteyin,
    kelimenin cumledeki kullanimina bakarak asagidaki
     3 cumleden uygun olani yazdirin
     - Girilen kelime cumlede kullanilmamis.
     - Girilen kelime cumlede 1 kere kullanilmis.
     - Girilen kelime cumlede 1’den fazla kullanilmis.*/

        String cumle = "Java ogren, yeni bir program ile yeni bir sayfa ac";
        String kelime = "yeni";
        int ilkKullanim = cumle.indexOf(kelime);
        System.out.println(ilkKullanim);
        int sonkullanim=cumle.lastIndexOf(kelime);
        System.out.println(sonkullanim);
        if (ilkKullanim ==-1) {
            System.out.println(" Girilen kelime cumlede kullanilmamis.");
        }    else if (ilkKullanim == sonkullanim) {
            System.out.println(" Girilen kelime cumlede 1 kere kullanilmis.");
        }else{
            System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis.");
        }

        String str="Eclipse";
        System.out.println(str.lastIndexOf("p"));
    }
}
