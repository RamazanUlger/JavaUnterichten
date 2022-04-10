package day40_overriding_pollymorohism;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C05_Exception {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int toplam=0;
        int sayi=0;
        do {
            System.out.println("Lutfen toplamak istediginiz sayiyi giriniz \n" +
                    "Cikmak icin Q'a bas!");
            sayi=scan.nextInt();
            toplam +=sayi;
        }while (toplam <500);
         try {

         }catch (InputMismatchException e){

         }
    }
}
