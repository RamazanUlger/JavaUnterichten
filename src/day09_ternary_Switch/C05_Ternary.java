package day09_ternary_Switch;

public class C05_Ternary {
    public static void main(String[] args) {
        //Bazen ternary'deki iki sonucun data turleri farkli
        //olabilir.
        //verilen sayi 100'den buyukse sayinin karesini alip yazdiran
        //100'den kucukse "sayi 100'den buyuk olmali
        //yazdiran bir ternary olusturalim

        int sayi=50;
        //ternary bize sonuc getirdiginden ya sonucu direk yada
       // degiskene atayarak yazdirilmali
      var sonuc= sayi > 100 ?(sayi*sayi):("sayi 100'den buyuk olmali");
        System.out.println(sonuc);
    }
}
