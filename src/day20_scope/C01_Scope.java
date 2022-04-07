package day20_scope;

public class C01_Scope {
    int sayi;
    String okulIsmi="Yildiz Koleji";
    boolean okulAcikMi;
    public static void main(String[] args) {
       // sayi=10; Sayi Variable static olmadigi icin
        //main method'dan direk kullanilamaz
        // Instance varible'laara static methodlardan ulasabilmek
        //obje olusturmamiz gerekir
        C01_Scope obj1=new C01_Scope();
        System.out.println(obj1.sayi);//0
        obj1.sayi=10;
        System.out.println(obj1.sayi);//10
        obj1.okulIsmi="Ay koleji";
        System.out.println(obj1.okulIsmi);

        //2. obje olusturalim
        //0 yazdirir cunku degerini
        // sifirlayipdegerini
        // tekrar class seviyesinde ki
        // sayi variable'indan alir
        C01_Scope obj2=new C01_Scope();
        System.out.println(obj2.sayi);
        //obj2.okulIsmi
        //Uyari : yarim kaldi*******************





        }

}
