package day10_switch_StringManipulation;

public class C03_Concat {
    public static void main(String[] args) {
        //Concatination Yapmak istersek
        // '+' operatorunu kullanabilir yada
        //StringManipulation'dan gelen Concationation
        // manipilasyonunu kullaniriz
        String str1 = "Java";
        String str2 = "Candir";
        //Java Candir(bosluk ile) yazdirma

        String cumle = str1.concat(str2);
        //bu bitisik yazdirir
        cumle = str1.concat(" ").concat(str2);
        System.out.println(cumle);
        //Concat metodu icine String bir deger girilir
       //Concat metodu icine sayisal yada boolean bir deger yazilmaz

    }
}
