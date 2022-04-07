package day05_matematikselIslemler;

public class C02_PreIncrementPostInrement {
    public static void main(String[] args) {


        int s1 = 10;
        int s2 = 20;
        int s3 = 30;

        s2 = s1++;
        System.out.println(s1 + " " + s2 + " " + s3);
        s3 = ++s1;
        System.out.println(s1 + " " + s2 + " " + s3);
        System.out.println(s3++);
        System.out.println(--s2);
    }
}
