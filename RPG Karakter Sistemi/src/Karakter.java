public class Karakter {

    private String isim;
    private int saglik;
    private int hasarGucu;
    private int seviye;

    public Karakter(String isim){
        this.isim = isim;
        this.saglik = 100;
        this.hasarGucu = 10;
        this.seviye = 1;
    }
    public Karakter(String isim, int saglik, int hasarGucu){
        this.isim = isim;
        this.saglik = saglik;
        this.hasarGucu = hasarGucu;
    }
    public void saldir(Karakter hedef) {
        System.out.println(this.isim + " -> " + hedef.isim + " karakterine saldırdı!");
        hedef.saglik -= this.hasarGucu; // Hedefin sağlığını azaltıyoruz
    }
    public void dinlen() {
        this.saglik += 20;
        System.out.println(isim + " dinlendi. Yeni sağlık: " + saglik);
    }

    public void durumYazdir() {
        System.out.println("--- " + isim + " Durumu ---");
        System.out.println("Sağlık: " + saglik);
        System.out.println("Hasar: " + hasarGucu);
        System.out.println("Seviye: " + seviye);
        System.out.println("----------------------");
    }

}
