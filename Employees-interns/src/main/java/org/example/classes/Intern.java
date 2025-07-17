package org.example.classes;

public class Intern extends Employee {

    private final int MAXSALARY = 20000;


    public Intern(String name, String email, int salary, int age) {
        super(name,email,age);
        setSalary(salary);

    }

    @Override
    public void setSalary(int salary) {
        if (salary > MAXSALARY) {
            System.out.println("Intern salary cannot exceed " + MAXSALARY);
        } else {
            super.setSalary(salary);
        }
    }
}
