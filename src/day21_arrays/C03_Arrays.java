package day21_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {
        int arr[];//deger atamasi yapmadik ama java kabul etti.
        //System.out.println(Arrays.toString(arr));//ama yazdirimayiz CTE aliriz
        arr=new int[6];
        System.out.println(Arrays.toString(arr));//[0, 0, 0, 0, 0, 0] olarak verir
        System.out.println(arr.length);//ARRay boyutu bulmak icin kullancagimiz method'dur.
        //Array'in her bir elamanini degerini birer artiralim
        for (int i = 0; i <arr.length ; i++) {
            arr[i]+=i;
        }
        System.out.println(Arrays.toString(arr));
        //tersten yazdiralim
       /* for (int i = arr.length-1; i >0 ; i--) {
              arr[i]+=i;
        }*/
        System.out.println(Arrays.toString(arr));

        //Son Index'i yazdiralim
        System.out.println(arr[arr.length-1]);
        int arr1 [][]={{1,2,3},{7,3}};
        int arr2 [][]={{1,2,3},{7,3,2}};
        int arr3 [][]={{1,2,3},{7,3}};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr2));

    }
}
