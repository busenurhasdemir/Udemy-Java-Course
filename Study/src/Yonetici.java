public class Yonetici extends Calısan{
    private int yas;
    public Yonetici(String isim, int maas, String departman,int yas) {
        super(isim, maas, departman);
        this.yas=yas;
    }
    public void zam_yap(int zam_miktarı){
        System.out.println("çalışanlara "+zam_miktarı+" tl zam yapıldı");
    }
    public void bilgilerigoster(){
        //System.out.println("isim: "+this.getIsim());
        //System.out.println("maas: "+this.getMaas());
        //System.out.println("departman: "+this.getDepartman());
        super.bilgilerigoster();
        System.out.println("yas: "+this.yas);
    }
}
