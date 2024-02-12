package edu.pasadena.cs.cs03b;

public abstract class Employee extends Person{

    private int employeeID;

    public abstract String getEmployeeType(); //Abstract method that will be implemented in the employee subclasses

    //Getters and Setters
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    public int getEmployeeID() {
        return employeeID;
    }
    
    @Override
    public void summary() { // This method is from the Person class: Summerizes the employee's information
        System.out.println("Title:" + getTitle());
        System.out.println("Name:" + getName());
        System.out.println("Age:" + getAge());
        System.out.println("Employee ID:" + getEmployeeID());
    }

    public void reportToManager(Manager manager, String report) { // This method is specific to the Employee class and reports to a manager
        manager.addReport(report);
    }
}
