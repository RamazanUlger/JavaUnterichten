package day40_overriding_pollymorohism;

public class C04_Exeptcition {
    public static void main(String[] args) {
        //String olan abir veriyi bir sayiya cevirip
        //2 katini yazidiralim
    String str="1000a";


    /*
    str icinde rakam olmayan bir karakter olamazsa
     NumberFormatException.forInputString verir
         */

        try {
            int sayi = Integer.parseInt(str);
            System.out.println("Girilen sayinin 2 kati : "+(sayi*2));
        } catch (Exception e) {
         //   e.printStackTrace();
            System.out.println("Girdiginiz String sayi olamayan elmentler iceriyor!!");
        }



    }
}
