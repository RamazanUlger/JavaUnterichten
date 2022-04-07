package day21_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        String arr1[]={"Ali","Veli","Ayse"};
        System.out.println(arr1[0]);
        arr1[2]="Ramazan";
        System.out.println(arr1[2]);
        //arayin tamamini yadirmak istersek
        int arr2[]=new int[5];
        arr2[4]=45;
        System.out.println(arr2[0]);
        System.out.println(arr2[0]);
        System.out.println(arr2[3]);
        //System.out.println(arr2[6]);***Index disina cikar cunku icine en fazla 5 deger atanabilir
        for (int i = 0; i <5; i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        //arrayin tum elemanlarini yazdirmak istersek
         System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr1));
    }
}
