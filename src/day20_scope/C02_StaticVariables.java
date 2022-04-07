package day20_scope;

public class C02_StaticVariables {
    static String okuIsmi = "Yildiz oleji";
    static int okulNo;
    static boolean okulAcikMi;

     public static void main(String[] args) {
         System.out.println(okuIsmi);//Yildiz Koleji
         System.out.println(okulNo);//0
         okulNo=102;
         System.out.println(okulNo);//102
         System.out.println(okulAcikMi);//false

         staticMethod();//method'a gider

         System.out.println(okulNo);

     }
     public  static void staticMethod(){
         okulNo=200;
         System.out.println(okulNo);
     }
}
