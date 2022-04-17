package day46_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_Iterator {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(6);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);
        System.out.println(liste);
        Iterator itr = liste.iterator();//Iterator methodunu olusturdugumuz liste objesi
                                        //uzerinden ArrayList Classindan calistiriyoruz.
     /*
     Iterator nasil calisisir?
     bir iterator objesi olusturmak icin collection uyesi bir objre kullanmaliyiz
     yani biz bu iterator objesini bizim ornegimiz liste objesi uzerinde
     calismak icin olustumus olduk.
     Biz iterator objesi olusturdugumuz
     iterator collection ilk elementinin oncesinine gidip bekler.

     [6, 7, 8, 6, 9]

      */

        System.out.println(itr.hasNext());//true
        System.out.println(itr.next());//6
        System.out.println(itr.next());
        System.out.println(itr.next());
        itr.remove();

        System.out.println(liste);
        itr.remove();
    }
}