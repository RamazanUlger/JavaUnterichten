package day24_listArray;

import java.util.ArrayList;
import java.util.List;

public class C02_ListArray_Remove {
    public static void main(String[] args) {
        List<String> isimler=new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Oguzhan");
        System.out.println(isimler);
        // eger remove (istenenobjekt) methodu  istenen elementi kalfirip
        // bize true ya da false doner
        //eger remove isleminin yapildigini kontrol etmek
       boolean bl= isimler.remove("Oguzhan");
        System.out.println(isimler);
      bl=isimler.remove("Berk");
        if (bl == true) {
            System.out.println("Istediginiz isim silindi");

        }else {
            System.out.println("Istedigin isim listede olmadigi icin silinmedi.");

        }
        System.out.println(isimler);//[Aykut,Yusuf,Ilker]
        //remove(index) yazdigimiz  sildi mi silemedi mi ihtimali kalmaz
        //bize remove edilen elementi doner
        System.out.println(isimler.remove(1)); // Yusufu siler bize delil olarak yusuf elementini bize dondurur.
        System.out.println(isimler);
        //[Aykut, Ilker]

    }
}
