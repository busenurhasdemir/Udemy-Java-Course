public class Main {
    public static void main(String[] args) {

        Kopek kopek = new Kopek("Karabaş",50,20,4,42);
        kopek = new Kopek("Pamuk",56,15,4,40) ;
        kopek.kos(40);
        System.out.println(kopek.toString());

    }
}