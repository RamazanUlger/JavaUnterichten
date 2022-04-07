package day12_stringManipulation;

public class C05_Replace {
    public static void main(String[] args) {
        String str = "Bugun ne cok sey ogrendik";
        //bu cumledeki 'SPACE'S'lwei yok edelim
        System.out.println("Space haric karakter sayisi : "+str.replace(  " ", "").length());
        //atama yapilmadigi surece orjinal metin degismez sadece 'o' satir
        //icin degisiklik yapilip yazdirilmis olur
        System.out.println("orginal metin karakter sayisi : " + str.length());
        //metinde kalici olrak degisiklik yapalim
        // bugun yerine yarin yazalim
        //ogrendik yerine ogrenecegiz
        str = str.replace("Bugun", "yarin");
       // System.out.println(str);
        str = str.replace("ogrendik", "ogrenecegiz");
        System.out.println(str);

    }
}
