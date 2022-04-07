package day07_ifElseStatement;

import java.util.Scanner;

public class C06_Emeklilik {
    public static void main(String[] args) {
        //kullanicidan yasini isteyin
        //65 veya ustu ise emekli olabilirsin
        //65'den kucukse emekli olamazsin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz :");
    int emeklilik=scan.nextInt();
        if (emeklilik >=65) {
            System.out.println("Emekli olabilirsiniz");
        }else {
            System.out.println("Emekli olamazsiniz : ");
            System.out.println(65-emeklilik +" " + "sene daha calismalisin." );
        }
    }

}
