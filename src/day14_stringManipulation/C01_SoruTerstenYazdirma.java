package day14_stringManipulation;

import java.util.Locale;

public class C01_SoruTerstenYazdirma {
    public static void main(String[] args) {
        String str="Mavi";
        System.out.println(str.substring(str.length()-1));

        String tersStr=str.substring(3).toUpperCase()+
                str.substring(2,3).toLowerCase()+
                str.substring(1,2).toLowerCase()+
                str.substring(0,1).toLowerCase();
        System.out.println(tersStr);
    }
}
