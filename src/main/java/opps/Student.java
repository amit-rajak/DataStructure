package opps;

// Java Program to Demonstrate Working of
// Comparator Interface Via More than One Field

// Importing required classes
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Student {
    String Name;
    int Age;

    public Student(String Name, Integer Age)
    {
        this.Name = Name;
        this.Age = Age;
    }
    public String getName() { return Name; }

    public void setName(String Name) { this.Name = Name; }

    public Integer getAge() { return Age; }

    public void setAge(Integer Age) { this.Age = Age; }
    @Override public String toString()
    {
        return "Customer{"
                + "Name=" + Name + ", Age=" + Age + '}';
    }
}

class CustomerSortingComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int NameCompare =o1.getName().compareTo(o2.getName());
        int Byage =o1.getAge().compareTo(o2.getAge());

        return (NameCompare == 0) ? Byage : NameCompare;
       // return Byage;

    }
}

class GFG {
    public static void main(String[] args)
    {

        List<Student> al = new ArrayList<>();
        Student obj1 = new Student("Ajay", 27);
        Student obj2 = new Student("Sneha", 23);
        Student obj3 = new Student("Simran", 37);
        Student obj4 = new Student("Ajay", 22);
        Student obj5 = new Student("Ajay", 29);
        Student obj6 = new Student("Sneha", 22);
        al.add(obj1);
        al.add(obj2);
        al.add(obj3);
        al.add(obj4);
        al.add(obj5);
        al.add(obj6);
        Iterator<Student> custIterator = al.iterator();
        System.out.println("Before Sorting:\n");
        while (custIterator.hasNext()) {
            System.out.println(custIterator.next());
        }
        Collections.sort(al,
                new CustomerSortingComparator());
        System.out.println("\n\nAfter Sorting:\n");
        for (Student customer : al) {
            System.out.println(customer);
        }
    }
}

