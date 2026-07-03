public class Person {
    private String name;
    private String telNumber;
    private int age;

    public Person(String name, String telNumber, int age) {
        this.name = name;
        this.telNumber = telNumber;
        this.age = age;
    }

    public void hi(){
        System.out.println("hii!!!!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", telNumber='" + telNumber + '\'' +
                ", age=" + age +
                '}';
    }
}
