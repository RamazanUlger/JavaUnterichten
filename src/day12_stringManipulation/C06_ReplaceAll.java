package day12_stringManipulation;

public class C06_ReplaceAll {
    public static void main(String[] args) {
        //kullanicidan isim + soyisim
        // bilgisini alip butun harleri
        //'*' yapin
        String str="Ramazan Ülger";
        System.out.println(str);
        System.out.println(str.replaceAll("\\S","*"));

    }
}
