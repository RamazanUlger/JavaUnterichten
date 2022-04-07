package day35_inheritance;

public class Child_01 extends Parent {
    public static void main(String[] args) {
         //Child clas hic bir obje ihtiyac duymadan
        //parent class'taki method ve variablelara ulasabilir

        System.out.println(isim);
        System.out.println(fabrika);
        method1();
        method2();
    }
}
