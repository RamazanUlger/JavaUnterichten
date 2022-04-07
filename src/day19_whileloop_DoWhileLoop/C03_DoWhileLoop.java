package day19_whileloop_DoWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        int input=3;
        int sayi=1;
        int sayac=0;
        while (sayi<input) {
            System.out.println(sayi);
            sayac++;
        sayi++;
        }
        System.out.println(sayac);
        //***********************
        //do While ile ayni soruyu yapalim
        sayi=1;
        do {
            System.out.println(sayi);
            sayi++;
        }while (sayi<input);
    }
}
