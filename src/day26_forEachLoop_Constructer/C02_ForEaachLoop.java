package day26_forEachLoop_Constructer;

import java.util.ArrayList;
import java.util.List;

public class C02_ForEaachLoop {
    public static void main(String[] args) {
        // 10 elementli bir list olusturalim
        int arr[] ={2,5,4,6,8,54,1,21,4,9};
        List<Integer> sayilar=new ArrayList<>();
        for (int each:arr
             ) {
            sayilar.add(each);
        }
        System.out.println(sayilar);
        //sayilar listesinde 3'e bolunemeyen sayilar yazdiralim
        for (int each:sayilar
             ) {
            if ((each%3)!=0) {
                System.out.print(each+" ");
            }
        }
    }
}
