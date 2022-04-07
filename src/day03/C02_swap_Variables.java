package day03;

public class C02_swap_Variables {
    public static void main(String[] args) {
      /**  1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP) bir program yaziniz
        Orn  : sayi1=10 ve sayi2=20;
        kod calistiktan sonra
                sayi1=20 ve sayi2=10*/
      int s1=10;
      int s2=20;
      int kova;
      kova=s1;
    s1=s2;
    s2=kova;
        System.out.println(s1+" "+s2);
    }
}
