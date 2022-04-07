package day14_stringManipulation;

public interface C02_Trim {
    public static void main(String[] args) {

        String str ="    Siz ne derseniz deyin java bildigini uygular.             ";
    str=str.trim();
        System.out.println(str.length());//bosluksuz
        str=str.trim();
        System.out.println(str.length());//bosluksuz


    }

}
