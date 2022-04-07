package day32_dateVeTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {
        LocalTime tm=LocalTime.now();
        System.out.println(tm);
int sayi=0;
        for (int i = 0; i < 100000; i++) {
           sayi+=i;
        }
        LocalTime loopSonrasi=LocalTime.now();
        System.out.println(loopSonrasi);
        long nano1=tm.getNano();
        long nano=loopSonrasi.getNano();
        System.out.println("Islem "+(nano-nano1)+" nano saniyede gerceklesti");
     // Ileri veya geriye gidebiliriz

        System.out.println(tm.plusSeconds(1000));

        // istersek ZoneID kullanarak istedigimiz bolgenin saati ivin de obje olusuturabiliriz


    }
}
