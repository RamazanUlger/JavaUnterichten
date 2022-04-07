package day25_ListArray;

import java.util.ArrayList;
import java.util.List;

public class C05_ListiTekrarsizYap {
    public static void main(String[] args) {
        //verilen bir listede tekrar eden sayilari
        //sadece bir kere yapan bir  method olusrturun
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);
        sayilar = tekrarsizListeOlustur1(sayilar);
        System.out.println(sayilar);
    }

    public static List<Integer> tekrarsizListeOlustur1(List<Integer> sayilar) {
        List<Integer> sayilar2 = new ArrayList<>();
        for (int i = 0; i < sayilar.size(); i++) {
            if (!sayilar2.contains(sayilar.get(i))) {
                sayilar2.add(sayilar.get(i));
            }
        }

        return sayilar2;
    }
}
