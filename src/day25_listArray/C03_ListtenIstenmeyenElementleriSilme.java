package day25_listArray;

import java.util.ArrayList;
import java.util.List;

public class C03_ListtenIstenmeyenElementleriSilme {
    public static void main(String[] args) {
        //verilen bir arrayden istenen elementleri silip yeni bir
        //element ekleyen bir
        //method olusturun.
        int arr[] = {3, 4, 2, 3, 5, 7, 3, 8, 5, 1, 4};
        int istenmeyenElement = 3;
        istenmeyenElement(arr, istenmeyenElement);
    }

    private static void istenmeyenElement(int[] arr, int istenmeyenElement) {
    List<Integer> yeniList=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] != istenmeyenElement) {
                yeniList.add(arr[i]);
            }
        }
        System.out.println(yeniList);
    }
}
