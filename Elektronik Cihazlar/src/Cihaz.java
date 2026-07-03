public class Cihaz {

    private String marka;
    private boolean durum;

    public Cihaz(String marka){
        this.marka = marka;
        this.durum = false;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public boolean isDurum() {
        return durum;
    }

    public void setDurum(boolean durum) {
        this.durum = durum;
    }

    public void ac(){
        this.durum = true;
        System.out.println("Telefon açılıyor...");
    }
    public void kapat(){
        this.durum = false;
        System.out.println("Telefon kapatılıyor...");
    }
}
