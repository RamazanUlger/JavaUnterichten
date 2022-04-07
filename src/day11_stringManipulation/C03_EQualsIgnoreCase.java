package day11_stringManipulation;

import java.beans.EventSetDescriptor;
import java.util.Scanner;

public class C03_EQualsIgnoreCase {
    public static void main(String[] args) {
        //Kullaniciza derse katilip katilmak istemediginiz sorun
        //Evet der ise cevabibi ve "Derse katiliminiz alinmistir" yazdirin
        // hayir derse cevabini ve sonra ki derse katilimini bekleriz  yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen derse kalitilini zi belirtiniz \n" +
                "Evet\n" +
                "Hayir\n");
   String cevap=scan.next();
        if (cevap.equalsIgnoreCase("evet")) {
            System.out.println("Cevabiniz : "+cevap+" " );
        }
    }

}
