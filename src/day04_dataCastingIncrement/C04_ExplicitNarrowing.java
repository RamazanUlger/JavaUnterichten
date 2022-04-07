package day04_dataCastingIncrement;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {
        int s1=879;

        double s2=10;
        double s3=s1/s2;
        System.out.println(s3);
        int s4= (int) (s1/s2);
        System.out.println(s4);
        int  s5=140;
        byte s6= (byte) s5;
        System.out.println(s6);
        int  s7=256;
        byte s8= (byte) s7;
        System.out.println(s8);

    }
}
