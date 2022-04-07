package day25_ListArray;

import java.util.Arrays;
import java.util.List;

public class C06_FromArrayToListArray {
    public static void main(String[] args) {
        String arr[]={"A","B","C",};
        List<String> arraydenList= Arrays.asList(arr);
        //Array'den List'e cevirdigimiz zaman yeni lis'in uzunlugunu
        //degistiremeyiz dolayisiyla yeni list ile add(), remove(),clear()
        //gibi methodlari kallanamayiz ve Exception aliriz

        //arraydenList.add("D");
        System.out.println("degistirilmemis List : "+Arrays.toString(arr));

        arr[1]="F";
        System.out.println("degisen List : "+arraydenList);

        //Array'i degistrip List'i degistirmememize ragmen
        // degisiklik
        //hem array'de hemde Listte otomatikman olusur "

    }
}
