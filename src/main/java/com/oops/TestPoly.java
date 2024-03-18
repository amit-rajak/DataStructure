package com.oops;

public class TestPoly {
    public static void main(String[] args) {
        Parent p = new Child(); // Instantiate a child

        int num = 0;
        try {
            num = 1;
        } catch (Exception e) {
            num = 2;

        } finally {
            num = 3;
            System.out.println(num);
        }
        System.out.println(num); // Output: 3
    }
}

class Parent {
    public Parent() {
        super();
        System.out.println("Instantiate a parent");
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("Instantiate a child");
    }
}
