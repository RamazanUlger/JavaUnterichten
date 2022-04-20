package day49_maps;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C03_ListeyiDuzgunYazdirma {
    public static void main(String[] args) {
       //Sinif listesi duzenli bir  sekilde yazdirmak
        Map<Integer,String> klasse= C02_CreateMap.mapCreating();
       klassenListDrucker(klasse);


    }

    private static void klassenListDrucker(Map<Integer, String> klasse) {
        System.out.println("Nummer      Name      Nachname      Brans");
        System.out.println("============================");
      /*
      Map yapisini yazdirdigimiz da kullanicilar birsey anlamayabilir
      bunun icin once map yapisini kodlarala munipule edip map'deki datalari
      istedidimiz formata sokmamiz gerekir
      1.Adim: Key ve Valueleri mapten alma.


       */
        Set<Integer>kennWortSet=klasse.keySet();
        Collection<String> wertSet=klasse.values();
        System.out.println(kennWortSet);
        System.out.println(wertSet);
        for (String each:wertSet
             ) {
            System.out.println(each);
        }

    }
}
