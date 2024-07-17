package com.stream.streamOperation;

import com.datastructure.Java8Stream.EmployeeBean.employee;
import com.datastructure.Recursion.SelectionSort;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
//https://javaconceptoftheday.com/solving-real-time-queries-using-java-8-features-employee-management-system/
public class TestEmployeeClass {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));


        //Query 3.1 : How many male and female employees are there in the organization?

        Map<String,Long>  noOfMaleAndFemale=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
       System.out.println(noOfMaleAndFemale);

        //Query 3.2 : Print the name of all departments in the organization?
        System.out.println("Query 3.2 : Print the name of all departments in the organization?");

       List<String> dept=employeeList.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
       System.out.println(dept);

        //Query 3.3 : What is the average age of male and female employees?
        System.out.println("Query 3.3 : What is the average age of male and female employees?");

        Map<String,Double> avgAge=employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingLong(Employee::getAge)));

                System.out.println(avgAge);

        Map<String, Double> avgAge1 = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.collectingAndThen(Collectors.averagingDouble(Employee::getAge),avg -> BigDecimal.valueOf(avg).setScale(2, RoundingMode.HALF_UP).doubleValue())));

        System.out.println(avgAge1);
        //Query 3.4 : Get the details of highest paid employee in the organization?
        System.out.println("Query 3.4 : Get the details of highest paid employee in the organization?");

        Optional<Employee> highestPaidEmployeeWrapper=
                employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        System.out.println(highestPaidEmployeeWrapper);

        //Query 3.2 : Print the name of all departments in the organization?
        System.out.println("Query 3.2 : Print the name of all departments in the organization?");
        employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

      //Query 3.5 : Get the names of all employees who have joined after 2015?
        System.out.println("Query 3.5 : Get the names of all employees who have joined after 2015");

        employeeList.stream().
                filter(e -> e.getYearOfJoining() >2015)
                .map(employee->employee.getName()).forEach(System.out::println);

        //3.6 : Count the number of employees in each department?
        System.out.println("3.6 : Count the number of employees in each department?");

        Map<String,Long> noEmpEachDept=
                employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println(noEmpEachDept);

       // Set<Map.Entry<String, Long>> entrySet = noEmpEachDept.entrySet();

        for (Map.Entry<String, Long> entry : noEmpEachDept.entrySet())
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        //Query 3.7 : What is the average salary of each department?
        System.out.println("Query 3.7 : What is the average salary of each department?\n");

        Map<String,Double> avgSalOfEachDept=employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));

      // System.out.println(avgSalOfEachDept);

        for(Map.Entry<String,Double> entry : avgSalOfEachDept.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());


        }

        //Query 3.8 : Get the details of youngest male employee in the product development department?

        System.out.println("Query 3.8 : Get the details of youngest male employee in the product development department?\n");


        Optional<Employee> employee= employeeList.stream().filter(em-> em.getGender().equalsIgnoreCase("Male") && em.getDepartment().equalsIgnoreCase("Product Development"))
                .min(Comparator.comparingInt(Employee::getAge));

         Employee empData= employee.get();

         System.out.println(empData.getAge());
        System.out.println(empData.getGender());
        System.out.println(empData.getSalary());
        System.out.println(empData.getId());
        System.out.println(empData.getDepartment());
        System.out.println(empData.getYearOfJoining());

        //Query 3.9 : Who has the most working experience in the organization?
        System.out.println("Query 3.9 : Who has the most working experience in the organization?");



        Optional<Employee> employee1= employeeList.stream().
                sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();

        Employee seniorMostEmployee = employee1.get();

        System.out.println("Senior Most Employee Details :");

        System.out.println("----------------------------");

        System.out.println("ID : "+seniorMostEmployee.getId());

        System.out.println("Name : "+seniorMostEmployee.getName());

        System.out.println("Age : "+seniorMostEmployee.getAge());

        System.out.println("Gender : "+seniorMostEmployee.getGender());

        System.out.println("Age : "+seniorMostEmployee.getDepartment());

        System.out.println("Year Of Joinging : "+seniorMostEmployee.getYearOfJoining());

        System.out.println("Salary : "+seniorMostEmployee.getSalary());



        Optional<Employee> employee2= employeeList.stream().
                sorted(Comparator.comparingDouble(Employee::getSalary)).findFirst();
        Employee HighestSalary= employee2.get();

        System.out.println(" highest Salary : "+HighestSalary.getSalary());


        //Query 3.10 : How many male and female employees are there in the sales and marketing team?
        System.out.println("Query 3.10 : How many male and female employees are there in the sales and marketing team?\n" +
                "\n");

        Map<String,Long> maleAndFemaleInSales=
                employeeList.stream().filter(emp->emp.getDepartment().equalsIgnoreCase("sales and marketing"))
                        .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));

        System.out.println(maleAndFemaleInSales);
    }


}
