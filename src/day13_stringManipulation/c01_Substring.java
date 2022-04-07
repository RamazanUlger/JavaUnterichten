package day13_stringManipulation;

public class c01_Substring {
    public static void main(String[] args) {
        String str = "Java ile IT cok guzel";
        System.out.println(str.substring(5));
        //yukarda ki stringi kullanarak
        //mehmet hoca ile IT cok guzel
        System.out.println(str.replace("Java", "Mehmet hoca"));
        System.out.println(str.substring(9));
        // Eger bir index'den sona kadar olan parcayi degil belirli bir
        //parcayi almak istersek
        //2 parametre girmek gerekir str.substring(baslangic index,bitis index)
        // baslangic index inclusive'dir ((dahil))
        // bitis index'i exclusive'dir ((haric))
        System.out.println(str.substring(0, 5));
        System.out.println(str.substring(0, 1));//J yazdirir
        System.out.println(str.substring(5, 6));// i'i dondurur
        str = "Java gun gectikce guzellesiyor";

        System.out.println(str.substring(7, 7));//java soldan sag calisir
        //bu yuzden bize hiclik verir


        //*******************************
        // System.out.println(str.substring(5,2));//bunu calistirdigimiz zaman
        //hata aliriz
        //bitis indexi baslangic indexinden kucuk olamaz
        //******************************
        System.out.println(str.substring(str.length()-1));

        //////Son bes harfi yazdiralim
        System.out.println(str.substring(str.length()-5));
        /////Son harften sonraki kismi hiclik olarak verir
        System.out.println(str.substring(str.length()));
    }
}
