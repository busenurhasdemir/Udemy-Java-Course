public class Bird extends hayvan {
    private String gender;

    public Bird(String name, int age, String color, String gender) {
        super(name, age, color);
        this.gender = gender;
    }
    public void harekete_gec(int hız){
        System.out.println("bird "+hız+" ile uçuyor");
    }

    @Override
    public String toString() {
        return "buse";
    }

    public void uc(int hız){
        System.out.println("bird ucuyor");
        harekete_gec(hız);
    }

    //hayvan hayvan1= new hayvan();
        //hayvan1.bilgilerigoster();
        //hayvan hayvan2=new hayvan("mavis");
        //hayvan2.bilgilerigoster();
        /*System.out.println(hayvan2.getName());
        System.out.println(hayvan1.getAge());
        System.out.println(hayvan2.getColor());*/
        //hayvan hayvan2= new hayvan("mavis",5,"blue");


       /* hayvan1.name= "mavis";
        hayvan1.age= 5;
        hayvan1.color= "blue";
        System.out.println(hayvan1.name + hayvan1.age + hayvan1.color);*/

        /*hayvan1.setName("mavis");
        System.out.println("adı: "+hayvan1.getName());
        hayvan1.setAge(5);
        System.out.println("yas: "+hayvan1.getAge());
        hayvan1.setColor("blue");
        System.out.println("renk: "+hayvan1.getColor());*/


}