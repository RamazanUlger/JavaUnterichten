package day13_stringManipulation;

public class C02_Substring {
    public static void main(String[] args) {
        //1-48 of 104 results.for "nutella"
        //bulunan arama sonucundaki bulunan sonuc 100'den
        //cok ise super az ise "az sonuc bulundu

        String str="1-48 of 48 results.for  \"nutella\"";
        int ilkSpace=str.indexOf(" ");
        int ikiciSpace=str.indexOf(" ",ilkSpace+1);
        int ucuncuSpace=str.indexOf(" ",ikiciSpace+1);
        String aramaSonucSayisi=str.substring(ikiciSpace+1,ucuncuSpace);
        System.out.println(aramaSonucSayisi);
        int aramaSonucSayisiInt=Integer.valueOf(aramaSonucSayisi);
        if (aramaSonucSayisiInt >100) {
            System.out.println("Super")
            ;

        }else{
            System.out.println("Az sonuc bulundu");

        }
    }
}
