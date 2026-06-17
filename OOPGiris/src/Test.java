public class Test {
    public static void main(String[] args) {
        /*
        Araba araba1 = new Araba();

        araba1.renk = "Kırmızı";
        araba1.kapilar = 4;
        araba1.tekerlekler = 4;
        araba1.motor = "16V";
        araba1.model = "Renault";

        System.out.println(araba1.motor);
        */

        Araba araba1 = new Araba();

        araba1.setModel("Renault");
        System.out.println("Arabanın modeli: " + araba1.getModel());
        araba1.setKapilar(-1);
        araba1.setKapilar(4);
        System.out.println(araba1.getKapilar());

        /* referansa obje ataması yapmadan erişemezsin null'e eşitlersen hata vermez o an
         ama erişmeye çalışınca hata alırsın*/


    }
}
