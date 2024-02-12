package edu.pasadena.cs.cs03b;

public abstract class Employee extends Person{

    private int employeeID;

    public abstract String getEmployeeType();

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    public int getEmployeeID() {
        return employeeID;
    }
    
    @Override
    public void summary() {
        System.out.println("Title:" + getTitle());
        System.out.println("Name:" + getName());
        System.out.println("Age:" + getAge());
        System.out.println("Employee ID:" + getEmployeeID());
    }
}
