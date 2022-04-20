package day27_constructer;

public class Toyota {
    String marka ="Toyota";
    int tekerAdedi= 4;
    boolean motorVarMi=true;
    String model;
    String yakit;
    int yil;

    public  void maxHiz(){
        if (yakit.equals("Benzin")) {
            System.out.println("Benzinli araclar maximum 240 km/h hiz yapar");
        }else if (yakit.equals("Dizel")) {
                System.out.println("Dizel araclar maximum 260 km/h hiz yapar");

            }
        }
        public void renkTercihleri(){
            if (model.equals("Corolla")) {
                System.out.println("Corolla rek secenekleri kirmizi vr byazdir");
            }else if (model.equals("Raw4")) {
                System.out.println("Yaris renk secenekleri Mavi ve Kirmizidir");
            }
        }
    }
    


