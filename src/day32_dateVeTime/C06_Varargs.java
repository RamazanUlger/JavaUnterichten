package day32_dateVeTime;

public class C06_Varargs {
    public static void main(String[] args) {
        //verilen iki sayiyi toplayan bir method olusturun
        int sayi1;
        int sayi2;
        sayi1=10;
        sayi2=20;
        int sayi3 = 30;
        toplaGel(sayi1,sayi2);
        // bir de 3 sayiyi toplayan method olusturalim
        toplaGel(sayi1,sayi2,sayi3);

    }

    private static void toplaGel(int sayi1, int sayi2) {
        System.out.println(sayi1+sayi2);
    }
    private static void toplaGel(int sayi1, int sayi2,int sayi3) {
        System.out.println(sayi1+sayi2+sayi3);
    }
}
