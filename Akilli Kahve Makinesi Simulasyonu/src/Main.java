public class Main {
    public static void main(String[] args) {

        KahveMakinesi makine1 = new KahveMakinesi("Philips");
        makine1.malzeme_ekle(64,17);
        makine1.kahve_yap();
        KahveMakinesi makine2 = makine1;
        makine2.malzeme_ekle(40,6);
        makine2.kahve_yap();
        makine1.durumuGoster();
    }
}