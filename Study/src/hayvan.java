public class hayvan {

    public String name;
    public int age;
    public String color;

    public void bilgilerigoster() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.color);
    }

    public hayvan() {
        //this.name="bigi yok";
        //this.age=0;
        //this.color="bilgi yok"
        this("bilgi yok", 0, "bilgi yok");
    }

    public hayvan(String name) {
        //this.name=name;
        //this.age=0;
        //this.color="bilgi yok";
        this(name, 0, "bilgi yok");
    }

    public hayvan(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void harekete_gec(int hız) {
        System.out.println("hayvan " + hız + " ile uçuyor");
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        return this.name +" "+ this.age+ " "+ this.color;
    }
}

