package day45_interfaces;

public interface I01__Default_Static {
    /*
    Interface'lerde sadece abstect meethod bulunur.
    body'si concrete olan bir method olusturmak istedigimiz de
    ja CTE verir

    ancak java 8 version ve uzeri versiyonlar ile
    istisna olarak static veya default olarak
    tanimlanan methodlarin body'si olabilir
    ancak buruda kulllanilan default keyword access modifier degildir
    cunku Interface'lerde tum methodlar public ve abstract'ti.

    asagidaki ornekte gorulebilecegi gibi
    default olarak tanimlanmis bir method'a access modifier olarak public yazabilirsiniz
    (access modifier yazmazsakda Java method'u public olarak kabul eder)

     */
    void method1();

    public default void method2() {
        System.out.println("Interdace method2");

    }

    static void method3() {
        System.out.println("Interface method3");
    }
}
