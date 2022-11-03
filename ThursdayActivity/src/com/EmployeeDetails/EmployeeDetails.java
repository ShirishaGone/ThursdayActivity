package com.EmployeeDetails;


class Member {
	
	    
	    String name;
	    int age;
	    String number;
	    String address;
	    double salary;
	    
	    
	    public void printSalary(){
	      System.out.println(salary);
	    }

	  }

	  class Employee extends Member
	  {
	    String specialization;
	    
	  }

	  class Manager extends Member
	  {
	    String department;
	  }

	  public class EmployeeDetails
	  {
	    public static void main(String[] args)
	    {
	      Employee e = new Employee();
	      e.name = "shireesha";
	      e.age = 23;
	      e.number = "9999999999";
	      e.address = "Hyderebad";
	      e.salary = 50000;
	      e.specialization = "java developer";
	      Manager m= new Manager();
	      m.name="navaneeth";
			m.age=25;
			m.number="99999999999";
			m.address="Hyderabad";
			m.salary=60000;
			m.department="IT";
			
			System.out.println("Employee Name :"+e.name);
			System.out.println("Employee Age :"+e.age);
			System.out.println("Employee Phone Number :"+e.number);
			System.out.println("Employee Address :"+e.address);
			System.out.println("Employee Salary :"+e.salary);
			System.out.println("-----------------------");
			System.out.println("Manager Name :"+m.name);
			System.out.println("Manager Age :"+m.age);
			System.out.println("Manager Phone Number :"+m.number);
			System.out.println("Manager Address :"+m.address);
			System.out.println("Manager Salary :"+m.salary);
	    }
	  }
	    