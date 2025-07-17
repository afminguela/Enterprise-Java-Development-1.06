package org.example;
import java.io.*;
import org.example.classes.Employee;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        FileWriter writer = new FileWriter("Employees.txt", true);
        try {
            for (int i = 0; i < 10; i++) {
            try {

                Employee employee = new Employee(
                "Employee" + i,
                "employee" + i + "@example.com",
                30000 + (i * 1000),
                20 + i
            );


                writer.write("Name: " + employee.getName() );
                writer.write(", Email: " + employee.getEmail() );
                writer.write(", Salary: " + employee.getSalary());
                writer.write(", Age: " + employee.getAge() + "\n");
                }
            catch (RuntimeException e) {
                throw new RuntimeException(e);
            }



             }
            writer.close();
            System.out.println("Done!");
        }

        catch (IOException e) {
                throw new RuntimeException(e);
            }



    }
}