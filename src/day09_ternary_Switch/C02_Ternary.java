package day09_ternary_Switch;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        // kullanicidan aldiginiz bir sayinin tek micift mi,
        // oldugubu gosteren bir kod yaziniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz : ");
    int sayi=scan.nextInt();
    String sonuc=sayi%2==0 ? "Cift sayi":" Tek Sayi";
        System.out.println(sonuc);

    }
}
