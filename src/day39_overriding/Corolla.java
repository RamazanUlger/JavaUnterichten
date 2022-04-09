package day39_overriding;

public class Corolla extends Toyota {
    protected String model="Coralla";
    protected String hiz = "Corolla maximum 200 yapar";
    protected String yakit = "Corolla bezzinli veya elektiriklidir";

    public void  motor(){
        System.out.println("Corolla araclar cevrecidir");

    }

    public void yakitTuketim(){
        System.out.println("Corolla 100km/5.4 litre yakit tukertirler ");
    }
    public  void vites(){
        System.out.println("Coralla sadece otomatiktik viteslidir.");
    }

    public static void main(String[] args) {
        /*
        Data turu ve Connst. farkli oldugundan
        Const. calistigi icin obje Const.'in bulundugu Class ozelliklerini tasir
        ancak data turu Parent classdan secildigi icin variable'lar
        data turunun secildigi class ve onun Parent class'larindan degeri alir
        */

        /*
        Methodlar icin ise yine data trunun oldugu calsa'a gideriz
        ancak direk method'u calistirmadan once method override
        edilmismi diye kontrol ederiz
         */
        Corolla arb1=new Corolla();
        System.out.println(arb1.haraket);//Araba Classindan alir.
        System.out.println(arb1.hiz);//Corolla Class'inda alir.
        System.out.println(arb1.yakit);//Corolla Class'inda alir.
        System.out.println(arb1.marka);//toyota class alir
        System.out.println(arb1.sirketMerkezi);//Corolla Class

        Toyota arb2=new Corolla();
        System.out.println(arb2.haraket);//Araba Classindan alir.
        System.out.println(arb2.hiz);//Araba Class'inda alir.
        System.out.println(arb2.yakit);//Araba Class'inda alir.
        System.out.println(arb2.marka);//Toyota class'in alir
        System.out.println(arb2.sirketMerkezi);//Toyota Class
        //System.out.println(arb2.model);//CTE verecektir cunku Toyota classinda
                                       //"model" variable bulunmamaktadir
        arb2.motor();

        Araba arb3=new Corolla();
        System.out.println(arb3.haraket);//Araba Classindan alir.
        System.out.println(arb3.hiz);//Araba Class'inda alir.
        System.out.println(arb3.yakit);//Araba Class'inda alir.
        System.out.println(arb3.marka);//Araba class'in alir
        // System.out.println(arb3.sirketMerkezi);//CTE verir Araba Classinda
                                                  //"sirketMerkezi" variable olmadigi icin
        //System.out.println(arb3.model);//CTE verir model variable'i Araba class'inda yok

    }
}

