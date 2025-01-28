package org.example;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];

        employees[0] = new Programmer(19, "Nikita",100);
        employees[1] = new HR(22,"Sasha");

        for (Employee employee : employees) {
            employee.work();
            
        }
    }
}