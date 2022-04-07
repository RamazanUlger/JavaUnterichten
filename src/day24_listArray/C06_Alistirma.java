package day24_listArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_Alistirma {
    public static void main(String[] args) {
     /*   5) sort() methodu kullanarak,
        elemanlari alfabetik siraya diziniz.
        ArrayList’i ekrana yazdiriniz
        list goyle olmali; A, B, C, D, L. 6)
        contains() methodu kullanarak, L’nin list’de var
        oldugunu ve M’nin list’de var olmadigini dogrulayiniz.
        7) size() methodu kullanarak,
         list’in kag eleman oldugunu ekrana yazdiriniz.
         8) clear() methodu kullanarak, list’deki tum elemanlari siliniz.
         9) isEmpty() methodu kullanarak,
        list’deki tum elemanlarin silindigini dogrulayiniz*/
        List<String> harfler=new ArrayList<>();
        harfler.add("A");
        harfler.add("B");
        harfler.add("C");
        harfler.add("D");
        harfler.add("L");
        harfler.add("6");
        System.out.println("ArrayList'imiz . "+harfler);

        if (harfler.contains("L")) {
            System.out.println("Aradiginiz karakter Liste'ye eklidir... ");
        }else{
            System.out.println("Aradiginiz karakter Liste'ye ekli degildir... ");
        }
        if (harfler.contains("M")) {
            System.out.println("Aradiginiz karakter Liste'ye eklidir... ");
        }else{
            System.out.println("Aradiginiz karakter Liste'ye ekli degildir... ");
        }

        System.out.println("Listenizin elaman sayisi : "+harfler.size());

        harfler.clear();
        System.out.println(harfler);


        if (harfler.isEmpty()==true) {
            System.out.println("Liste bosaltildi!");
        }else{
            System.out.println("Liste doludur!");
        }
    }
}
