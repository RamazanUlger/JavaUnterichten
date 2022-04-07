package day25_ListArray;

import java.util.ArrayList;
import java.util.List;

public class C08_ListedeElemanlarinYeriniDegistirme {
    public static void main(String[] args) {
        // Verilen bir listede, istenen iki index'deki
        // elementlerin yerini
        // kalici olarak degistiren bir method olusturun
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);
        int ilkIndex=0;
        int ikinciIndex=7;
        sayilar= swapElements(sayilar,ilkIndex,ikinciIndex);
    }
    public static List<Integer> swapElements(List<Integer> sayilar, int ilkIndex, int ikinciIndex) {
        // bir tem sayi olusturup
        // verilen indexlerdeki sayilari yer degistirin
        // indexleri kontrol edip sinirin otesinde
        // index verildiyse uyari mesaji yazdirin
      int temp=0;
        System.out.println(sayilar);//[1, 3, 5, 3, 5, 6, 1, 7]
        //bu kisimda set method'u ile ilkindex'deki sayi alindi ve temp'e atamis oldu
        temp=sayilar.set(ilkIndex,0);

        //bu kisimda yine set methodu ile ikinci index'e temdeki deger atandi ve
        // set'in yardimiyla bosa cikan index'deki sayi tekrar temp'e atanmis oldu
        temp=(sayilar.set(ikinciIndex,temp));

        //ve son kez set ile temp'deki deger ikiciindex'e atandi
        sayilar.set(ilkIndex,temp);
        System.out.println(sayilar);//[1, 3, 6, 3, 5, 5, 1, 7]
        return sayilar;
    }
}
