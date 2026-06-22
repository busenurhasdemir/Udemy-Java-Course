public class Hayvan {

    private String isim;
    private int boy;
    private int kilo;
    private int bacak_sayisi;

    public Hayvan(String isim, int boy, int kilo, int bacak_sayisi){
        this.isim = isim;
        this.boy = boy;
        this.kilo = kilo;
        this.bacak_sayisi = bacak_sayisi;
    }
    public void yemek_ye(){
        System.out.println("Hayvan şu anda yemek yiyor...");
    }
    public void harekete_gec(int hiz){
        System.out.println("Hayvan " + hiz + " ile hareket ediyor...");
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public int getBacak_sayisi() {
        return bacak_sayisi;
    }

    public void setBacak_sayisi(int bacak_sayisi) {
        this.bacak_sayisi = bacak_sayisi;
    }

    @Override
    public String toString() {
        return "Hayvan{" +
                "isim='" + isim + '\'' +
                ", boy=" + boy +
                ", kilo=" + kilo +
                ", bacak_sayisi=" + bacak_sayisi +
                '}';
    }
}
