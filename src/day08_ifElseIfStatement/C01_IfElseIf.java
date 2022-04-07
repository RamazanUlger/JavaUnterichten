package day08_ifElseIfStatement;

import java.util.Scanner;

public class C01_IfElseIf {
    public static void main(String[] args) {
        //girilen bir karakterin harf olup olmadigini bulalalim
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter girisi yapiniz : ");
        char karakter = scan.next().charAt(0);


        if ((karakter >= 'A' && karakter <= 'Z') || (karakter >= 'a' && karakter <= 'z')) {
            System.out.println("Girdiginiz karakter bir harftir.");
        } else {
            System.out.println("Girdiginiz karakter bir harf degildir ");

        }
    }
}