public class Student {
    private String name;
    private String schoolNumber;
    private String department;
    private static final String lecturer="ata";

    public static void hi(){
        System.out.println("hello!!!");
    }

    public Student(String name,String schoolNumber,String department){
        this.name=name;
        this.schoolNumber=schoolNumber;
        this.department=department;
    }


    public Student(String name) {
        this.name = name;
    }


    public void printName(){
        System.out.println(this.name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(String schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static String getLecturer() {
        return lecturer;
    }


}
