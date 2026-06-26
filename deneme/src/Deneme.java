import java.util.Scanner;

public class Deneme {
    /*
    public static void faktoriyel(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int faktoriyel = 1;
        int sayi = scanner.nextInt();

        while (sayi>0){
            faktoriyel *= sayi;
            sayi--;
        }
        System.out.print("faktöriyel: " + faktoriyel);
    }
    */
    /*
    public static void toplama(int a,int b,int c){
        System.out.println("toplamları = " + (a+b+c));
    }
    */
    /*
    public static int toplama(int a,int b,int c) {
        return (a+b+c);
    }
    */
    /*
    public static int ikiilecarp(int a){
        return (a*2);
    }
    public static int ikiiletopla(int a){
        return (a+2);
    }
    public static int ikiilebol(int a){
        return (a/2);
    }
    */
    /*
    // 1'deb 1000'e kadar olan sayılardan asal olanları bulma

    public static boolean asalMi(int sayi){
        for (int i = 2; i<sayi; i++){
            if (sayi%i==0){
                return false;
            }
        }
        return true;
    }
    */
    /*
    // Kullanıcıdan alınan 2 sayının EBOB'unu bulma

    public static int ebobBulma(int sayi1, int sayi2){

        int ebob = 1;

        for (int i = 1; i<=sayi1 && i<=sayi2; i++){
            if ((sayi1%i==0) && (sayi2%i==0)){
                ebob = i;
            }
        }
        return ebob;
    }
    */

    // Overloading kullanarak gelişmiiş hesap makinesi

    public static int cikarma(int a, int b){
        return (a-b);
    }
    public static double bolme(int a, int b){
        return ((double)a/b);
    }
    public static int toplama(int a, int b){
        return (a+b);
    }
    public static int toplama(int a, int b, int c){
        return (a+b+c);
    }
    public static int carpma(int a, int b){
        return (a*b);
    }
    public static int carpma(int a, int b, int c){
        return (a*b*c);
    }




    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String islemler = "1.işlem toplama\n"+
                          "2.işlem çıkarma\n"+
                          "3.işlem çarpma\n"+
                          "4.işlem bölme\n"+
                          "Çıkış için q'ya basın.";
        System.out.println("*****************************************");
        System.out.println(islemler);
        System.out.println("*****************************************");

