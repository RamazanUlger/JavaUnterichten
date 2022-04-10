package day40_overriding_pollymorohism;

public class C02 extends C01{
    public void method2(){
        System.out.println("Child Method2");
    }


    public static void main(String[] args) {
        C02 obj1=new C02();
        obj1.method1();//parent method1 calisti
        obj1.method2();//Child Method2


        C01 obj2=new C02();
        obj2.method1();//Child
        obj2.method2();//Parent

        C01 obj3 =new C01();
        obj3.method1();//parent method1 calisti
        obj3.method2();//parent methot2 calisti
    }
}
