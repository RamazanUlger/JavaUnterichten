package day39_overriding;

public class Araba {
    protected String haraket = "Araabalar teker ile hareket eder";
    protected String hiz = "Aarabalar motor gucune gore hiz yaparlar";
    protected String yakit = "Arabalar farkli yakitlar kullanirlar";
    protected String marka = "Arabalr uretildiklari markaya sahp olurlar";

    public void  motor(){
        System.out.println("Arabalar farkli markalarda motor kulllanirlar");

    }

    public void yakitTuketim(){
        System.out.println("Arabalar motor gucune gore yakit tuketimine sahiptrilar");
    }



}
