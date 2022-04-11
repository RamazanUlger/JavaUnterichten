package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02_FileInputStream {
    public static void main(String[] args) throws FileNotFoundException {
     /*
     Bir Code yazlirken olasi exceptionlar on gorulup exception olustugunda
    Javanin  ne yapmasini istedigimizi belirtmeliyiz.

    1-Eger exception olustugunda kodun calismaya devam etmek istiyorsak
    method isminin yanina olusabilecek excpetion'i deklare edebiliriz
    2-Eger exeption olussa da kodum calismaya devam etmesini istiyorsak
    sorun oluustturabilecek kodu trc ycatch blogunun icine alabiliriz
      */
        String dosyaYolu="src/day41_Exceptions/Dosya.txt";

        FileInputStream fis=new FileInputStream(dosyaYolu);
    }
}
