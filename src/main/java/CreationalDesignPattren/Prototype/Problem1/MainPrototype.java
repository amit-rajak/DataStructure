package CreationalDesignPattren.Prototype.Problem1;

public class MainPrototype {
    Student student= new Student(10,"name","9094646","name@gmail.com");
    Student clone= (Student) student.clone();
}
