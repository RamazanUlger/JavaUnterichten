package day36_inheritance;

public class Memur extends Muhasebe {



    public static void main(String[] args) {
        Memur memur1=new Memur();
        /*
        memur1 objesi  Memur classinin objesi olmasina ragmen
        ihnerit ettigi Muhasebe ve onun da Parent'i olan Personel
        Class'larindaki tum datalari kulllanabilir

         */
    //******** Peesonel Clasin'dan bilgiler datalar alindi
        memur1.perNo=10001;
        memur1.isim="Ramazan";
        memur1.soyisim="Ülger";
        memur1.adres="Leverkusen";
        memur1.tel="01632000454";

        //***************************** Muhasebe Classin'dan
        memur1.saatUcreti=15;
        memur1.statu="Berber";
        memur1.maasHesapla();
        System.out.println(memur1);

        Memur memur2=new Memur();
        memur2.perNo=1002;
        memur2.maas=2500;
        memur2.isim="Ibrahim";
        System.out.println(memur2);
    }
    public String toString() {
        return "Memur{" +
                "saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", perNo=" + perNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
