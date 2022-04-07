package day23_multiDimentionalArrays;

import java.util.Arrays;

public class C06_Arrays {
    public static void main(String[] args) {
// verilen bir array'e yeni bir element
// ekleyen  bir method olusturun
        int[] arr = {3, 5, 7};
        int eklenecekElement = 4;
        arr = arrayeElamanEkleme(arr, eklenecekElement);

        System.out.println(Arrays.toString(arr));
   }

    public static int[] arrayeElamanEkleme(int[] arr, int eklenecekElement) {
        int yeniArr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            yeniArr[i] = arr[i];
        }
        yeniArr[yeniArr.length - 1] = eklenecekElement;
        return yeniArr;
    }
}
