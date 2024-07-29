package com.workintech.developers;

public class MidDeveloper extends Employee{
    public MidDeveloper(int id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(55000);
        System.out.println("MidDeveloper starts to working");
    }
}
