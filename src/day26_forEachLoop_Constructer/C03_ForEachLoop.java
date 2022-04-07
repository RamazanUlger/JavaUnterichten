package day26_forEachLoop_Constructer;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop {
    public static void main(String[] args) {
        String arr[]={"Ali","Ayse","Can","Fatma"};
        String arr2 []={"Can","Evren","Emsal","Fatma","Emre","Ali"};
        List<String> ortakelaman=new ArrayList<>();
        for (String each:arr
             ) {
            for (String each2:arr2
                 ) {
                if (each2.equals(each)) {
                    ortakelaman.add(each);
                }
            }
        }
        if (ortakelaman.isEmpty()) {
            System.out.println("Ortak elaman yoktur!");
        }else System.out.println("Ortak elamanlar : "+ortakelaman);
    }
}
