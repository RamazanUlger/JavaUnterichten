package day14_stringManipulation;

public class C03_StringSAyiToplama {
    public static void main(String[] args) {
        //Str $13,99
        //Str $10,55
        String str1="$13,99";
        String str2="$10,55";
        str1=str1.replaceAll("\\D","");
        str2=str2.replaceAll("\\D","");

        double str1Sayi=Double.valueOf(str1);
        double str2Sayi=Double.valueOf(str2);
        double sonuc=(str1Sayi+str2Sayi)/100;
        System.out.println(sonuc);

    }
}
