public class Yonetici extends Calisan { //Subclass

    private int sorumu_kisi;

    public Yonetici(String isim, int maas, String departman, int sorumu_kisi){
        /*this.isim = isim;
        this.maas = maas;
        this.departman = departman;*/
        super(isim,maas,departman);
        this.sorumu_kisi =sorumu_kisi;
    }
    public void zam_yap(int zam_miktari){
        System.out.println("Çalışanlara " + zam_miktari + " TL zam yapıldı...");
    }
    public void bilgileriGoster(){
        /*System.out.println("İsim: " + getIsim());
        System.out.println("Maaş: " + getMaas());
        System.out.println("Departman: " + getDepartman());
        System.out.println("Sorumlu kişi: " + this.sorumu_kisi);*/
        super.bilgileriGoster();
        System.out.println("Sorumlu kişi: " + this.sorumu_kisi);
    }

}
