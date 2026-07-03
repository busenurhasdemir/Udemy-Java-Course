public class AkilliTelefon extends Cihaz{

    private int bataryaSeviyesi;

    public AkilliTelefon(String marka, int bataryaSeviyesi){
        super(marka);
        this.bataryaSeviyesi = bataryaSeviyesi;
    }
    public void fotograf_cek(){
        if (isDurum()==true){
            System.out.println(getMarka() + " ile fotoğraf çekildi.");
        }
        else {
            System.out.println("Fotoğraf çekmek için önce telefonu açmalısınız!");
        }
    }
}
