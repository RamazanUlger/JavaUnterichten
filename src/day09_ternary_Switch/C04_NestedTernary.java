package day09_ternary_Switch;

public class C04_NestedTernary {
    public static void main(String[] args) {
        // verilen sayinin pozif mi negatif
        // mi oldugunu kontrol edip
        // sifir vaya pozitif sayi ise tek veya cift
        //negatif ise 100'den buyuk veya kucuk
        // olup olmadigini belirleyen bir terenary yaziniz
int sayi=100;
        if (sayi >= 0) {
            if (sayi%2==0){
                System.out.println("sayi pozitif cift sayi");
            }else{
                System.out.println("sayi pozitif bir tekl sayidir");
            }
        }else {
            if (sayi <=-100 ){
                System.out.println("sayi -100'den kucuk nnegatif bir sayidir");
            }else{
                System.out.println("sayi -100'den buyuk negatif bir sayidir");
            }
        }
        String sonuc=sayi>0?(sayi%2==0? "pozitif ciftsayi": "pozitif tek sayi"):
        (sayi<=-100 ? "sayi -100'den kucuk negatif sayi" :
                "sayi 100'den kucuk negatif sayidir");
        System.out.println(sonuc);
    }
}
