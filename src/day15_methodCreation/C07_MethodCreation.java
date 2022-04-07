package day15_methodCreation;

public class C07_MethodCreation {
    public static void main(String[] args) {
        String str ="Ali";
        //String'i yazdiran method olusturalim
        //hosgeldiniz diyen bir method olusturun
        //kapanma mesaji yazan method
        hosgelldinYazdir();
        kapanmaMethod();


    }

   public static void kapanmaMethod() {
        System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz");
    }

    public static void hosgelldinYazdir() {
        System.out.println("Hosgeldiniz, Java gun gectikce guzellesir");
            stringYazdir("boyle de olur");
    }

    public static void stringYazdir(String str) {
        System.out.println(str);
        kapanmaMethod();
    }
}
