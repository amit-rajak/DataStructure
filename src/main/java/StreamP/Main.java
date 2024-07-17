package StreamP;

import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;
    private int commits;

    public Employee(String name, int commits) {
        this.name = name;
        this.commits = commits;
    }

    public String getName() {
        return name;
    }

    public int getCommits() {
        return commits;
    }
}

class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public Employee getMaxCommitsEmployee() {
        Employee maxEmployee = null;
        for (Employee emp : employees) {
            if (maxEmployee == null || emp.getCommits() > maxEmployee.getCommits()) {
                maxEmployee = emp;
            }
        }
        return maxEmployee;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create departments
        Department dept1 = new Department("HR");
        Department dept2 = new Department("IT");
        Department dept3 = new Department("Sales");

        // Add employees to departments
        dept1.addEmployee(new Employee("Alice", 50));
        dept1.addEmployee(new Employee("Bob", 30));

        dept2.addEmployee(new Employee("Charlie", 75));
        dept2.addEmployee(new Employee("David", 20));

        dept3.addEmployee(new Employee("Eve", 40));
        dept3.addEmployee(new Employee("Frank", 10));

        // List of departments
        List<Department> departments = new ArrayList<>();
        departments.add(dept1);
        departments.add(dept2);
        departments.add(dept3);

        // Find the employee with the maximum commits in each department
        for (Department dept : departments) {
            Employee maxEmployee = dept.getMaxCommitsEmployee();
            if (maxEmployee != null) {
                System.out.println("Department: " + dept.getName());
                System.out.println("Max Commits Employee: " + maxEmployee.getName() + " with " + maxEmployee.getCommits() + " commits");
            } else {
                System.out.println("Department: " + dept.getName() + " has no employees.");
            }
        }
    }
}
