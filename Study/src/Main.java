import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

   /* public static int ekok(int sayı1,int sayı2){
       int ekok = 1;

        for (int i =sayı1 ;  i<=sayı1*sayı2  ; i+=sayı1) {

            if((i%sayı1==0) && (i%sayı2==0)){

                ekok = i;
                return ekok;

            }

        }
        return ekok;


    }*/


   /* public static void fact(int num){
        int factorial=1;

        while(num>0){
            factorial*=num;
            num--;
        }
        System.out.println("Factorial: "+factorial);
    }*/

   /* public static void factoriel(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("bir sayı gir: ");
        int sayı= scanner.nextInt();

        int factoriel= 1;

        while (sayı>0){
            factoriel*=sayı;
            sayı--;
        }
        System.out.println("factoriel: "+factoriel);
    }

    public static void isim(String isim){
        System.out.println("isminiz "+isim);
    }*/
    public static void badmethod(){
        throw new ArithmeticException();
    }

    public static void main(String[] args){
        //Bird bird=new Bird("mavis",5,"blue","erkek");
        //bird.uc(10);


        //Yonetici yonetici=new Yonetici("buse",120000,"software devoloper",25);
        //yonetici.zam_yap(20000);
        //yonetici.bilgilerigoster();
        //new hayvan("mavis").bilgilerigoster();
        /*char a= 61;
        char b = '\u04A6';
        char c = '\u04DC';

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(47f/8d);
        System.out.println(45/7.9);
        System.out.println(76%5);*/

        /*int b = 3;
        b /=2;
        b *=6;
        b -=1;
        b +=9;
        System.out.println(b);*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Adınızı giriniz: ");
        String isim = scanner.nextLine();
        System.out.println("Adınız: " + isim);*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Boyunuzu giriniz: (Örnek: 1.72 )");
        double boy= scanner.nextDouble();
        System.out.println("Kilonuzu giriniz: ");
        int kilo= scanner.nextInt();
        double bki= kilo/(boy*boy);
        System.out.println("Kitle endeksiniz: " + bki);


        Scanner scanner= new Scanner(System.in);
        System.out.println("Kilometrede ne kadar yakıyor?: ");
        double litre= scanner.nextDouble();
        System.out.println("Yol kaç km?: ");
        double km= scanner.nextDouble();
        double tutar= litre*km;
        System.out.println("Toplam maliyet: " + tutar);*/

        /*Scanner scanner= new Scanner(System.in);
        int birinci_sayı;
        int ikinci_sayı;

        System.out.println("Birinci sayıyı giriniz: ");
        birinci_sayı= scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        ikinci_sayı= scanner.nextInt();
        System.out.println("Ilk hali: ");
        System.out.println("birinci: "+ birinci_sayı + " " + "ikinci: " + ikinci_sayı);
        int gecici= birinci_sayı;
        birinci_sayı= ikinci_sayı;
        ikinci_sayı= gecici;
        System.out.println("Son hali: ");
        System.out.println("birinci: "+ birinci_sayı + " " + "ikinci: " + ikinci_sayı);*/

        /*Scanner scanner=new Scanner(System.in);
        System.out.println("Birinci kenar: ");
        int kenar1= scanner.nextInt();
        System.out.println("İkinci kenar: ");
        int kenar2= scanner.nextInt();
        String kenar3= "a";
        System.out.println("Ucuncu kenar: " + kenar3);
        System.out.println("Ucuncu kenar = hipotenus ");

        double hipotenus= StrictMath.sqrt(kenar1*kenar1 + kenar2*kenar2);
        System.out.println("hipotenus= " + hipotenus);*/


        /*System.out.println(2 == 3);
        System.out.println("buse"=="burak");
        System.out.println("buse"=="Buse");
        System.out.println(55!=77);
        System.out.println(45<=65);*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println(" What is your name? : ");
        String name= scanner.nextLine();

        if (name.equals("buse")) {
            System.out.println("your name is buse");
        }
        Scanner scanner1= new Scanner(System.in);
        System.out.println("What is your surname? : ");
        String surname= scanner1.nextLine();

        if (surname.equals("terim")){
            System.out.println("You are buse terim");
        }

        else {
            System.out.println("you are someone else");
        }*/

        /*int m= 4;
        int result = 3*(++m);
        System.out.println(result);
        System.out.println(m);*/

        /*int m =4;

        int result=3*(++m);

        System.out.println(result);
        System.out.println(m);*/

       /* Scanner scanner = new Scanner(System.in);
        System.out.print("vize1: ");
        int vize1= scanner.nextInt();
        System.out.print("vize2: ");
        int vize2= scanner.nextInt();
        System.out.print("final: ");
        int final0= scanner.nextInt();
        System.out.println("Ortalama");
        double ortalama = scanner.nextDouble();


        double toplamnot = (vize1*3/10.0) + (vize2*3/10.0) + (final0*4/10.0);


        if (toplamnot >=90) {
            System.out.println("AA");
        }
        else if (toplamnot >=80) {
            System.out.println("BA");
        }
        else if (toplamnot >=75) {
            System.out.println("BB");
        }
        else if (toplamnot >=70) {
            System.out.println("CB");
        }
        else if (toplamnot >=65) {
            System.out.println("CC");
        }
        else if (toplamnot >= 60) {
            System.out.println("DD");

            if (ortalama <= 1.80) {
                System.out.println("DD aldınız ve kaldınız dersi bi daha alacaksınız");
            }
        }
        else {
            System.out.println("FF yani sınıf tekrarı");
        }*/

        /*for (int i = 0; i <5 ; i++ ) {
            System.out.println("i: " +i);

        }
        for (int a=0; a<5 ; ++a) {
            System.out.println("a:" +a);

        }*/
        /*int i =0;
        while (i<10){
            System.out.println("i= " + i);
            i--;
        }*/

        /*int[] nums={63,59,14,56,48};

        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
        for (int i : nums){
            System.out.println(i);

        }

        hayvan h=new hayvan("mavis",5,"erkek");
        h.uç();*/


        //factoriel();
        //isim("buse");

        /*int i=5;
        i=7;
        System.out.println(i);*/

        /*Scanner scanner= new Scanner(System.in);
        System.out.print("sayı1: ");
        int sayı1= scanner.nextInt();
        System.out.print("sayı2: ");
        int sayı2= scanner.nextInt();
        System.out.print("ekok: " + ekok(sayı1,sayı2));*/

        //hayvan h=new hayvan("tekir");
        //System.out.println("a: "+5+3);

        //int[] array1={10,20,30,40,50};
        //int[] array2=new int[5];
        //String[] array3={"a","bb","ccc"};

        //for(int i=0;i<array1.length;i++){
        //    System.out.println(array1[i]);
        //}
        //for(String a:array3){
        //    System.out.println(a);
        //}

        //ArrayList<Integer> arraylist=new ArrayList<Integer>();
        //arraylist.add(5);
        //arraylist.add(2);
        //arraylist.add(4);
        //arraylist.remove(2);
        //System.out.println(arraylist);

        /*ArrayList<hayvan> hayvanArraylist=new ArrayList<hayvan>();
        hayvan h1=new hayvan("maviş");
        hayvan h2=new hayvan("limon");
        hayvan h3=new hayvan("ayaz");
        hayvan h4=new hayvan("bodi",5,"siyah");

        hayvanArraylist.add(h1);
        hayvanArraylist.add(h2);
        hayvanArraylist.add(h3);
        hayvanArraylist.add(h4);
        System.out.println(hayvanArraylist);*/

        /*HashMap<String,Integer> hash=new HashMap<String,Integer>();
        hash.put("şükrü",10);
        hash.put("buse",90);
        hash.put("eylül",80);

        System.out.println(hash);
        System.out.println(hash.get("buse"));*/












    }
}