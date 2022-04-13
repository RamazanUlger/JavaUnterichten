package day43_garbage_abstract;

public abstract class C03_Abstract  {

    public abstract void abstractMethod();

    /*
    Abstract methodlar child class'larin MUTLAKA override etmesi gereken methodlardir
    dolayisiyla  HICBIR ZAMAN direk calistirilmazlar
    ve bu sebeple method bodysine ihtiyac yoktur

    bir class'in veya bir methodun Abstract olup olmadigini anlayabilirmiyiz?
    Abstract yaziyorsa Abstract'dir, yazmiyorsa degildir
    (Abstract olamayan Class/method concrete denir)

    Abstract methodlar body'e aship olamaz
    Concrete methodlar ise method bodysi olamadan olusturulamaz
     */

}
