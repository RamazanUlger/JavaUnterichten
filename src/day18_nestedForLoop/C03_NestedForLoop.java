package day18_nestedForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {
      /*  Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
                *
        * *
        * * *
        * * * *

       */
        //nested for loop ya dikdortgen veya ucgen
        //formatin da olabilir
        //dikdortgen istedigimizde iki loop icin de
        //bagimsiz endpoint belirleriz
        //ucgen sekli vermek icin inner loop'un
        //endpoint'ini outer(i) degiskene baglariz

        int input=5;
        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.println("*");
            }
        }
    }
}
