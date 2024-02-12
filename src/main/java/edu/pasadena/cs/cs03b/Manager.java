package edu.pasadena.cs.cs03b;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee{ 

    private List<String> reports = new ArrayList<>(); // Creating an ArrayList to store the reports

    public void addReport(String report) { // This method adds a report to the reports list
        reports.add(report);
    }

    @Override
    public String getEmployeeType() { // This method is from the Employee class returning the type of employee
        return "Manager";
    }

    public String manage() { // This manage method is specific to the Manager class
        return ("Manager " + getName() + " is managing");
    }

    public List<String> getReports() { // This method returns the reports list
        return reports;
    }

}
