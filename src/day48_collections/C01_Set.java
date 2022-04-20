package day48_collections;

import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {
        /*
        Vereilen bir array'in tekrar eded elementlerini
        sadece bir kere yazdiran bir method creat edeniz
         */
        Integer arr[]={2,5,5,2,3,6,35,2,6,4,9,8,9,4,7,4,1};
        arrayTekrarsiz(arr);
    }

    private static void arrayTekrarsiz(Integer[] arr) {
        Set<Integer> tekrarsizElamanKumesi=new HashSet<>();
        for (Integer each:arr
             ) {
            tekrarsizElamanKumesi.add(each);
        }
        System.out.println(tekrarsizElamanKumesi);
    }
}
