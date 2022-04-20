package day27_constructer;

public class Volvo {
    String marka="Volvo";
    String mensei="Isvec";
    String model;
    boolean elektrikliMi;
    int yil;
    String yakit;
    boolean autopilot=otomatikPilotSorgusu();
    int maxHiz=maxHizlimit();

    public int maxHizlimit() {
        int maximumHiz=0;
        if (elektrikliMi) {
            maximumHiz=180;

        }else maximumHiz=240;

        return  maximumHiz;

    }

    private boolean otomatikPilotSorgusu() {
        boolean bl=false;
        if (elektrikliMi) {
         bl=true;
        }
  return bl;  }

    public String toString(){
        String arabaOzellikleri="Model : "+model+
                                "Yakit : "+yakit+
                                "Maximum Hiz: "+maxHiz;
    return arabaOzellikleri;
    }

}
