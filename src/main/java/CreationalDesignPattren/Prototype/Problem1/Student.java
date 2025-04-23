package CreationalDesignPattren.Prototype.Problem1;

public class Student implements Prototype {
    public  int roll;
    public String name;
    public  String phone;
    private  String email;

    public Student(int roll, String name, String phone, String email) {
        this.roll = roll;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public Prototype clone() {
     return new Student(roll,name,phone,email);

    }
}
