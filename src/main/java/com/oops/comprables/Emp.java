package com.oops.comprables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public  class Emp implements Comparable<Emp> {
    private String name;
    private int age;

    public Emp(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
        public int compareTo(Emp other) {
               return (this.getAge()-this.age);
        }


    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + '}';
    }
    public static void main(String[] args) {
        List<Emp> employees = new ArrayList<>();
        employees.add(new Emp("John", 25));
        employees.add(new Emp("Jane", 30));
        employees.add(new Emp("Doe", 22));
        employees.add(new Emp("Aoe", 22));

        //Collections.sort(employees);
        employees.forEach(System.out::println);
    }


}
