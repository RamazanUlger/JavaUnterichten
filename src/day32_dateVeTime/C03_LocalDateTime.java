package day32_dateVeTime;

import java.time.LocalDateTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println(tarihSaat);
        System.out.println(tarihSaat.plusYears(5).plusMonths(22).plusWeeks(45).plusHours(700).plusDays(128));

    }
}
