package day46_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C02_ListeyiTerstenYazdirma {
    public static void main(String[] args) {
        /*
        Verilen listedeki her elementi 3 artirin
         */
        List<Integer> liste = new ArrayList<>();
        liste.add(6);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);
        System.out.println(liste);
        //listenin tum elementlerini bize getirmesi icin
        //Iterator'un hasnext() ve next() methodlarini kullaniriz

        ListIterator itr2=liste.listIterator();
//liste'Yi 3 artiralim
        while (itr2.hasNext()){
            Object sayi=itr2.next();
            itr2.set((Integer)sayi+3);

        }
        System.out.println(liste);



    }
}
