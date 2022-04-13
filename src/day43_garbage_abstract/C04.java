package day43_garbage_abstract;

public abstract class C04 {
    /*
    bir Abstract class'da Abstract veya concrete methodlar
    bulunabilir. Child Class'larin Abstract methodlari override
    etmesi  MECBURI iken concrete method'larin override edilmesi opsiyoneldir

     */
    public abstract void abstractMethod();
    public void C07_MethodCreation(){
        System.out.println("C04 concrete method");
    }

    public static void main(String[] args) {
        /*
        Abstract Claslar Constructer'a sahiptir
        ancak Abstract calss'lardan OBJE OLUSTURULAMAZ!!!!

        Abstract Classlar obje
        barindirmayan sadece
        Child Class icin
        uyulmasi sart olan veya opsiyonel birakilan
        ozellikleri tanimldigimiz
        bir depo gibidir.....


         */
        //C04 obj =new C04();
        System.out.println("bu class Abstract");
    }
}
