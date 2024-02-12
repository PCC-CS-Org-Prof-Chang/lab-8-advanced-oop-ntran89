package edu.pasadena.cs.cs03b;
import java.util.ArrayList;
import java.util.List;

public class Employer extends Person {
    
    private Employee[] employees;
    private int employeeCapacity;
    private int currentEmployed;

    public Employer(int employeeCapacity) { // Constructor for the Employer class sets the employee capacity and initializes the employee array
        this.employees = new Employee[employeeCapacity];
        this.employeeCapacity = employeeCapacity;
        this.currentEmployed = 0; // Initially, there are no employees
    }

    public void addEmployee(Employee employee) { // Method to add an employee to the employer's employee array
        if(this.currentEmployed < this.employeeCapacity) { // If there is space for a new employee
            this.employees[this.currentEmployed] = employee;
            this.currentEmployed++;
        } else {
            System.out.println("No more space for new employees");
        }
    }

    //Getters
    public int getEmployeeCapacity() {
        return this.employeeCapacity;
    }

    public int getCurrentEmployed() {
        return this.currentEmployed;
    }

    public Employee[] getEmployees() {
        return this.employees;
    }

    @Override
    public void summary() { // This method is from the Person class: Summerizes the employer's information, and gives all the employees names under the employer
        System.out.println("Title:" + getTitle());
        System.out.println("Name:" + getName());
        System.out.println("Age:" + getAge());
        System.out.println("Employee Capacity:" + getEmployeeCapacity());
        System.out.println("Current Employed:" + getCurrentEmployed());
        for(int i = 0; i < getCurrentEmployed(); i++) {
            System.out.println("Employee " + (i + 1) + " of " + getCurrentEmployed() + ": " + getEmployees()[i].getName());
            
        }
    }
}
