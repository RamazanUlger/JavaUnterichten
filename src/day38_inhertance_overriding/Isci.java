package day38_inhertance_overriding;

public class Isci extends Personel {
    String statu="Isci";
    String haklar="Isciler kidem tazminati alirlar.";
    public String ikramiye="Isciler yilda bir ikramiye alir";


    public void mesai() {
        System.out.println("Tum isciler 40 saat calisir.");
    }
    public  void maasHesapla(){
        System.out.println("Tum personel 30 gun * 8 saat * 11 euro "+(30*8*11)+ " mass alir");
    }
}
