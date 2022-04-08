package day38_inhertance_overriding;

public class Personel {
    String statu="Pesonel";
    String haklar="Tum personel esit haklara sahiptir";

    public void mesai() {
        System.out.println("Tum personel 5 gun, gunde 8 saat calisir.");
    }
    public  void maasHesapla(){
        System.out.println("Tum personel 30 gun * 8 saat * 10 euro "+(30*8*10)+ " mass alir");
    }
}
