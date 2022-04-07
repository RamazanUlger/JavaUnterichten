package day12_stringManipulation;

public class C04_EndsWith {
    public static void main(String[] args) {
         /*Soru 1) Kullanicidan email
         adresini girmesini isteyin,
         mail @gmail.com icermiyorsa
         “lutfen gmail adresi giriniz”,
         @gmail.com ile bitiyorsa
         “Email adresiniz kaydedildi “ ,
         @gmail.com ile
         bitmiyorsa lutfen yazimi kontol edin yazdirin
    */
        String email = "ramazan5887@hotmail.com";
        String arananMetin = "@gmail.com";
        if (email.endsWith(arananMetin) == false) {
            System.out.println("Lutfen gmail adresi giriniz");
        } else if (email.endsWith(arananMetin)) {
            System.out.println("Email adresiniz kaydedildi");
        } else {
            System.out.println("Lutfen yazimi kontrol ediniz");
        }
    }
}
