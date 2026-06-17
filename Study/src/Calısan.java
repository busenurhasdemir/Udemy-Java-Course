public class Calısan {
    private String isim;
    private int maas;
    private String departman;

    public Calısan(String isim, int maas, String departman) {
        this.isim = isim;
        this.maas = maas;
        this.departman = departman;
    }
    public void calıs(){
        System.out.println("çalışıyor");
    }
    public void bilgilerigoster(){
        System.out.println("isim: "+this.isim);
        System.out.println("maas: "+this.maas);
        System.out.println("departman: "+this.departman);
    }
    public void departman_degistir(String yeni_departman){
        System.out.println("departman değştiriliyor...");
        this.departman=yeni_departman;
        System.out.println("yeni departman: "+this.departman);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
}
