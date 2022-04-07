package day26_forEachLoop_Constructer;

public class Araba {

    //Javada her Class olustrudugumuz da  Java O Class'dan
    //ileride objeler uretmek  gerekecegini bilir
    //ve biz ozellikle belirtmesekte
    //Java her olusturdugunu class'a bir Constructer koyar


    //Javanin class olustururken class'a koydugu constructer'a
    //DEFAULT CONSTRUCTER denir ve bu CONSTRUCTER gozukmez
    //Eger biz gorunur bir CONSTRUCTER'imiz olsun istersek
    //default CONSTRUCTER ile ayni gorevi yapan bir CONSTRUCTER  olusturabiliriz
    //veya isterdik ayni kaliptan farkli desenlerde objeler olusturtmak icin
    //farkli ozelliklerde CONSTRUCTERLar da olusturabiliriz

    //Constructerlari birbirinden farklilastiran tek ayricalik
    //kullanilan parametre sayisi ve parametre data turudur!!!

    public Araba(){

    }

    /*
     bir kod blogunun method veya constructor olmasindan emin olmak istiyorsaniz
       iki seye dikkat etmelisiniz
       1- Constructorlar'in ismi class ismi ile ayni olmak zorundadir yani buyuk harfle baslar
       2- Constructor'larin return type'i olmaz
       ozetle : constructorin adi class adi ile ayni olmali ve
                return type'i olmamali
     */
    public Araba(String renk){
        System.out.println(renk + " renkli bir araba uretildi");
    }
    public Araba(int yil){
        System.out.println(yil + " model bir araba uretildi");
    }
    public Araba(int yil, String renk){
        System.out.println(yil + " model " + renk + " renginde bir araba uretildi");
    }


}
