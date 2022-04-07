package day26_forEachLoop_Constructer;

public class C01_ForEacgLop {
    public static void main(String[] args) {
        int [] arr ={2,4,6,8,11};
        //bunu once for loop ile yazdiral
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    //bunu foreachloop ile yapacak olaraksak
        //foreachloop calistirmaik icin hedef bir collection vermeliyiz

        for (int each:arr
        ) {
            System.out.print(each+" ");
        }
        // avantaji : index baslangic degeri, bitis degeri gibi detaylarla
        //ugrasmamiza gerek kalmadan collections'dan tum elementleri
        // bize dondurur
        //dezavantaji : index'e bagli bir islem yapamayiz calismaz
    }
}
