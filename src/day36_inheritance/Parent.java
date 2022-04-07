package day36_inheritance;

public class Parent {
  protected  Parent(){
        System.out.println("Parent parametresiz Constructer calisti.");
    }

   public Parent(int sayi3,int sayi4){
        System.out.println("Parent iki parametreli Const.");
    }
    protected  int sayi;
}
