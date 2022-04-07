package day15_methodCreation;

public class C09_MethodCreation {
    public static void main(String[] args) {
          /*  *Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi
        yazdirin
        isim-soyisim : M***** B*******
        kart no : **** **** **** 1234*/
        String isim="Ramazan";
        String soyismin="Ülger";
        String kKNummer="123456789123456";
        isimSoyisimGizle(isim,soyismin);



    }

    public static void kKGizleme(String kKNummer) {
        String yeniKKNo=kKNummer.substring(12).replaceAll("\\S","*");

    }

    public static void isimSoyisimGizle(String isim, String soyismin) {
        String yeniIsim=isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\S","*");
    }
}
