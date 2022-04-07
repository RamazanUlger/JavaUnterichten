package day34_accessModifier_Encapsulation;

public class C04_Encapsulation {
    public static void main(String[] args) {
        /*bir variableyi encapsule edebilmek icin
        * Access modifier'i private
        * okuma ve yazma ozelliklerini kullanilmasini istedigimiz gibi sinirlayabiliriz
           1- eger okunmasini istiyorsak getter() methodundan faydalaniiriz
           2- Sadece deger girebilinsin isterseniz  setter() methodundan faydalaniriz
        Bir variable icin hem getter hem setter olusturursaniz
        o variable public olmus gibi hem okuyup
        * hem de yazilmasini saglayabilirsiniz

         */


        C03 obj= new C03();
        System.out.println(obj.getSayi());
        obj.setStr("Java Java Java");
        System.out.println(obj.getStr());
        System.out.println(obj);
    }
}
