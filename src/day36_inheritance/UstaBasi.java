package day36_inheritance;

public class UstaBasi extends Isci{
    @Override
    public String toString() {
        return "UstaBasi{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", perNo=" + perNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public static void main(String[] args) {
        UstaBasi ustabasi1=new UstaBasi();
        ustabasi1.saatUcreti=15;
        ustabasi1.adres="Koln";
        ustabasi1.maas=ustabasi1.maasHesapla();
        ustabasi1.perNo=10004;
        ustabasi1.statu="Isci";
        System.out.println(ustabasi1);
    }
}
