package edu.pasadena.cs.cs03b;

public class Staff extends Employee{
    
    @Override
    public String getEmployeeType() { // This method is from the Employee class returning the type of employee
        return "Staff";
    }

    public String staff() { // This staff method is specific to the Staff class
        return ("Staff " + getName() + " is staffing");
    }
}
