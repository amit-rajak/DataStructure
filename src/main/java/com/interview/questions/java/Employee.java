package com.interview.questions.java;

public final class Employee {
    private final int id;
    private final String name;
    private final long salary;
    private final Address address;

    public Employee(int id, String name, long salary, Address address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = new Address(
                address.getStreet(),
                address.getCity(),
                address.getState(),
                address.getPostalCode()
        );
    }

    // Provide getters for the employee fields
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }

    public Address getAddress() {
        return new Address(
                address.getStreet(),
                address.getCity(),
                address.getState(),
                address.getPostalCode()
        );
    }
}



/*   Explanation of full code
Certainly! Let's break down the code for the Employee and Address classes and explain why they are designed this way.

Address Class:

The Address class represents the address information of an employee. Here's how it works:

Address is declared as final, which means it cannot be subclassed, ensuring that its behavior remains consistent and cannot be altered by any subclasses.

The class has private final fields for street, city, state, and postalCode, which are the components of an address.

The constructor public Address(String street, String city, String state, String postalCode) is used to initialize an Address object with the provided values for each field.

Getter methods are provided for each field (e.g., getStreet(), getCity(), getState(), getPostalCode()) to allow read-only access to the address components. These getters do not have corresponding setter methods, which makes the class immutable. Once an Address object is created, its state cannot be changed.

Employee Class:

The Employee class represents an employee with various attributes, including their address. Here's how it works:

Similar to the Address class, the Employee class is declared as final, preventing it from being subclassed.

It has private final fields for id, name, salary, and address.

The constructor public Employee(int id, String name, long salary, Address address) is used to initialize an Employee object with the provided values for each field. It also takes an Address object as an argument for the employee's address.

The constructor makes a copy of the Address object by creating a new Address instance using the provided Address object's getter methods. This ensures that the Address object passed to the Employee constructor remains immutable and unaffected by external changes.

Getter methods are provided for each field (e.g., getId(), getName(), getSalary(), getAddress()) to allow read-only access to the employee's attributes. These getters do not have corresponding setter methods, making the Employee class immutable as well. Once an Employee object is created, its state cannot be changed.

The combination of using final for the class declarations, private final fields, and providing only getter methods ensures that both the Employee and Address classes are immutable. Once an instance of these classes is created, its state cannot be modified, which can be beneficial in various scenarios, such as ensuring data integrity and thread safety.





    */