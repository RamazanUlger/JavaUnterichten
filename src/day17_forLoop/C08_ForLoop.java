package day17_forLoop;

public class C08_ForLoop {
    public static void main(String[] args) {
        /*
         Soru 9 ) Interview Question Kullanicidan
         bir String isteyin.
         Kullanicinin girdigi String’in palindrome
         olup olmadigini kontrol eden bir method yazin.
         */
        String input="Ravar";
        palindromeKontrolEt(input);

    }

    private static void palindromeKontrolEt(String input) {
    String tersInput="";
        for (int i = input.length()-1; i >=0 ; i--) {
            tersInput+=input.charAt(i);
        }
        System.out.println("Tersten yazim : "+tersInput);
        if (tersInput.equalsIgnoreCase(input)) {
            System.out.println(input+" palindromdur");
        }else {
            System.out.println(input+" palindrom degildir");
        }
    }
}
