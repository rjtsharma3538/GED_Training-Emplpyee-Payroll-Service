package com.example;

public class EmployeePayroll {

    private int id;
    private String name;
    private double salary;

    public EmployeePayroll(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int get_id() {
        return this.id;
    }

    public String get_name() {
        return this.name;
    }

    public double get_salary() {
        return this.salary;
    }

    @Override   
    public String toString()
    {
        return "id = " + this.id + ", name = " + this.name + ", salary = " + this.salary;
    }
}
