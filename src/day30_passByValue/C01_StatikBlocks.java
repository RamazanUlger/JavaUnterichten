package day30_passByValue;

public class C01_StatikBlocks {
    static{
           /*
        static block class ilk calismaya basladiginda devreye girer
        ve class'in calismasi icin gerekli on hazirliklar icin kullanilir
        yazildigi satirin hic bir onemi yoktur, class icerisinde istenen yerde yazilabilir
        static block birden fazla olursa, bloklar yukaridan asagi dogru sirayla calisir
         */
        System.out.println("Statik blok calisti");
    }
    C01_StatikBlocks(){
        System.out.println("Constructer calisti");
    }

    public static void main(String[] args) {
        System.out.println("Main method baslangici");

      //  C01_StatikBlock obj;
        new C01_StatikBlocks();

        System.out.println("Main method sonu");

    }
}
