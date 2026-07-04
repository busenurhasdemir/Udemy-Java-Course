import jdk.jfr.StackTrace;

import java.util.Scanner;
import java.util.logging.StreamHandler;

public class Main {


    public static void mekan_kontrol(int yas, String isim) throws Exception{
        if (yas<18 || (isim.equalsIgnoreCase("Şükrü") || isim.equalsIgnoreCase("şüko"))){
            throw new Exception();
        }
        else {
            System.out.println("Mekana hoşgeldiniz...");
        }
    }

    public static void main(String[] args) throws Exception{


        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen yaşınızı giriniz: ");
        int yas = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Lütfen isminizi giriniz: ");
        String isim = scanner.nextLine();


        //mekan_kontrol(yas,isim); // main methodunun yanına throws Exception yazdıktan sonra try-catch yapmaya gerek yok

        try {
            mekan_kontrol(yas,isim);
        }
        catch (Exception e){
            System.out.println("18 yaşından küçükler ve şükolar mekana giremez!!!");
        }

        /*
        try{

            int a = 30/0;
            String s = null;
            System.out.println(s.hashCode());
        }
        catch (ArithmeticException e){
            System.out.println("Bir sayı 0'a bölünemez!");
        }
        catch (NullPointerException e){
            System.out.println("Null referans hatası...");
        }
        finally {
            System.out.println("Finally bloğu çalışıyor...");
        }
        System.out.println("Burası çalışıyor...");
        */

        /*
        try{
            int[] a = {1, 2, 3, 4, 5};
            System.out.println(a[6]);

            int b = 30/0;
        }
        catch (ArithmeticException e){
            System.out.println("Bir sayı 0'a bölünemez!!!");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Arrayin boyunu aştınız!!!");
        }
        catch (Exception e){  // Başka exceptionlar varsa exception en alta yazılır.
            System.out.println("Bir hata oluştu...");
            System.err.println("HATA!!!");
            //e.printStackTrace();
        }
        System.out.println("Burası çalışıyor...");
        */

        /*
        try {
            int[] a = {1, 2, 3, 4, 5};
            System.out.println(a[6]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Arrayin boyunu aştınız!!!");
        }
        System.out.println("Burası çalışıyor...");
        */

        /*
        try {
            int a = 30 / 0;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Bir sayı 0'a bölünemez!!!");
        }
        */


    }
}