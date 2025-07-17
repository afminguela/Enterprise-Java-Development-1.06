package org.example.classes;

public class Employee {
    private String name;
    private String email;
    private int salary;
    private int age;

    public Employee(String name, String email, int salary, int age) {
        this.name = name;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }

    public Employee(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
