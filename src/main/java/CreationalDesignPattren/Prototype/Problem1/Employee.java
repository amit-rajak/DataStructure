package CreationalDesignPattren.Prototype.Problem1;

public class Employee implements Prototype {

    public  int id;
    public String name;
    public String address;

    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public Prototype clone() {
        return new Employee(id,name,address);
    }
}
