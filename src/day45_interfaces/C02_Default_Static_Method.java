package day45_interfaces;

import day15_methodCreation.C04;

public class C02_Default_Static_Method implements I01__Default_Static {
    public static void main(String[] args) {
     //Interface'deki static olarak tanimlanan methodlara
     //static yontemlerle ulasabiliriz./ I01__Default_Static.method3();
     //Eger static olarak tanimlanmissa zaten override edemeyiz
        I01__Default_Static.method3();
        C02_Default_Static_Method obj =new C02_Default_Static_Method();
        obj.method1();//Child Class
        obj.method2();//Parent Interface

    }
/*
bir Interface'de default veya static olarak tanimlanan
ve body'si olan method'larin override edilmesi mecburi degildir.

 */
    @Override
    public void method1() {
        System.out.println("Child method1");

    }


}
