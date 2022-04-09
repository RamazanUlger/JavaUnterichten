package day39_overriding;

public class Toyota extends Araba {
    protected String hiz = "Toyoto araclar maksimum 220k/h hiz yaparlar ";
    protected String marka = "Toyota";
    protected String sirketMerkezi = "Japan";

    public void motor() {
        System.out.println("Toyota araclar Toyota marka motor kullanirlar ");

    }

    public void yakitTuketim() {
        System.out.println("Arabalar motor gucune gore yakit tuketimine sahiptrilar");
    }

    public void garanti() {
        System.out.println("Toyota araclar 10 yil garantilidir.");
    }
}
