package day49_maps;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {
        List<Object> list =new ArrayList<>();
        list.add("ramazan");
        list.add(15);
        list.add(10.5);
        System.out.println(list);

        list.set(1,(Integer)(list.get(1))+10);
        Map<Integer,String> sinifList=new HashMap<>();
        //bir sinifta ogrenciNo ve isim, soyisim, brans olarak map olusturmak
        //istiyoruz.
        /*
        Key bir tek unique degerdir
        ama value/deger birden fazla bilginin birlesiminden olasabilir
        bu durumda daha sonra istedigimiz bilgilere dogru sekilde ulasabilmak icin
        tum elementler icin value ayni bicimde olustulmalidir(DAtaa type siralamasi ve sekilsel olarak)
        */
        sinifList.put(1001,"Ramazan Ülger QA");
        sinifList.put(1002,"Seckin abi Dev.(Ins.)");
        sinifList.put(1003,"Veysel Abi Supermaster QA");
        System.out.println(sinifList);
        System.out.println(sinifList.values());


    }
}
