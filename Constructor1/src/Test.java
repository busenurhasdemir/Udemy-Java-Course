public class Test {
    /*Constructor
    - Nesne oluşturulduğu anda otomatik çalışır.
    - Sınıfın adıyla aynı olmak zorundadır, dönüş tipi yoktur.
    - Nesneye başlangıç değerleri vermek için kullanılır.
    */

    public static void main(String[] args) {
        /*Account account1 = new Account();
        Account account2 =new Account("872478478",1000,"Buse","busehasdemrgmail.com","98924898");
        account2.paraCekme(5000);
        account2.paraYatir(450);*/

        Account account1 = new Account("Buse","busehasdemr@gmail.com","19382983");
        //System.out.println(account1.getHesapNo());
        //account1.bilgileriGoster();
        Account account2=account1;;
        Account account3 = new Account();

        if (account2==account1){
            System.out.println("referanslar eşit...");
        }
        if (account2==account3){
            System.out.println("referanslar eşit...");
        }
        else {
            System.out.println("referanslar farklı!!!");
        }
        new Account("Busenur Hasdemir","busehasdemr@gmail.com","389479").bilgileriGoster();
        //bunu referans atayıp yapmadığımız için sadece tek satırlık işlemlerde kullanabiliriz
    }



}
