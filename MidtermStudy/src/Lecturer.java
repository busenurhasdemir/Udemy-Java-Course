public class Lecturer extends Person{
    private String school;
    public Lecturer(String name, String telNumber, int age,String school) {
        super(name, telNumber, age);
        this.school=school;
    }

    @Override
    public void hi() {
        System.out.println("selamun aleyküm");
    }
}
