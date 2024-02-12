package edu.pasadena.cs.cs03b;

public class Manager extends Employee{

    @Override
    public String getEmployeeType() {
        return "Manager";
    }

    public String manage() {
        return ("Manager " + getName() + " is managing");
    }
}
