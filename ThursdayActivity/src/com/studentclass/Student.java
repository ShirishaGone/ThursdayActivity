package com.studentclass;
import java.util.Scanner; 

public class Student {
	String name;
	int age;
	double weight;
	public static int count=0;
	public Student()
	{
	 count++;
	}
	public  void getData()
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter name of student");
		name=s.next();
		
		System.out.println("Enter age of student");
		age=s.nextInt();
		
		System.out.println("Enter weight of student");
		weight=s.nextDouble();			
	}
	public void displayData()
	{
		System.out.println("Name: " +name);
		System.out.println("Age: " +age);
		System.out.println("Weight: " +weight);
	}
	public static int getCount() {
	return count;
	}
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		s1.getData();
		s1.displayData();
		
		System.out.println("Count of Objects: " +s1.getCount());

	}

}
