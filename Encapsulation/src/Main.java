public class Main {
    public static void main(String[] args) {

        Abone abone = new Abone();
        abone.isim = "Buse";
        abone.bakiye = 200;
        abone.sehir = "Ankara";

        abone.dogalgaz_kullan(200);

        GelismisAbone gelismisAbone = new GelismisAbone("Buse",200,"Ankara");
        gelismisAbone.bakiye_ogren();

    }
}