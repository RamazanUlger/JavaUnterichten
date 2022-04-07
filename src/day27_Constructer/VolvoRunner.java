package day27_Constructer;

public class VolvoRunner {
    public static void main(String[] args) {
        Volvo araba1=new Volvo();
        System.out.println(araba1.marka);//Vovo
        araba1.yakit="Dizel";
        araba1.elektrikliMi=false;
        System.out.println(araba1.maxHiz);//240

        System.out.println(araba1.toString());

        Volvo araba2=new Volvo();
        araba2.yakit="Elektirik";
        araba2.model="XC90";
        System.out.println(araba2.toString()
        );




    }
}
