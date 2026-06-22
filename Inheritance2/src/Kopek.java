public class Kopek extends Hayvan{

    private int dis_sayisi;

    public Kopek(String isim, int boy, int kilo, int bacak_sayisi, int dis_sayisi){
        //constructorlar method değildir
        super(isim,boy,kilo,bacak_sayisi);
        this.dis_sayisi = dis_sayisi;
    }
    public void harekete_gec(int hiz){
        System.out.println("Köpek " + hiz + " ile hareket ediyor...");
    }

    public void kos(int hiz){
        System.out.println("Köpek koşuyor...");
        harekete_gec(hiz);
        super.harekete_gec(hiz);
        /*super.harekete_gec(hiz) yaparsan superclasstaki method çağırılır
        ama harekete_gec(hiz9 yaparsan bulunduğun classtaki method çağırılır
        eğer subclassta aynı methodtan yoksa super demeden de superclasstaki methodu kullanabiliriz.*/

    }

    public int getDis_sayisi() {
        return dis_sayisi;
    }

    public void setDis_sayisi(int dis_sayisi) {
        this.dis_sayisi = dis_sayisi;
    }

    @Override
    public String toString() {
        return "Kopek{" +
                "dis_sayisi=" + dis_sayisi +
                "} " + super.toString();
    }
}
