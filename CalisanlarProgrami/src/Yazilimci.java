public class Yazilimci extends Calisan{

    private String diiler;

    public Yazilimci(String ad, String soyad, int id, String diller) {
        super(ad, soyad, id);
        this.diiler = diller;
    }
    public void formatAt(String isletim_sistemi){
        System.out.println(getAd() + " " + isletim_sistemi + "ni yüklüyor...");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yazılımcının bildiği diller: " + diiler);
    }
}
