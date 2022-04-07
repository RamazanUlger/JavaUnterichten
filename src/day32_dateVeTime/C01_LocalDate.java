package day32_dateVeTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class C01_LocalDate {
    public static void main(String[] args) {
        LocalDate tarih=LocalDate.now();//objenin olusturuldugu tarihi atar
        LocalDate baskaTarih=LocalDate.of(1987,05,15);
        //Isedigimiz yil, ay, ve gun degerlerine gore bize obje olusturur.
        System.out.println(tarih.getDayOfMonth());
        System.out.println(baskaTarih);
        System.out.println(tarih.getMonthValue());
        System.out.println(tarih.minusWeeks(20));
        System.out.println(tarih.hashCode());

        // ülkenin o andaki tarihini elde etmek istersek
         LocalDate zoneId= LocalDate.now(ZoneId.of("Japan"));





        // is ile baslayan methodlar true doner
        System.out.println(tarih.isAfter(baskaTarih));

    }
}
