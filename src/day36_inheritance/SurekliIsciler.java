package day36_inheritance;

public class SurekliIsciler extends Isci{

    @Override
    public String toString() {
        return "SurekliIsciler{" +
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
        SurekliIsciler surekIsck=new SurekliIsciler();

        surekIsck.isim="Mehmet";
        surekIsck.soyisim="Bululuoz";
        surekIsck.isciStatu="Isci";
        surekIsck.saatUcreti=11;
        surekIsck.maas=surekIsck.maasHesapla();
        System.out.println(surekIsck);
    }
}
