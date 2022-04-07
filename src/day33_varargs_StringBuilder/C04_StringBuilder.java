package day33_varargs_StringBuilder;

public class C04_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Yasasin Java");

        System.out.println(sb1.indexOf("Java")); //8

        System.out.println(sb1.lastIndexOf("s"));

        System.out.println(sb1.replace(0, 7, "Ne guzel"));//Ne guzel Java

        System.out.println(sb1);//Ne guzel Java cunku StringBuilder mutable'dir

        System.out.println(sb1.toString().toUpperCase());//NE GUZEL JAVA

        System.out.println(sb1);// Ne guze Java yazdirir cunku once Tostring yaptik sonra
        // sonra toUpperCase() metodunu cagirdik bu da string'in degismemesine sebeb oldu
        System.out.println(sb1.delete(0,3));
    }
}
