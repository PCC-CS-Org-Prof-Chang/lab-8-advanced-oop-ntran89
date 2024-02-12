package edu.pasadena.cs.cs03b;

public class Contractor extends Employee implements Freelancer{
    
    @Override
    public String getEmployeeType() {
        return "Contractor";
    }

    @Override
    public String eat() {
        return ("Contractor " + getName() + " is eating");
    }

    @Override
    public String work() {
        return ("Contractor " + getName() + " is working");
    }

    @Override
    public String sleep() {
        return ("Contractor " + getName() + " is sleeping");
    }
    
    public String contract() {
        return ("Contractor " + getName() + " is contracting");
    }

}
