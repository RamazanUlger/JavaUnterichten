package day42_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_FileInputStream {
    public static void main(String[] args) {
        String dosyaYolu="src/day41_exceptions/Dosya.txt";

        try {
            FileInputStream dosya=new FileInputStream(dosyaYolu);
      int k =0;
      while ((k=dosya.read())!=-1){
          System.out.print((char)k);
      }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
        Alti kirmizi cizili her kod CTE degildir
        Java syntax hatalarini derleme esnasinda fark eder
        ve altini cizer  biz bugunre kadar tamamina CTE diyorduk
        ancak EXception konusu ile birlikte Compile Time Exception
        kavramida hayatimiza girmis bulunmaktadir
        */

        /*
        Excedptionlar icinde Parent Child ilskisi vardir
        Eger bir kod icin birden fayla Exception olusma ihtimali varsa
        oncelikli olasi Exception 'lar parent-child  ilskisi tasiyormu bakmamiz lazim
        Eger parent ilskisi yoksa,istedigimiz siada Catch cumleleri  olusturabiliriz

        Eger parent-child iliskisi varsa
        sadece  parent exception'i yazabiliriz
        Cünkü parent classlar daha kapsayicidir

         */

    }
}
