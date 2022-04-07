package day27_Constructer;

public class ToyotaRunner {
    public static void main(String[] args) {
        Toyota t1=new Toyota();
        System.out.println(t1.marka);//Toyota
        System.out.println(t1.tekerAdedi);//
        System.out.println(t1.model);//null
        t1.model="Corolla";
        t1.yakit="Benzin";
        t1.yil=2012;
        System.out.println("Model : "+t1.model);
        System.out.println("Yakit : "+t1.yakit);
        System.out.println("Model Yili : "+t1.yil);

//*************************************************

        Toyota t2=new Toyota();
        System.out.println(t2.model);//null
        t2.model="Raw4";
        t2.yakit="Diesel";
        t2.yil=2018;
        System.out.println("Model : "+t2.model);
        System.out.println("Yakit : "+t2.yakit);
        System.out.println("Model Yili : "+t2.yil);
        t2.renkTercihleri();


    }




}
