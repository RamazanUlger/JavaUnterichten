package day42_exceptions;

public class C02_CastException {
    public static void main(String[] args) {
        int sayi=10;
       // String str = sayi; //CTE
        Object str3="Java Cok guzel";
        String str4=(String) str3;


        Object sayi2=20;
        String str2=(String)sayi2;//Explicit Narrowing yaparak atayabilir ama bize herseye ragmen Eception verir



    }
}
