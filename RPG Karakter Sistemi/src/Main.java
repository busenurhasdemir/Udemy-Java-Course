public class Main {
    public static void main(String[] args) {
        // İki farklı obje oluşturuyoruz (Constructor kullanımı)
        Karakter savasci = new Karakter("Şövalye Buse", 120, 25);
        Karakter canavar = new Karakter("Gölge Canavarı"); // Varsayılan constructor mantığı

        System.out.println("Savaş Başlıyor!\n");
        savasci.durumYazdir();
        canavar.durumYazdir();

        // Referans etkileşimi: Savaşçı objesi, parametre olarak Canavar objesini alıyor
        savasci.saldir(canavar);

        // Bakalım canavarın canı azaldı mı?
        System.out.println("\nSaldırı Sonrası:");
        canavar.durumYazdir();

        // Canavar dinlenip sağlığını toplasın
        canavar.dinlen();

    }
}