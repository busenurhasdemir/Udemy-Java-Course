import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Çalışanlar programına hoşgeldiniz!...");
        String islemler = "İşlemler...\n" +
                          "1. Yazılımcı İşlemleri\n" +
                          "2. Yönetici İşlemleri\n" +
                          "Çıkış iin q'ya basınız...";
        System.out.println("***************************************");
        System.out.println(islemler);
        System.out.println("***************************************");

        while (true){
            System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            else if (islem.equals("1")) {
               Yazilimci yazilimci = new Yazilimci("Busenur","Hasdemir",230717059,"Python,Java");
               String yazilimci_islem = "1. Format At\n" +
                                        "2. Bilgileri Göster\n" +
                                        "Çıkış için q'ya basınız...";
                System.out.println(yazilimci_islem);

                while (true){
                    System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
                    String y_islem = scanner.nextLine();

                    if (y_islem.equals("q")){
                        System.out.println("Yazılımcı işlemlerinden çıkılıyor...");
                        break;
                    }
                    else if (y_islem.equals("1")) {
                        System.out.print("İşletim sistemi: ");
                        String isletim_sistemi = scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                    }
                    else if (y_islem.equals("2")) {
                        yazilimci.bilgileriGoster();
                    }
                    else {
                        System.out.println("Geçersiz işlem!!!");
                    }
                }
            }
            else if (islem.equals("2")) {
                Yonetici yonetici = new Yonetici("Cihat","Çetinkaya",1234567890,82);
                String yonetici_islem = "Yönetici İşlemleri...\n" +
                                        "1. Zam Yap\n" +
                                        "2. Bilgileri Göster\n" +
                                        "Çıkış için q'ya basınız...";
                System.out.println(yonetici_islem);

                while (true){
                    System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
                    String y_islem = scanner.nextLine();

                    if (y_islem.equals("q")){
                        System.out.println("Yönetici işlemlerinden çıkılıyor...");
                        break;
                    }
                    else if (y_islem.equals("1")) {
                        System.out.print("Yöneticinin ne kadar zam yapmasını istiyorsunuz?: ");
                        int zamMiktari = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zamMiktari);
                    }
                    else if (y_islem.equals("2")) {
                        yonetici.bilgileriGoster();
                    }
                    else {
                        System.out.println("Geçersiz işlem!!!");
                    }
                }
            }
            else {
                System.out.println("Geçersiz işlem!!!");
            }
        }
    }
}