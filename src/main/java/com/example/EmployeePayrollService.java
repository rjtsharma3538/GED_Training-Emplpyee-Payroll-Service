package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {

    private List<EmployeePayroll> employeePayrollList;

    public EmployeePayrollService(){}

    public EmployeePayrollService(List<EmployeePayroll> employeePayrollList)
    {
        this.employeePayrollList = employeePayrollList;
    }
    public static void main(String[] args) {
        ArrayList<EmployeePayroll> employeePayrollsLIst = new ArrayList<>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollsLIst);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(consoleInputReader);
        employeePayrollService.readEmployeePayrollData(consoleInputReader);
        employeePayrollService.writeEmployeePayrollData();

    }

    private void readEmployeePayrollData(Scanner consoleInputReader)
    {
        System.out.println("Enter Employee id : ");
        int id = consoleInputReader.nextInt();

        System.out.println("Enter Employee name : ");
        String name = consoleInputReader.next();        

        System.out.println("Enter Employee Salary");
        double salary = consoleInputReader.nextInt();


        employeePayrollList.add(new EmployeePayroll(id, name, salary));
    }

    private void writeEmployeePayrollData()
    {
        System.out.println(employeePayrollList);
    }
}