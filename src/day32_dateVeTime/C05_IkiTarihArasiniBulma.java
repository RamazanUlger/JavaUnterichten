package day32_dateVeTime;

import java.time.LocalDate;
import java.time.Period;

public class C05_IkiTarihArasiniBulma {
    public static void main(String[] args) {
        LocalDate bugun=LocalDate.now();
        LocalDate dogumGunu=LocalDate.of(1987,05,15);
        System.out.println(Period.between(dogumGunu,bugun));//P34Y10M16D
        System.out.println(Period.between(dogumGunu,bugun).getYears());//34
        // FIXME: 31.03.2022 ;
    }
}
