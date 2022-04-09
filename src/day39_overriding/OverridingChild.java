package day39_overriding;

public class OverridingChild extends OverridingParent{

    public  void  method1(){
        System.out.println("Child class method1");
    }

    public static void main(String[] args) {
        OverridingChild obj1=new OverridingChild();
        obj1.method1();//Child class methot1
        obj1.method2();//Parent Class method2


        OverridingParent obj2=new OverridingChild();
        obj2.method2();//Parent Class method2
        obj2.methot1();//Parent Class method1 burasi hata hoca cagirinca chil Class'dan geldi

        OverridingParent obj3=new OverridingParent();
        obj2.method2();//
        obj2.methot1();//




    }
}
