import java.util.Scanner;

public class Main {
    public static void merhaba(){
        System.out.println("merhaba");
    }

    public static void toplama(int num1,int num2){
        int toplam=num1+num2;
        System.out.println("sayıların toplamı: "+toplam);
        merhaba();
    }






    public static void toplama(int num1, int num2,int num3){
        System.out.println("sayıların toplamı: "+(num1+num2+num3));
    }

    public static void çıkarma(double num1,double num2){
        /*double fark=num1-num2;
        System.out.println("sayıların farkı: "+ fark);*/

        System.out.println("sayıların farkı: "+(num1-num2));
    }

    public static void çarpma(int num1, int num2){
        int number= num1*num2;
        System.out.println("sayıların çarpımı"+ number);
    }
    public static void bölme(double num1, double num2){
        double number= num1/num2;
        System.out.println("sayıların bölümü" + number);
    }

    /*public static String ismim(String isim,int yaş){
        return isim;

    }*/
    public static int ismim(String isim,int yaş){
        return yaş;
    }




    public static void yashesap(String isim, int doğumYılı, int şimdikiYıl){
        int number= şimdikiYıl - doğumYılı;
        System.out.println("yaşın: "+ number);
    }

    public static double ortalamahesaplama(double not1, double not2){
        return (not1+not2)/2;
    }
    
    public static void ortalamahesaplama2(){
        Scanner scanner= new Scanner(System.in);



    }

    public static void student(String name,String surname, String department, int schoolNumber){
        String a= name;
        String b= surname;
        String c= department;
        int d= schoolNumber;
        System.out.println("name: "+a);
        System.out.println("surname: "+b);
        System.out.println("number: "+d);
    }
    public static void üçgen(int x,int y,int z){
        int alan=(x*y)/2;
        int çevre=(x+y+z);
        System.out.println("üçgenin alanı: "+alan);
        System.out.println("üçgenin çevresi: "+çevre);

    }
    public static void üçgen2(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("birinci kenarı gir: ");
        int x= scanner.nextInt();
        System.out.print("ikinci kenarı gir: ");
        int y= scanner.nextInt();
        System.out.print("üçüncü kenarı gir: ");
        int z= scanner.nextInt();
        System.out.println("üçgenin alanı: "+ x*y/2);
        System.out.println("üçgenin çevresi: " + (x+y+z));


    }
    public static void ciftler(int limit){
        for (int i = 0; i<=limit ; i+=2) {
            System.out.println(i);

        }
    }
    public static void ciftler2(int limit){
        int i=1;
        while (i<limit){
            System.out.println(i);
            i+=2;
        }
    }







