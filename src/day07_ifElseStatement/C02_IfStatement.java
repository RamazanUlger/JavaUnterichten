package day07_ifElseStatement;

public class C02_IfStatement {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        if (a<b && b>a) {
            System.out.println("isteginiz gerceklesecektir");
        }
        if (a>0) System.out.println("Suslu paratez olmazsa sadece teksatir calisir");
     // bir if cumlesinin daha alasilir olmasi isteniyorsa,
        // curly brace {}
     //icinde yazilmalidir.
     //sonucu, body'yi{} icne almazsak if cumlesi calisir
     //ancak ilk " ; " 'ü gordugunde if bismit olur.

        System.out.println("2.satir da calisti.");
        //Alt tarafda da oldugu gibi if sartini boolean bir karsilastirma operatoru kullanmazsak
        //if  calsimaz int  yada String kullanilmaz, kullanilamaz.
      /*  if (a>0||) {

        }*/
    }
}
