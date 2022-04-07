package day05_matematikselIslemler;

public class C01_PreIncrementPostIncrement {
    public static void main(String[] args) {
        int s1=10;
        s1++;
        System.out.println(s1);
        s1++;
        System.out.println("Pre-incrementten once : "+ s1);//12'dir
        System.out.println("pre-increment satirinda : "+ ++s1);//preincrement satirinda sayi 13 oldu.
        System.out.println("pre-incrementten sonra"+ s1);//13

        //****************Post-Increment****************

        System.out.println("post-increment satirinda"+ s1++);//13
        System.out.println("post-incrementten sonra"+s1);//14
    }
}
