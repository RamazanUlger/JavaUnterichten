package day36_inheritance;

public class Child extends Parent{
    Child(){
        super();
        System.out.println("Child Constructer calisti");
    }
      /*
       Tum Classlarda bi gormesek bile default constructer vardir
       */
    //Extends Keyword kullana claslardaki
    // Tum Constructerlarin  ilk satirinda super() Constructeer'i vardir
    //yani Parent Class'in  parametresiz  constructer call
    public static void main(String[] args) {
        Child child=new Child();
    }
}
