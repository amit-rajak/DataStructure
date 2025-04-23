package StreamP;

import java.util.*;
import java.util.stream.Collectors;

class Employee1 {
    int id;
    int salary;
    String departmentName;

    public Employee1() {

    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getSalary() { return salary; }
    public void setSalary(int salary) { this.salary = salary; }

    public String getDepartmentName() { return departmentName; }
    public void setDepartmentName(String departmentName) { this.departmentName = departmentName; }

    public void printAllDepartmentNamesOrderBySalaryDesc(List<Employee1> emps) {
        emps.stream()
                .collect(Collectors.groupingBy(Employee1::getDepartmentName, Collectors.summingInt(Employee1::getSalary)))
                .entrySet()
                .stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue())) // Sort by salary in descending order
                .forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
    }

    public static void main(String[] args) {
        List<Employee1> employees = Arrays.asList(
                new Employee1(1, 100, "A"),
                new Employee1(2, 200, "B"),
                new Employee1(3, 300, "C"),
                new Employee1(4, 800, "A"),
                new Employee1(5, 350, "C"),
                new Employee1(6, 550, "B"),
                new Employee1(7, 400, "C")
        );

        Employee1 emp = new Employee1();
        emp.printAllDepartmentNamesOrderBySalaryDesc(employees);
    }

    // Constructor for convenience
    public Employee1(int id, int salary, String departmentName) {
        this.id = id;
        this.salary = salary;
        this.departmentName = departmentName;
    }
}
