package day05_matematikselIslemler;

public class C06_WrapperClass {
    public static void main(String[] args) {
        String str1="123456";
        String str2="123456";
        System.out.println(str1+str2);
        System.out.println(Integer.valueOf(str1)+Integer.valueOf(str2));

        //*****************************************************************


        // verilen iki string'deki sayilari toplayin
        System.out.println( str1 + str2 ); // 1234523456
        System.out.println(Integer.valueOf(str1) +  Integer.valueOf(str2) ); // 35801
        // Integer.valueOf(str1) methodu sadece sayisal deger iceren String'lerde kullanilabilir
        // bir tane bile sayi disinda karakter olursa Java hata

    }
}
