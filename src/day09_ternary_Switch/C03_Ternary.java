package day09_ternary_Switch;

public class C03_Ternary {
    public static void main(String[] args) {
        int sayi=40;
        //verilen sayinin 3 veya  daha cok basamakli olup
        // olmadigini kontrol edin ve sonucu yazdiran
        //bir ternary olusturun
       String sonuc;


       sonuc= sayi>= 100 ? "Sayi basamakli veya daha buyuk ":
                "sayi 3 basamakli degil veya negatif bir sayidir";
        System.out.println(sonuc);
    }
}
