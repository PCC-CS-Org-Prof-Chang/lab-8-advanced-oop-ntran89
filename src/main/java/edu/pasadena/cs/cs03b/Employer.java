package edu.pasadena.cs.cs03b;

public class Employer extends Person {
    
    private Employee[] employees;
    private int employeeCapacity;
    private int currentEmployed;

    public Employer(int employeeCapacity) {
        this.employees = new Employee[employeeCapacity];
        this.employeeCapacity = employeeCapacity;
        this.currentEmployed = 0; // Initially, there are no employees
    }

    public void addEmployee(Employee employee) {
        if(this.currentEmployed < this.employeeCapacity) {
            this.employees[this.currentEmployed] = employee;
            this.currentEmployed++;
        } else {
            System.out.println("No more space for new employees");
        }
    }

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
    public void summary() {
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
