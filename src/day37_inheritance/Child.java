package day37_inheritance;

import day36_inheritance.Parent;

public class Child  extends Parent {
    //bir call'i Child Class yaptigimizda
    //parent  class'daki Constructer'a ulasmasi gerekir
    //bu durumda parent class'daki constructer'in
    //access modifier'i uygun bir access modifier yapilmalidir

    //Child class'da tum constructer'larin ilk satirina
    //Java'inn yerlestirdigi  constructer PARAMETRESIZ'dir yani super()
    Child(){
        super();
        System.out.println("Child Class parametresiz  Const.");
    }
    Child(int s){
        System.out.println("Child class parametreli Const.");
    }

    Child (int sayi,int sayi2){
      //eger Parent Class'tan  parametresiz Constructer'I
        // degil de parametreli olanini calistirmak istersek
        //bunu Child Class'taki Constructer'in ilk Satirina
        //yazilmalidir super(sayi,sayi2) orneginde oldugu gibi

       super(sayi,sayi2);
        System.out.println("iki parametreli Const.");
    }

    public static void main(String[] args) {
        Child child=new Child(5);
    }
}
