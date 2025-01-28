package org.example;

public class HR extends Employee {

    @Override
    public void work() {
        System.out.println("finding new employee");
    }
    public HR (int age, String name) {
        this.setAge(age);
        this.setName(name);
    }
}
