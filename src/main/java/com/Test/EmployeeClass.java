package com.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeClass {

    String id;
    String name;
    String dign;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDign() {
        return dign;
    }

    public EmployeeClass(String s, String raj, String sr) {
    }


    public static void main(String[] args) {

        List <EmployeeClass>l= new ArrayList();
        l.add(new EmployeeClass("10","RAJ","Sr"));
        l.add(new EmployeeClass("11","Kumar","Ssr"));
        l.add(new EmployeeClass("12","Jitu","SSD"));
        l.add(new EmployeeClass("14","Kumar1","SSD"));

        //l.stream().collect(Collectors.groupingBy(employeeClass -> employeeClass.dign)

        List<Integer> l1= new ArrayList<>();
        l1.add(1);
        l1.add(3);
        l1.add(5);
        l1.add(10);
        l1.add(12);





    }

}
