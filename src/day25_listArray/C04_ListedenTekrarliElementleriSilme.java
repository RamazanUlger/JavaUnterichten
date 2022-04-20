package day25_listArray;

import java.util.ArrayList;
import java.util.List;

public class C04_ListedenTekrarliElementleriSilme {
    public static void main(String[] args) {
       //verilen bir listede tekrar eden sayilari
        //sadece bir kere yazdiran bir  method olusrturun.
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);
        tekrarsizListeOlustur(sayilar);

    }

    public static void tekrarsizListeOlustur(List<Integer> sayilar) {
   List<Integer> sayilar2=new ArrayList<>();
        for (int i = 0; i <sayilar.size() ; i++) {
            if (!sayilar.contains(sayilar2.get(i))) {
                sayilar2.add(sayilar.get(i));
            }
        }
        System.out.println(sayilar2);
    }
}
