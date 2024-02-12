package edu.pasadena.cs.cs03b;

import java.util.ArrayList;
import java.util.List;

public class CorporateAmerica {

   private String companyName;
   private Employer employer;

   // setter and getter methods for companyName
   public void setCompanyName(String companyName) {
      this.companyName = companyName;
   }

   public String getCompanyName() {
      return this.companyName;
   }

   // setter and getter methods for employer
   public void setEmployer(Employer employer) {
      this.employer = employer;
   }

   public Employer getEmployer() {
      return this.employer;
   }

    public static void main(String [] args) {
 
       // Create the manager, staff, contractor objects and manage the association of employer and employees
      Manager manager = new Manager();
      Staff staff = new Staff();
      Contractor contractor = new Contractor();
      CorporateAmerica company = new CorporateAmerica();
      Employer employer = new Employer(3); // Creates a new employer with an employee limit of 3
      

       // Load data into the objects 
      
      company.setCompanyName("AVAJ"); // Set the company name
      
      manager.setTitle("Manager"); // Set the title of the manager
      manager.setName("Nick"); // Set the name of the manager
      manager.setAge(40); // Set the age of the manager
      manager.setEmployeeID(1); // Set the employee ID of the manager

      staff.setTitle("Staff"); // Set the title of the staff
      staff.setName("Sean"); // Set the name of the staff
      staff.setAge(30); // Set the age of the staff
      staff.setEmployeeID(2); // Set the employee ID of the staff

      contractor.setTitle("Contractor"); // Set the title of the contractor
      contractor.setName("Brandon"); // Set the name of the contractor
      contractor.setAge(25); // Set the age of the contractor
      contractor.setEmployeeID(3); // Set the employee ID of the contractor

      employer.setTitle("Employer"); // Set the title of the employer
      employer.setName("Kris"); // Set the name of the employer
      employer.setAge(60); // Set the age of the employer
      employer.addEmployee(manager); // Add the manager to the employer
      employer.addEmployee(staff); // Add the staff to the employer
      employer.addEmployee(contractor); // Add the contractor to the employer
      
      company.setEmployer(employer); // Set the employer of the company

       // Print the objects info
      System.out.println("Company Name: " + company.getCompanyName());
      System.out.println("Employers: " + company.employer.getName());
      System.out.println();

      manager.summary(); // Print the manager info
      System.out.println();

      staff.summary(); // Print the staff info
      System.out.println();

      contractor.summary(); // Print the contractor info
      System.out.println();

      employer.summary(); // Print the employer info and who is employed
      System.out.println();

    } 
 } 