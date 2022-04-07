package day33_varargs_StringBuilder;

public class C03_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Java cok guzel");
        StringBuilder sb3 = new StringBuilder(10);

        System.out.println("sb1 length : " + sb1.length());//sb1 length : 0
        System.out.println("sb1 kapasitesi : " + sb1.capacity());//sb1 kapasitesi : 16
        System.out.println("sb2 length : " + sb2.length());///sb2 length : 14
        System.out.println("sb2 kapasitesi : " + sb2.capacity());//sb2 kapasitesi : 30
        System.out.println("sb3 length : " + sb3.length());//sb3 length : 0
        System.out.println("sb3 kapasitesi : " + sb2.capacity());//sb3 kapasitesi : 30

        //appent() methodu ile stringBulider'a ekleme yapamabiliriz
        sb1.append("java").append(" ").append("cok").append(" ").append("guzel");
        System.out.println("sb1 length : "+sb1.length());
        System.out.println("sb1 kapasite : "+sb1.capacity());


        sb1.append(3);
        System.out.println(sb1);
        sb1.append(true);

        System.out.println("sb1 length : "+sb1.length());
        System.out.println("sb1 kapasite : "+sb1.capacity());

        sb1.append("Tum dersler java olsa");
        System.out.println("sb1 length : "+sb1.length());
        System.out.println("sb1 kapasite : "+sb1.capacity());

        //**********************************************************************
        //trimToSize() method'unu gerekmeyen fazlaligi yok edebiliriz
        // buda bizim gereksiz veri kullannimizin onune gecmis oluruz
        sb1.trimToSize();
        System.out.println("sb1 length : "+sb1.length());
        System.out.println("sb1 kapasite : "+sb1.capacity());





    }
}