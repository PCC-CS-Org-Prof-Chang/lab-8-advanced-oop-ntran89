package edu.pasadena.cs.cs03b;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

// TODO: implement additional Test Classes for each class in the project
public class TestCorporateAmerica {

   @Test
   public void testCompanyName()
   {
      // create an instance of the class
      CorporateAmerica c = new CorporateAmerica();
      
      // action
      c.setCompanyName("Dummy Company");
      String strResult = c.getCompanyName();
      // assertion
      assertEquals("Dummy Company", strResult);

      // TODO: add more test cases for all public instance methods
      Manager p = new Manager();
      p.setName("John");
      p.setAge(25);
      p.setTitle("Mr");
      p.setEmployeeID(1);
      assertEquals("Manager", p.getEmployeeType());
      assertEquals("John", p.getName());
      assertEquals(25, p.getAge());
      assertEquals("Mr", p.getTitle());
      assertEquals("Manager John is managing", p.manage());

      Staff s = new Staff();
      s.setName("John");
      s.setAge(25);
      s.setTitle("Mr");
      s.setEmployeeID(1);
      assertEquals("Staff", s.getEmployeeType());
      assertEquals("John", s.getName());
      assertEquals(25, s.getAge());
      assertEquals("Mr", s.getTitle());
      assertEquals("Staff John is staffing", s.staff());

      Contractor co = new Contractor();
      co.setName("John");
      co.setAge(25);
      co.setTitle("Mr");
      co.setEmployeeID(1);
      assertEquals("Contractor", co.getEmployeeType());
      assertEquals("John", co.getName());
      assertEquals(25, co.getAge());
      assertEquals("Mr", co.getTitle());
      assertEquals("Contractor John is contracting", co.contract());
      assertEquals("Contractor John is eating", co.eat());
      assertEquals("Contractor John is sleeping", co.sleep());
      assertEquals("Contractor John is working", co.work());

      Employer e = new Employer(3);
      e.setName("John");
      e.setAge(25);
      e.setTitle("Mr");
      assertEquals(0, e.getCurrentEmployed());
      e.addEmployee(p);
      assertEquals(1, e.getCurrentEmployed());
      e.addEmployee(s);
      assertEquals(2, e.getCurrentEmployed());
      e.addEmployee(co);
      assertEquals(3, e.getCurrentEmployed());
      assertEquals(3, e.getEmployeeCapacity());

      s.reportToManager(p, "I am reporting to you");
      assertEquals("I am reporting to you", p.getReports().get(0));

   }
}