        while (true){
            System.out.print("Yapacağınız işlemi seçiniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Çıkış yaptınız!...");
                break;
            }
            else if(islem.equals("1")){
                System.out.print("Kaç değer toplayacaksınız? (2 veya 3): ");
                int degerSayisi = scanner.nextInt();

                if (degerSayisi==2){
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen sayıların toplamı: " + toplama(a, b));
                }
                else if(degerSayisi==3){
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    System.out.print("c: ");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen sayıların toplamı: " + toplama(a, b, c));
                }

            }
            else if(islem.equals("2")){
                System.out.print("a: ");
                int a = scanner.nextInt();
                System.out.print("b: ");
                int b = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Girilen sayıların farkı: " + cikarma(a, b));
            }
            else if(islem.equals("3")){
                System.out.print("Kaç değer çarpacaksınız? (2 veya 3): ");
                int degerSayisi = scanner.nextInt();

                if (degerSayisi==2){
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen sayıların çarpımı: " + carpma(a, b));
                }
                else if(degerSayisi==3){
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    System.out.print("c: ");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen sayıların çarpımı: " + carpma(a, b, c));
                }
            }
            else if(islem.equals("4")){
                System.out.print("a: ");
                int a = scanner.nextInt();
                System.out.print("b: ");
                int b = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Girilen sayıların oranı: " + bolme(a, b));
            }
            else{
                System.out.println("Geçersiz işlem!!!...");
            }
        }












        /*
        // Kullanıcıdan alınan 2 sayının EBOB'unu bulma
        Scanner scanner =  new Scanner(System.in);

        System.out.print("Birinci sayı: ");
        int birinci_sayi = scanner.nextInt();
        System.out.print("İkini sayı: ");
        int ikinci_sayi = scanner.nextInt();

        System.out.println("İki sayının EBOB'u: " + ebobBulma(birinci_sayi,ikinci_sayi));
        */
        /*
        // 1'deb 1000'e kadar olan sayılardan asal olanları bulma

        for (int i = 2; i<1000; i++){
            if (asalMi(i)){
                System.out.println(i);
            }
        }
        */


        //byte-->short-->int-->long
        //int-->float-->double
        //from left to right
        //char-->2**16 character 'one character'
        //boolean--> true-false
        //"Java\tPython" --> Java    Python
        /* "Java\nPython" --> Java
                              Python*/
        //int a=7 System.out.println(a++) --> 7    System.out.println(++a) --> 8

        /*
        Scanner scanner1 = new Scanner(System.in);
        int num1 = scanner1.nextInt();
        System.out.println("number is: " + num1);

        Scanner scanner2 = new Scanner(System.in);
        String str1 = scanner2.nextLine();
        System.out.println(str1);

        Scanner scanner3 = new Scanner(System.in);
        float num2= scanner3.nextFloat();
        System.out.println("number is: " + num2);

        Scanner scanner = new Scanner(System.in);
        int num3 = scanner.nextInt();
        scanner.nextLine();
        String str2 = scanner.nextLine();
        System.out.println(num3 + ":" + str2);
        */
        /*
        // beden kitle indeksi = kilo/ (boy * boy)

        Scanner scanner = new Scanner(System.in);
        System.out.println("kilonuz: ");
        float kilo = scanner.nextFloat();
        System.out.println("boyunuz: ");
        float boy = scanner.nextFloat();
        if (kilo<boy){
            boy=boy/100;
            System.out.println("beden kitle indeksiniz: " + kilo/(boy*boy));
        }
        else{
            System.out.println("beden kitle indeksiniz: " + kilo/(boy*boy));
        }
        */
        /*
        //kaç kilometrede ne kadar yaktı?

        Scanner scanner = new Scanner(System.in);
        System.out.print("Aracınız km'de ne kadar yakıyor? : ");
        float ucret = scanner.nextFloat();
        System.out.print("Kaç km yol aldınız? : ");
        int yol = scanner.nextInt();
        float toplam = ucret * yol;
        System.out.println("Toplam ucret : " + toplam);
        */
        /*
        //sayıları değiştirme

        Scanner scanner = new Scanner(System.in);
        int birinci_sayi;
        int ikinci_sayi;
        System.out.print("Birinci sayıyı giriniz: ");
        birinci_sayi = scanner.nextInt();
        System.out.print("İkici sayıyı giriniz: ");
        ikinci_sayi = scanner.nextInt();

        System.out.println("Birinci sayı: " + birinci_sayi + " " + "İkinci sayı: " + ikinci_sayi);

        int gecici = birinci_sayi;
        birinci_sayi = ikinci_sayi;
        ikinci_sayi = gecici;

        System.out.println("Birinci sayı: " + birinci_sayi + " " + "İkinci sayı: " + ikinci_sayi);
        */
        /*
        //hipotenüs bulma
        Scanner scanner = new Scanner(System.in);
        int birinci_kenar;
        int ikinci_kenar;
        double ucuncu_kenar;

        System.out.print("birinci kenarı giriniz: ");
        birinci_kenar = scanner.nextInt();
        System.out.print("ikinci kenarı giriniz: ");
        ikinci_kenar = scanner.nextInt();
        ucuncu_kenar = Math.sqrt(birinci_kenar*birinci_kenar + ikinci_kenar*ikinci_kenar);
        System.out.println("hipotenus: " + ucuncu_kenar);
        */
        // SWITCH-CASE YAPILARI
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir islem giriniz! : ");
        int islem = scanner.nextInt();

        switch (islem){
            case 1:
                System.out.println("1. islem...");
                break;
            case 2:
                System.out.println("2.islem...");
                break;
            case 3:
                System.out.println("3.islem...");
                break;
            case 4:
                System.out.println("4.islem...");
                break;
            default:
                System.out.println("Geçersiz islem!..");
                break;
        }
        */
        /*
        // girilen üç sayıdan maxı bulma

        Scanner scanner= new Scanner(System.in);
        System.out.print("birinci sayı: ");
        int sayi1 = scanner.nextInt();
        System.out.print("ikinci sayı: ");
        int sayi2 = scanner.nextInt();
        System.out.print("üçüncü sayı: ");
        int sayi3 = scanner.nextInt();

        if (sayi1>=sayi2 && sayi1>=sayi3){
            System.out.println("max: " + sayi1);
        }
        else if (sayi2>=sayi1 && sayi2>=sayi3) {
            System.out.println("max: " + sayi2);
        }
        else{
            System.out.println("max: " + sayi3);
        }
        */
        /*
        // beden kitle indeksi

        Scanner scanner = new Scanner(System.in);
        System.out.print("kilonuz: ");
        int kilo = scanner.nextInt();
        System.out.print("boyunuz: ");
        double boy = scanner.nextDouble();
        double bki = kilo/(boy*boy);

        if (kilo<boy){
            boy = boy/100;
            bki = kilo/(boy*boy);
        }
        if (bki<18.5){
            System.out.println(bki + " Zayıf!..");
        }
        else if (18.5<=bki && bki<25) {
            System.out.println(bki + " Normal...");
        }
        else if (25<=bki && bki<30) {
            System.out.println(bki + " Fazla kilolu!..");
        }
        else if (30<=bki){
            System.out.println(bki + " Obez!!!..");
        }
        */
        /*
        // switch-case kullanarak hesap makinesi

        Scanner scanner = new Scanner(System.in);
        System.out.println("ISLEMLER");
        String islemler = "1. islem toplama!\n"+
                          "2. islem cikarma!\n"+
                          "3. islem carpma!\n"+
                          "4. islem bolme!";
        System.out.println(islemler);
        int a;
        int b;
        System.out.println("Yapmak istediğiniz işlem nedir? :");
        String islem = scanner.nextLine();

        switch (islem){
            case "1.":
                System.out.println("Birinci sayıyı giriniz! : ");
                a = scanner.nextInt();
                System.out.println("İkinci sayıyı giriniz!");
                b = scanner.nextInt();
                System.out.println("Sayıların toplamı: " + (a+b));
                break;
            case "2.":
                System.out.println("Birinci sayıyı giriniz! : ");
                a = scanner.nextInt();
                System.out.println("İkinci sayıyı giriniz!");
                b = scanner.nextInt();
                System.out.println("Sayıların farkı: " + (a-b));
                break;
            case "3.":
                System.out.println("Birinci sayıyı giriniz! : ");
                a = scanner.nextInt();
                System.out.println("İkinci sayıyı giriniz!");
                b = scanner.nextInt();
                System.out.println("Sayıların çarpımı: " + (a*b));
                break;
            case "4.":
                System.out.println("Birinci sayıyı giriniz! : ");
                a = scanner.nextInt();
                System.out.println("İkinci sayıyı giriniz!");
                b = scanner.nextInt();
                System.out.println("Sayıların oranı: " + ((double)a/b));
                break;
            default:
                System.out.println("Geçersiz bir işlem girdiniz!:");
        }
        */
        /*
        // Gelişmiş not hesaplama

        Scanner scanner = new Scanner(System.in);
        System.out.print("1.vizenizden kaç aldınız? : ");
        int vize_1 = scanner.nextInt();
        System.out.print("2.vizenizden kaç aldınız? : ");
        int vize_2 = scanner.nextInt();
        System.out.print("Final sınavınızdan kaç aldınız? : ");
        int final_exam = scanner.nextInt();
        int genel_not = (vize_1*30/100) + (vize_2*30/100) + (final_exam*40/100);
        System.out.print("Ortalamanızı 4 üzerinden (örn:2,71) giriniz! : ");
        double ort = scanner.nextDouble();

        if (genel_not >= 90){
            System.out.println("Harf notunuz: AA");
        }
        else if (genel_not >= 85) {
            System.out.println("Harf notunuz: BA");
        }
        else if (genel_not >= 80) {
            System.out.println("Harf notunuz: BB");
        }
        else if (genel_not >= 75) {
            System.out.println("Harf notunuz: CB");
        }
        else if (genel_not >= 70) {
            System.out.println("Harf notunuz: CC");
        }
        else if (genel_not >= 65) {
            System.out.println("Harf notunuz: DC");
        }
        else if (genel_not >= 60) {
            System.out.println("Harf notunuz: DD");
            if (ort < 2.50){
                System.out.println("Ortalamanız da harf notunuz da pek iyi sayılmaz, daha çok çalışmalısınız!");
            }
        }
        else if (genel_not >= 55) {
            System.out.println("Harf notunuz: FD");
        }
        else if (55 > genel_not && genel_not >= 0) {
            System.out.println("Harf notunuz: FF");
        }
        else{
            System.out.println("Sınav notlarınızda hata var kontrol ediniz!");
        }
        */

        /* for döngüsünde önce değişken tanımla (eğer burada tanımlarsan değişken sadece döngüye özgü olur)
           koşulu yaz
           yapacağın işemi yaz
        */
        /*
        // FOR DÖNGÜSÜYLE FAKTÖRİYEL

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int faktoriyel = 1;
        int sayi = scanner.nextInt();

        for (int i = 1; i <= sayi; i++){
            faktoriyel *= i;
        }
        System.out.print("faktöriyel: " + faktoriyel);
        */
        /*
        // WHILE DÖNGÜSÜYLE FAKTÖRİYEL

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int faktoriyel = 1;
        int sayi = scanner.nextInt();

        while (sayi>0){
            faktoriyel *= sayi;
            sayi--;
        }
        System.out.print("faktöriyel: " + faktoriyel);
        */
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("bir sayı giriniz: ");
        int faktoriyel = 1;
        int i = 1;
        int  sayi = scanner.nextInt();;

        while (i<=sayi){
            faktoriyel *= i;
            i++;
        }
        System.out.print("faktöriyel: " + faktoriyel);
        */
        /*
        // DO WHILE SAYILARIN RAKAMLARININ TOPLAMI

        Scanner scanner = new Scanner(System.in);
        System.out.print("bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        int toplam = 0;

        do {
            toplam += sayi % 10;
            sayi /= 10;
        }
        while (sayi > 0);
        System.out.println("Rakamların toplamı: " + toplam);
        */
        /*
        // BREAK

        int i = 0;

        while (i<10){
            if (i==5){
                break;
            }
            System.out.println("i = " + i);
            i++;
        }
        i=0;
        for (;i<10;i++){
            if (i==7){
                break;
            }
            System.out.println("i = " + i);
        }
        Scanner scanner = new Scanner(System.in);
        while (true){
            int islem = scanner.nextInt();
            if (islem==-1){
                System.out.println("Döngüden çıkılıyor...");
                break;
            }
            System.out.println(islem);
        }
        */
        /*
        // CONTINUE

        for (int i = 0; i<10; i++){
            if (i==3 || i==5){
                continue;
            }
            System.out.println("i = " + i);
        }
        int i = 0;

        while (i<10){
            if (i==3 || i==5){
                i++;
                continue;
            }
            System.out.println("i = " + i);
            i++;
        }
        */
        /*
        // DÖNGÜLERLE ATM PROGRAMI

        Scanner scanner = new Scanner(System.in);
        String islemler = "1. işlem: Bakiye öğrenme \n"
                        + "2. işlem: Para çekme \n"
                        + "3. işlem: Para yatırma \n"
                        + "Çıkış için q'a basın";
        System.out.println("**************************");
        System.out.println(islemler);
        System.out.println("**************************");
        int bakiye = 1000;

        while (true){
            System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Programdan çıkılıyor!...");
                break;
            }
            else if (islem.equals("1")) {
                System.out.println("Bakiyeniz: " + bakiye);
            }
            else if (islem.equals("2")) {
                System.out.print("Çekmek istediğiniz tutar: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                if (tutar>bakiye){
                    System.out.println("Bakiyeniz yetersiz!!! \n"
                                       + "Bakiyeniz: " + bakiye);
                }
                else {
                    bakiye-=tutar;
                    System.out.println("Yeni bakiyeniz: " + bakiye);
                }
            }
            else if (islem.equals("3")) {
                System.out.println("Yatırmak istediğiniz tutar: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                bakiye+=tutar;
                System.out.println("Yeni bakiyeniz: " + bakiye);
            }
            else {
                System.out.println("Geçersiz işlem!...");
            }
        }
        */
        /*
        // GİRİLEN BİR SAYININ ARMSTRONG SAYISI OLUP OLMADIĞINI BULMA

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        int toplam = 0;
        int uzunluk = String.valueOf(sayi).length();
        int gecici_sayi = sayi;

        do {
            int rakam = gecici_sayi%10;
            gecici_sayi /= 10;
            toplam += Math.pow(rakam,uzunluk);

        }
        while (gecici_sayi>0);

        if (toplam==sayi){
            System.out.println("Bu sayı bir armstrong sayısıdır...");
        }
        else {
            System.out.println("Bu sayı bir armstrong sayısı değil...");
        }
        */
        /*
        // İÇ İÇE FOR DÖNGÜSÜYLE ÇARPIM TABLOSU OLUŞTURMA

        for (int i = 1; i<=10; i++){
            System.out.println("");
            for (int j = 1; j<=10; j++){
                System.out.print(i + "x" + j + "=" + (i*j) + "\t");
            }
        }
        */
        /*
        // KULLANICI GİRİŞİ PROGRAMI

        Scanner scanner = new Scanner(System.in);
        int giris_hakkı = 3;
        String kullanici_adi = "Buse";
        String kullanici_sifresi = "123456";
        System.out.println("**********************************");
        System.out.println("Kullanıcı girişine hoşgeldiniz!...");
        System.out.println("**********************************");

        while (true){
            System.out.print("Kullanıcı adınızı giriniz: ");
            String kullanici = scanner.nextLine();
            System.out.print("Kullanıcı parolanızı giriniz: ");
            String parola = scanner.nextLine();

            if (kullanici.equals(kullanici_adi) && parola.equals(kullanici_sifresi) && giris_hakkı!=0){
                System.out.println("Sisteme giriş yaptınız...");
                break;
            }
            else if ((!kullanici.equals(kullanici_adi) && parola.equals(kullanici_sifresi)) && giris_hakkı!=0){
                System.out.println("Kullanıcı adı hatalı, lütfen tekrar deneyiniz!...");
                giris_hakkı-=1;
                if (giris_hakkı==0){
                    System.out.println("Giriş hakkınız bitti, lütfen 24 saat içinde tekrar denemeyiniz!!!...");
                    break;
                }
                System.out.println(giris_hakkı + " " + "giriş hakkınız kaldı!");
            }
            else if ((kullanici.equals(kullanici_adi) && !parola.equals(kullanici_sifresi)) && giris_hakkı!=0){
                System.out.println("Kullanıcı şifresi hatalı, lütfen tekrar deneyiniz!...");
                giris_hakkı-=1;
                if (giris_hakkı==0){
                    System.out.println("Giriş hakkınız bitti, lütfen 24 saat içinde tekrar denemeyiniz!!!...");
                    break;
                }
                System.out.println(giris_hakkı + " " + "giriş hakkınız kaldı!");
            }
            else if (giris_hakkı!=0){
                System.out.println("Kullanıcı adı ve kullanıcı şifresi hatalı, lütfen tekrar deneyiniz!...");
                giris_hakkı-=1;
                if (giris_hakkı==0){
                    System.out.println("Giriş hakkınız bitti, lütfen 24 saat içinde tekrar denemeyiniz!!!...");
                    break;
                }
                System.out.println(giris_hakkı + " " + "giriş hakkınız kaldı!");
            }
        }
        */
        /*
        // FAİZ UYGULAMASI

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamıza hoş geldiniz! Bankamızın faiz oranı %6'dır.");

        int anapara,vade;
        System.out.print("Anaparanız: ");
        anapara = scanner.nextInt();
        System.out.print("Paranızı kaç yıl vadeli yatırmak istiyorsunuz?: ");
        vade = scanner.nextInt();

        double toplampara = anapara;
        double faizoranı = 0.06;

        for (int i = 1; i<=vade; i++){
            toplampara += (toplampara * faizoranı);
        }
        System.out.println(vade + " " + "sonunda toplam paranız: " + toplampara);
        */


        //                                             FONKSİYONLAR


    }

}
