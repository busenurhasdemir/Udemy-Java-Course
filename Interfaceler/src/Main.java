public class Main {
    public static void main(String[] args) {

        //IMuhendis muhendis = new IMuhendis(); //hatalı bu classtan obje üretilmiyor.
        //IMuhendis muhendis = new PcMuhendisi(); //bunun içine parametre yazmadım göstermek için yazdım bunu, bu olur çünkü IMuhendis referans oluşturdu obje üretmedi.

        /*PcMuhendisi muhendis1 = new PcMuhendisi(false,false); //bu okay zaten obje üretebiliyor.

        muhendis1.adli_sicil_sorgula();
        muhendis1.askerlik_durumu_sorgula();
        System.out.println(muhendis1.mezuniyet_ortalamasi(3.27));
        String[] tecrube = {"Vestel", "Havelsan", "Turksat"};
        muhendis1.is_tecrubesi(tecrube);*/


        MakineMuhendisi muhendis2 = new MakineMuhendisi(true,false);

        String[] tecrube = {};
        String[] referans = {"Atıl Samancıoğlu", "Mustafa Murat Coşkun"};
        muhendis2.adli_sicil_sorgula();
        muhendis2.askerlik_durumu_sorgula();
        muhendis2.mezuniyet_ortalamasi(2.31);
        muhendis2.is_tecrubesi(tecrube);
        muhendis2.referans_getir(referans);
        muhendis2.calis();

        IMuhendis muhendis3 = new MakineMuhendisi(true,true);
        ICalisma muhendis4 = new MakineMuhendisi(true,false);



        /* NOT: Biliyoruz ki IMuhendis ile referans oluşturup MakineMuhendisi'nde obje oluşturabilirim ancak burada olmaz çünkü MakineMuhendisi classında
         IMuhendis classında olmayan bir method yazdık extra bir method var yani o yüzden IMuhendis'ten bir referans oluşturup kullanamayız. En iyisi
         kendi referansını kendi oluşturmasıdır. Obje oluşturuken hata almayız ancak örneğin IMühendis'te olmayan bir methodu çağırmak istediğimizde alırız.*/
    }
}