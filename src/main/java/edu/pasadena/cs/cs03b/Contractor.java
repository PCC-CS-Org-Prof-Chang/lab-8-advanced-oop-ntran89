package edu.pasadena.cs.cs03b;

public class Contractor extends Employee implements Freelancer{
    
    @Override
    public String getEmployeeType() { // This method is from the Employee class returning the type of employee
        return "Contractor";
    }

    @Override
    public String eat() { // This method is from the Freelancer interface
        return ("Contractor " + getName() + " is eating");
    }

    @Override
    public String work() { // This method is from the Freelancer interface
        return ("Contractor " + getName() + " is working");
    }

    @Override
    public String sleep() { // This method is from the Freelancer interface
        return ("Contractor " + getName() + " is sleeping");
    }
    
    public String contract() { // This sontract method is specific to the Contractor class
        return ("Contractor " + getName() + " is contracting");
    }

}
