package day30_passByValue;

public class C02_StaticBlocks {
    {
        System.out.println("Static olmayan blok calisti");
    }
    static{
        System.out.println("Static blok calisti");
    }

    public static void main(String[] args) {
        System.out.println("Main method baslangici");
        C02_StaticBlocks obj=new C02_StaticBlocks();
        C02_StaticBlocks obj1=new C02_StaticBlocks();


    }
}
