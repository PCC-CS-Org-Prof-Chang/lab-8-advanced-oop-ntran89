package edu.pasadena.cs.cs03b;

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

   public void setEmployer(Employer employer) {
      this.employer = employer;
   }

    public static void main(String [] args) {
 
       // Create the manager, staff, contractor objects and manage the association of employer and employees
      
      Manager manager = new Manager();
      
      Staff staff = new Staff();

      Contractor contractor = new Contractor();

      CorporateAmerica company = new CorporateAmerica();
      company.setCompanyName("AVAJ");

      Employer employer = new Employer(3);
      

       // Load data into the objects 
      manager.setTitle("Manager");
      manager.setName("Nick");
      manager.setAge(40);
      manager.setEmployeeID(1);

      staff.setTitle("Staff");
      staff.setName("Sean");
      staff.setAge(30);
      staff.setEmployeeID(2);

      contractor.setTitle("Contractor");
      contractor.setName("Brandon");
      contractor.setAge(25);
      contractor.setEmployeeID(3);

      employer.setTitle("Employer");
      employer.setName("Kris");
      employer.setAge(60);
      employer.addEmployee(manager);
      employer.addEmployee(staff);
      employer.addEmployee(contractor);
      
      company.setEmployer(employer);
       // Print the objects info

      System.out.println("Company Name: " + company.getCompanyName());
      System.out.println("Employers: " + company.employer.getName());
      System.out.println();

      manager.summary();
      System.out.println();

      staff.summary();
      System.out.println();

      contractor.summary();
      System.out.println();

      employer.summary();
      System.out.println();

    } 
 } 