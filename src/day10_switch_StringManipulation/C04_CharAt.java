package day10_switch_StringManipulation;

public class C04_CharAt {
    public static void main(String[] args) {
        String str = "Java cok Guzel";
        System.out.println(str.charAt(0));
        // J'i yazdirir
        // va'i yazdiralim
        System.out.println("" + str.charAt(2) + str.charAt(3));
        // basina Bir hiclik "" koyarsak ciktiyi
        // String olarak concat ederek aliriz

        // G'i yazdiralim
        System.out.println(str.charAt(9));
        //cOK seklinde yazdiralim ????????????????
        System.out.println("" + str.toLowerCase().charAt(5) +
                str.toUpperCase().charAt(6) +
                str.toUpperCase().charAt(7));
    }
}
