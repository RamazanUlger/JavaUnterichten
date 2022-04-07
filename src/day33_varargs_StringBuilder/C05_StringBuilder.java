package day33_varargs_StringBuilder;

public class C05_StringBuilder {
    public static void main(String[] args) {
        /*
        Compare iki StringBuilder'i esit mi diye kontrol icin
        ilk harften baslayarak tum karakterleri karsilastirir

        Ayni olan karakterler icin bir sey yazdirmaz
        farkli olan ilk karakter icin ascii tablosuna gore kac deger geride veya ileride
        oldugunu yazdirir
        Tamamen ayni ise bize 0 dondurur
        bir sb ile bir String'i compare etmek istersek Java CTE verir

         */
        StringBuilder sb1 = new StringBuilder("Ali Can");
        StringBuilder sb2 = new StringBuilder("ali can");

        String str ="Ali Can";
        System.out.println(sb1.compareTo(sb2));

        //sb1.compareTo(str);
        /*
        String ile StringBuilder'r karsilastiramayiz CTE verir

        */

        //stringNuilder'da eqauls Stringdeki  == gibi calisir
        System.out.println(sb1.equals(sb2));//false iki fakli obje olduklari icin
        System.out.println(sb1.equals(sb1));//true

        //System.out.println(sb1.setCharAt(3,'g');
        //yazdiramadim neden bilmiyorum

       // System.out.println(sb1==str);
        //java farkli turden iki obje'yi kiyaslamaz
    }
}
