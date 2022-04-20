package day47_LinkedList;

import java.util.*;

public class C04_ArraydanTekrarlariSilme {
    public static void main(String[] args) {
        /*
        Verilen bir array'dan tekrar eden elementleri silip unique elemntler den
        oludan bir array haline donduren  bir method olusturun
         */
        int arr[]={2,5,12,12,5,5,3,2,4,5,1,5,1,4,1,3,9,7,8,7,8};

      //  System.out.println(Arrays.toString(benzersizYap(arr)));
benzersizYap(arr);

    }

    private static void benzersizYap(int[] arr) {
        Set<Integer> benzersizSet=new TreeSet<>();

        for (Integer each:arr
             ) {
            benzersizSet.add(each);
        }
        System.out.println(benzersizSet);
        /*
        Set'de indeyx yoktur dolayisiyla fori Loop'unu kulllanamiz
         */
      int  index=0;
      int arrBenzersiz[]=new int[benzersizSet.size()];
        for (Integer each:benzersizSet
             ) {
            arrBenzersiz[index]=each;
            index++;
        }
        System.out.println(Arrays.toString(arrBenzersiz));
    }
}
