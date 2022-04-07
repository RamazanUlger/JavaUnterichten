package day18_nestedForLoop;

public class C06_WhileLoop {
    public static void main(String[] args) {
        //Kullanicidan iki tam sayi alip
        //bu sayilari ve aralarindaki sayilari yazdiran
        int baslangic=40;
        int bitis=60;
        //*************
        //for loop ile yaparsak
        //*************
        for (int i = baslangic; i <=bitis ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        //****************
        //While loop ile yaparsak
        //****************
        int i=baslangic;
        while(i<=bitis){
            System.out.print(i+" ");
        baslangic++;
        }
        System.out.println("");
        System.out.println(baslangic);
    }
}
