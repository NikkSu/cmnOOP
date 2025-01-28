package org.example;

public class Programmer extends Employee{
 private double salary;

    public Programmer() {

    }

    @Override
    public void work() {
        System.out.println("programmer work's");
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Programmer(int age, String name, double salary) {
       this.setAge(age);
       this.setName(name);
        this.salary = salary;
    }
    public void coding (){
        System.out.println("creating a new program ");
    }
    public void display(){
        System.out.println(getAge()+" лет  зовут - "+getName()+ " и зарабатывает: "+getSalary());
    }
}
