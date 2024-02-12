package edu.pasadena.cs.cs03b;

public class Staff extends Employee{
    
    @Override
    public String getEmployeeType() {
        return "Staff";
    }

    public String staff() {
        return ("Staff " + getName() + " is staffing");
    }
}
