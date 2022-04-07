package day15_methodCreation;

public class C06_MethodCreation {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //iki variable'in degerlerini toplayan bir method olusturalim
        //1.adim : method adini yazalim
        //2.adim  method'a gonderilmesi gereken Argumanlari belirlemek
        ikiSayitopla(a, b);

    }

    //bir methodun calismasi icin olusturmak yeterli degildir
    //method ancak cagriliras calisir
    //
    public static void ikiSayitopla(int a, int b) {
        System.out.println(a + b);
    }
}
