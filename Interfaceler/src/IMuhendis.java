public interface IMuhendis {

    //Interface'den obje oluşturulmuyor

    void askerlik_durumu_sorgula();
    String mezuniyet_ortalamasi(double derece);
    void adli_sicil_sorgula();
    void is_tecrubesi(String[] array);

    // Bu methodlar soyut (abstract) metoddur.
    // Anlamı: "Bu iş yapılacak ama nasıl yapılacağını ben (interface) bilmiyorum, beni kullanacak olan sınıf buna karar versin." der.
    // Kullanım Alanı: Sadece Interface veya Abstract Class içinde bulunurlar.

    // DİĞER {} İLE BİTEN METHODLAR

    // Anlamı: "Bu iş tam olarak şöyle yapılacak." der ve adım adım yapılacak işlemleri (if-else, döngüler, yazdırma komutları) içerir.
    // Kullanım Alanı: Normal sınıflarda (Class) bulunur.
    // Farkı: Metodun tüm mantığı bu parantezlerin arasındadır.


}