    public static void main(String[] args) {
        /*
        *String
        *char
        byte
        short
        *int
        float
        *double
        long
        * boolean
         */
        /*double a=27.5;
        double b=47.2;
        double sum=a+b;
        System.out.println(sum);
        double x=3^4;
        System.out.println(x);*/

        /*int a=5;
        double b=7.5;
        double y= a+b;
        double c=5;
        System.out.println(y);
        System.out.println(c);*/

        /*String name="buse";
        String surname="hasdemir";
        System.out.println(name+8+surname);*/

        /*char değişken='a';
        String isim="şükrü";*/

        /*Scanner scanner= new Scanner(System.in);
        System.out.print("adını gir:");
        String isim=scanner.nextLine();
        System.out.print("soyadını gir:");
        scanner.nextLine();
        System.out.print("yaşını gir:");
        int yaş=scanner.nextInt();

        System.out.println("5 yıl sonraki yaşınız= "+(yaş+5));*/

        /*Scanner scanner=new Scanner(System.in);
        System.out.print("adın: ");
        String name=scanner.nextLine();
        System.out.print("bölüm: ");
        scanner.nextLine();
        System.out.print("okul numarası: ");
        scanner.nextInt();
        System.out.println("merhaba "+name);*/



        /*boolean a=true;
        boolean b=false;
        // ve= &&  veya= ||
        System.out.println((a || b) && b);*/

        //toplama(2,4);

        /*çıkarma(2,4.66);
        çıkarma(3,55);*/

        //çarpma(8,9);
        //bölme(7,6);


        //System.out.println(ismim("buse",12));

       /* public static String ismim(String isim){
            return isim;
        }*/

        //System.out.println(ismim("esub",12));
        //System.out.println(ismim("buse",12));
        //yashesap("şükrü",2005,2025);

        //ortalamahesaplama(90,80);
        //System.out.println(ortalamahesaplama(90,80));

        //student("şükrü","tan","software",14);
        //üçgen(6,8,10);

        /*üçgen2();*/

        /*
        if-else
        for
        while
         */

        /*int age=20;
        if(age>18){
            System.out.println("You are an adult.");
        }
        else{
            System.out.println("You are a kid.");
        }*/

        /*int result=65;
        if(result<=40){
            System.out.println("Fail");
        }
        else if(40<result && result<=70){
            System.out.println("Average");
        }
        else{
            System.out.println("Successful");
        }*/

        /*int value=6;
        if(value==5){
            System.out.println("The value is equal 5.");
        }
        else{
            System.out.println("The value is not equal 5.");
        }*/

        /*int result=105;
        if(0<=result && result<=40){
            System.out.println("Fail");
        }
        else if(40<result && result<=70){
            System.out.println("Average");
        }
        else if(70<result && result<=100){
            System.out.println("Successful");
        }
        else{
            System.out.println("Please enter a number between 0-100.");
        }*/

        /*String name="buse";
        if(name.equals("buse")){
            System.out.println("You are Buse");
        }
        else{
            System.out.println("You are not buse");
        }*/

        /*Scanner scanner=new Scanner(System.in);
        System.out.print("please, enter cost of shoes: ");
        int cost= scanner.nextInt();
        if(0<cost && cost<=100){
            System.out.println("cheap");
        }
        else if(100<cost && cost<=500){
            System.out.println("average");
        }
        else if (cost>500){
            System.out.println("expensive");
        }
        else{
            System.out.println("please enter suitable cost");
        }*/


        /*for(int i=0;i<=10;i+=2){
            System.out.println("Value of i: "+i);
        }*/

        /*for (int i=1; i<=10;i++){
            System.out.println("square of i: " + i*i);
        }*/

        /*Scanner scanner= new Scanner(System.in);
        System.out.print("please enter a number: ");
        int limit=scanner.nextInt();
        for (int i=1; i<=limit; i++){
            System.out.println("square of: "+i +":" + i*i);
        }*/
        /*int number=5;
        while(number==5){
            System.out.println("The number is equal 5");
            number=6;
        }*/

        /*int i=1;
        while(i<10){
            if(i==3){
                System.out.println("num = 3");
            }
            else if(i==5){
                System.out.println("num = 5");
            }
            else{
                System.out.println(i);
            }
            i++;
        }*/

        //ciftler(20);
        //ciftler2(30);


        /*int a=5;
        int b=3;
        b=a;
        System.out.println(a);
        System.out.println(b);*/

        /*int a=2;
        int b=3;
        if(a!=b){
            System.out.println("qqqqqq");
        }
        else{
            System.out.println("wwwwww");
        }*/
        //System.out.println(Math.abs(20-42));
        /*System.out.println(1);
        System.exit(0);
        System.out.println(2);*/


        //int[] array={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        //System.out.println(array[19]);
        /*for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }*/
        /*for (int i:array){
            System.out.println(i*2);
        }*/

        /*for (int i=0;i<10;i++) {
            if(i==5){
                break;
            }
            System.out.println(i);
        }*/
        /*for (int i=0;i<10;i++) {
            System.out.println(i);
            if(i==5){
                continue;
            }

        }*/

        /*int[] array={1,2,3,4,5};
        System.out.println(array[1]);*/

        //int[]==[1 2 3 4 5]
        /*
        int[][]==[1 2 3]
                 [4 5 6]
                 [7 8 9]
         */
        /*int[][]array={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(array[2][1]);*/

        /*Student st1=new Student();
        st1.setName("eylül");
        System.out.println(st1.getName());
        st1.setSchoolNumber("240717063");
        System.out.println(st1.getSchoolNumber());*/

        /*Student st1=new Student("eyloş","63","soft");
        System.out.println(st1.getName());
        st1.setName("eylül");
        System.out.println(st1.getName());

        Student st2=new Student("buse");*/

        /*Student st1=new Student("eyloş","63","soft");
        st1.printName();*/
        /*toplama(2,3);
        toplama(2,3,4);*/
        //Student st1=new Student("eylül","63","soft");


        Student st1=new Student("eylül","063","soft");
        Student st2=new Student("ela","064","seng");
        /*System.out.println(st1.getName());
        System.out.println(st2.getName());
        System.out.println(st1.getLecturer());
        System.out.println(st2.getLecturer());*/
        //System.out.println(st1.getLecturer());
        //Student.hi();

        ///System.out.println(Math.PI);
        //System.out.println(Math.pow(2,3));
        //System.out.println(Math.floor(Math.random()));
        /*Person p1=new Person("eylül","63",18);
        System.out.println(p1);*/
        Person p1=new Person("Ela","35",18);
        Lecturer l1=new Lecturer("Eylül","63",18,"MSKÜ");
        p1.hi();


        























    }
}