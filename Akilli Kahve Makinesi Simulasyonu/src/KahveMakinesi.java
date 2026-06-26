public class KahveMakinesi {

    private String makineModeli;
    private int suMiktari;
    private int kahveMiktari;
    private int toplamYapilanKahve;

    public KahveMakinesi(String makineModeli){
        this.makineModeli = makineModeli;
        this.suMiktari = 0;
        this.kahveMiktari = 0;
    }

    public String getMakineModeli() {
        return makineModeli;
    }

    public void setMakineModeli(String makineModeli) {
        this.makineModeli = makineModeli;
    }

    public int getSuMiktari() {
        return suMiktari;
    }

    public void setSuMiktari(int suMiktari) {
        this.suMiktari = suMiktari;
    }

    public int getKahveMiktari() {
        return kahveMiktari;
    }

    public void setKahveMiktari(int kahveMiktari) {
        this.kahveMiktari = kahveMiktari;
    }

    public int getToplamYapilanKahve() {
        return toplamYapilanKahve;
    }

    public void setToplamYapilanKahve(int toplamYapilanKahve) {
        this.toplamYapilanKahve = toplamYapilanKahve;
    }
    /*malzemeEkle(int eklenenSu, int eklenenKahve): Parametre olarak sadece iki sayı alacak. İçerideki değişkenleri artıracak.

kahveYap(): Bu metot çalıştığında;

Eğer su >= 50 ve kahve >= 10 ise; suyu 50 azalt, kahveyi 10 azalt, toplamYapilanKahve sayısını 1 artır ve ekrana "Kahveniz hazır!" yaz.

Eğer malzeme eksikse; "Yetersiz malzeme!" uyarısı ver.

durumGoster(): Makinenin modelini, içinde kalan suyu, kahveyi ve toplam kaç kahve yapıldığını yazdır.*/

    public void malzeme_ekle(int eklenen_su, int eklenen_kahve){
        suMiktari+=eklenen_su;
        kahveMiktari+=eklenen_kahve;
    }
    public void kahve_yap(){
        if (suMiktari>=50 && kahveMiktari>=10){
            suMiktari-=50;
            kahveMiktari-=10;
            toplamYapilanKahve+=1;
            System.out.println("Kahveniz Hazır!...");
        }
        else {
            System.out.println("Yetersiz malzeme!!!");
        }
    }
    public void durumuGoster(){
        System.out.println("Makinenin modeli: " + this.makineModeli);
        System.out.println("Kalan su: " + this.suMiktari);
        System.out.println("Kalan kahve: " + this.kahveMiktari);
        System.out.println("Yapılan toplam kahve sayısı: " + this.toplamYapilanKahve);
    }
}
