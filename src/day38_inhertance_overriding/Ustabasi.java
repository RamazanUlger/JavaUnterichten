package day38_inhertance_overriding;

public class Ustabasi extends Isci {
    String statu = "Ustabasi";
    String haklar = "Ustabasi hafatada extra fazladan bir gun tatile  sahiptir";

    public void mesai() {
        System.out.println("Ariza olursa extra ucret alamadan calisir.");
    }

    public void maasHesapla() {
        System.out.println("Tum personel 30 gun * 8 saat * 12 euro " + (30 * 8 * 12) + " mass alir");
    }

    public static void main(String[] args) {

        // Icin de oldugumuz class'dan kalasik halia ile birobjr olusturusak
        //o obje ile cagirdigimiz variable ve methodlarda java once icind bulundugumuz
        //Class'a bakar, aradigimiz class uyesi icinde oldugumuz calssta varsa
        //EGER YOKSA!!!!!!
        //Yoksa, Parent Class'lara bakar ve orada ilk buldugunu getirir
        Ustabasi ramazan = new Ustabasi();
        System.out.println(ramazan.statu);   //Ustabasi
        System.out.println(ramazan.haklar);  //Ustabasi hafatada extra fazladan bir gun tatile  sahiptir
        System.out.println(ramazan.ikramiye);//Isciler yilda bir ikramiye alir
        System.out.println(ramazan.izin);    //Tum personel 4 hafta izin kullanabilir
        /*
        Eger Isci olarak ozelliklerini gormek istersek
        Class adini (Data Turu) Isci (Isci Class'i) olarak seceriz
         */
        Isci ahmet=new Ustabasi();
        System.out.println(ahmet.statu);     //Isci
        System.out.println(ahmet.haklar);    //Ustabasi hafatada extra fazladan bir gun tatile  sahiptir
        System.out.println(ahmet.ikramiye);  //Isciler yilda bir ikramiye alir
        System.out.println(ahmet.izin);      //Tum personel 4 hafta izin kullanabilir

        /*/
        obje hangi class'dan tanimlarsa o Class'in ozelliklerine sahip olur
         */
        Personel adem =new Ustabasi();
        System.out.println(adem.statu);//Isci
        System.out.println(adem.haklar);//Ustabasi hafatada extra fazladan bir gun tatile  sahiptir
      //  System.out.println(adem.ikramiye);//Isciler yilda bir ikramiye alir
        System.out.println(adem.izin);//Tum personel 4 hafta izin kullanabilir

        //************************************************************
        /*
        SIMDI METHOD ILE OLAN KULLANIMLARINA BAKALIM VE YAZDIRIP SONUCU GORELIM
         */
        ramazan.maasHesapla();//Tum personel 30 gun * 8 saat * 12 euro 2880 mass alir
        ahmet.maasHesapla();//Tum personel 30 gun * 8 saat * 12 euro 2880 mass alir
        adem.maasHesapla();//Tum personel 30 gun * 8 saat * 12 euro 2880 mass alir


        ramazan.mesai();//Ariza olursa extra ucret alamadan calisir.
        ahmet.mesai();//Ariza olursa extra ucret alamadan calisir.
        adem.mesai();//Ariza olursa extra ucret alamadan calisir.

        //*************************************************************

        /*

        Personel adem =new Ustabasi(); //bu bir ustabasi class objesidir
         Personel adem =new Personel();//bu bir personel class objesidir
         */

        /*
         Personel adem =new Ustabasi();
         ademin data turu personel'dir ne isimle tanimladigimizi bilebiliriz
         Ancak ben ademin usta basi oldugunu biliyorum
         cunku const.'i Ustabasi()
         ama bu yazim formati ile
         ademin  tum personel ile birlikte ahip oldugu
         ortak ozellikleri vurgulamak istiyorum

         bu kullanim seklinde olusturulan obje data turu olarak secilen
         Class ve Parent Classlardaki variablelari kullanabilir.

         */



    }
}
