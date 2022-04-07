package day15_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {
        //Kullanicidan bir kelime isteyin eger kelime
        //3 harften kisa ise 'kelime cok kisa yazdirin
        //eger kelime 3,4 veya 5 harfli ise harf sayisini
        // ve
        //kelimenin tersten yazilisini yazdirin
        //eger kelime 5 harften uzunsa "kelime cok uzun" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime=scan.next();
        String tersKelime="";
        if (kelime.length()<3){
            System.out.println("kelime cok kisa");
        }else if (kelime.length()<=5){
            if (kelime.length()==3){
                tersKelime=kelime.substring(2)+
                        kelime.substring(1,2)+
                        kelime.substring(0,1);
            }else if(kelime.length()==4){
                tersKelime=kelime.substring(3)+
                        kelime.substring(2,3)+
                        kelime.substring(1,2)+
                        kelime.substring(0,1);
            }else {

            }
            System.out.println("girdiginiz kelimedeki harf sayisi : " + kelime.length());
            System.out.println("kelimenin tersten yazilisi : " + tersKelime);
        } else {
            System.out.println("kelime cok uzun");
        }




















        /*  Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz : ");
        String str = scan.next();
        String tersStr=null;
        if (str.length()<3) {
            System.out.println("kelime cok kisa");
        }else if (str.length()==3||str.length()==4||str.length()==5) {
            tersStr=str.substring(1);
                    str.substring(0,1);*/
        }
    }

