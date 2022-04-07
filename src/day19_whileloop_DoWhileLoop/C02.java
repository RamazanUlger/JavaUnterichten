package day19_whileloop_DoWhileLoop;

public class C02 {
    public static void main(String[] args) {
       // Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin

        int input=45;
        int rakam=0;
        int rakamlarToplami=0;
        while (input>0){
            rakam=input%10;
            rakamlarToplami+=rakam;
            input/=10;
        }
        System.out.println("Girilen sayinin rakamlar toplami = "+rakamlarToplami);
    }
}
