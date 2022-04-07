package day14_stringManipulation;

import java.util.Locale;

public class C04_IsimGizleme {
    public static void main(String[] args) {
      /*  *Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi
        yazdirin
        isim-soyisim : M***** B*******
        kart no : **** **** **** 1234*/
    String isim="Ramazan";
    String soyismin="Ülger";
    String kKNummer="123456789123456";
    String yeniIsim=isim.substring(0,1).toUpperCase()+
            isim.substring(1).replaceAll("\\S","*");
    String yeniSoyisim=soyismin.substring(0,1).toUpperCase()+
            soyismin.substring(1).replaceAll("\\S","*");
    String yeniKKNo=kKNummer.substring(12).replaceAll("\\S","*");

        System.out.println(yeniIsim+"\n"+yeniSoyisim);
    }
}
