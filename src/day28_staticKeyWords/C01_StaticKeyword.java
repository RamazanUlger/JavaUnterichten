package day28_staticKeyWords;

public class C01_StaticKeyword {
    static int sayi;
    int sayi2;

    public static void main(String[] args) {
        sayi++;
        System.out.println("sayi1 = "+ sayi);
        //System.out.println(sayi2); static olmadigi icin main methoddan dirrek olraka kulllanmayiz
        C01_StaticKeyword obj1=new C01_StaticKeyword();
        obj1.sayi2++;
        System.out.println("Sayi2 = "+obj1.sayi2);

        C01_StaticKeyword obj2=new C01_StaticKeyword();
        System.out.println(obj2.sayi2);//0 yazar.
        System.out.println(obj1.sayi);

    }
}
