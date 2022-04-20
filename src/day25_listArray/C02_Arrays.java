package day25_listArray;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        //verilen bir arrayden istenen elementleri silip yeni bir
        //element ekleyen bir
        //method olusturun.
        int arr[] = {3, 4, 2, 3, 5, 7, 3, 8, 5, 1, 4};
        int istenmeyenElement = 3;
        istenmeyenElement(arr, istenmeyenElement);
    }

    public static void istenmeyenElement(int[] arr, int istenmeyenElement) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == istenmeyenElement) {
                count++;
            }
        }
        int arrYeni[] = new int[arr.length - count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != istenmeyenElement) {
                arrYeni[index] = arr[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(arrYeni));
    }
}

