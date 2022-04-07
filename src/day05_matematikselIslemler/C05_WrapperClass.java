package day05_matematikselIslemler;

public class C05_WrapperClass {
    public static void main(String[] args) {
        short s1;
        s1=20;
        Short s2;
        s2=30;
        s1=s2;
        System.out.println(s1);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.BYTES);
    }
}
