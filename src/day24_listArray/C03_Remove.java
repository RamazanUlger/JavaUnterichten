package day24_listArray;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class C03_Remove {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(0,7);
        sayilar.add(2,7);

        sayilar.remove(3);
        //sayilar.remove(5); **IndexOutOfBoundException verir
        /*
        Sayilardan olusan bir List'te objeyi vererek elemnt silme
        method'u calismaz!
        Sayi degeri grildiginde java bunu otomatik olarak sayiy index kabul eder
         */
        //int  sayi=5;
        //sayilar.remove(sayi);//IndexOutOfBoundException verir
        Integer sayi=5;
        sayilar.remove(sayi);
        System.out.println(sayilar);//[7, 7] seklinde sileriz!!!
    }
}
