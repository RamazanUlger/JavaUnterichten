package day25_ListArray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class C01_Contains {
    public static void main(String[] args) {
        List<String> harfler=new ArrayList<>();
        harfler.add("D");
        harfler.add("M");
        harfler.add(1,"T");
        harfler.add(0,"T");
        System.out.println(harfler);
        System.out.println(harfler.contains("T"));//treu
        System.out.println(harfler.contains("F"));//false

        List<String> karakterler=new ArrayList<>();
        karakterler.add("N");
        karakterler.add("T");
        System.out.println("ilk'i "+ harfler.contains(karakterler));
        karakterler.add("F");
        System.out.println(harfler+"\n"+karakterler);
        System.out.println("ikinci'si "+harfler.contains(karakterler));

    }
}
